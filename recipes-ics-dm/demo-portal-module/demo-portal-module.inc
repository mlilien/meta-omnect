FILESEXTRAPATHS:prepend := "${LAYERDIR_ics_dm}/files:"

SRC_URI += "\
  file://iot-identity-service-keyd.template.toml \
  file://iot-identity-service-identityd.template.toml \
"

# overwrite LICENSE and LIC_FILES_CHKSUM from cargo-bitbake generated recipe
LICENSE = "MIT | Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE-APACHE;md5=650e893673eb59696f3d4ee64f6d2357 \
    file://LICENSE-MIT;md5=6340606a960b1965e521043f21f8d1bb \
"

DEPENDS += "\
    azure-iot-sdk-c\
"
RDEPENDS:${PN} += "\
    ca-certificates\
    iot-identity-service\
"
inherit aziot systemd

do_compile:prepend() {
    # - for now we use git to fetch the repo instead of cargo itself
    #   (cargo fetcher can not handle git repos via ssh)
    # - @ToDo rm as soon the repo is public
    export CARGO_NET_GIT_FETCH_WITH_CLI=true

    export LLVM_CONFIG_PATH="${STAGING_LIBDIR_NATIVE}/llvm-rust/bin/llvm-config"
    export BINDGEN_EXTRA_CLANG_ARGS="${TUNE_CCARGS}"

    export LIB_PATH_AZURESDK=${STAGING_DIR_TARGET}/usr/
    export LIB_PATH_UUID=${STAGING_DIR_TARGET}/usr/
    export LIB_PATH_OPENSSL=${STAGING_DIR_TARGET}/usr/
    export LIB_PATH_CURL=${STAGING_DIR_TARGET}/usr/
}

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${S}/systemd/demo-portal-module.service ${D}${systemd_system_unitdir}/demo-portal-module.service
    install -m 0644 ${S}/systemd/demo-portal-module.timer ${D}${systemd_system_unitdir}/demo-portal-module.timer
    install -m 0644 ${S}/systemd/demo-portal-factory-reset.service ${D}${systemd_system_unitdir}/demo-portal-factory-reset.service
    install -m 0644 ${S}/systemd/demo-portal-factory-reset.path ${D}${systemd_system_unitdir}/demo-portal-factory-reset.path
    install -m 755 ${S}/script/factory_reset.sh ${D}${bindir}/

    # allow demo-portal-module access to device_id secret created by manual provisioning
    install -m 0600 -o aziotks -g aziotks ${WORKDIR}/iot-identity-service-keyd.template.toml ${D}${sysconfdir}/aziot/keyd/config.d/demo-portal-module.toml

    # allow demo-portal-module provisioning via module identity
    install -m 0600 -o aziotid -g aziotid ${WORKDIR}/iot-identity-service-identityd.template.toml ${D}${sysconfdir}/aziot/identityd/config.d/demo-portal-module.toml
}

pkg_postinst:${PN}() {
    sed -i "s/@@UID@@/$(id -u demo-portal)/"                                           $D${sysconfdir}/aziot/keyd/config.d/demo-portal-module.toml
    sed -i -e "s/@@UID@@/$(id -u demo-portal)/" -e "s/@@NAME@@/demo-portal-module/"    $D${sysconfdir}/aziot/identityd/config.d/demo-portal-module.toml
}

SYSTEMD_SERVICE:${PN} = "demo-portal-module.service demo-portal-module.timer demo-portal-factory-reset.path"

FILES:${PN} += "\
    ${systemd_system_unitdir}/demo-portal-factory-reset.service \
    ${bindir}/factory_reset.sh \
"

GROUPADD_PARAM:${PN} += " \
  -r demo-portal; \
  -r factory_reset; \
  -r disk; \
"

USERADD_PARAM:${PN} += "--no-create-home -r -s /bin/false -G aziotcs,aziotid,aziotks,factory_reset,disk -g demo-portal demo-portal;"
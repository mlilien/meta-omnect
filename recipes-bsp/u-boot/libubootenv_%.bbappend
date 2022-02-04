# fw_setenv calls fsync() in the case of changed u-boot environment
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "\
    file://always-fsync-file-writes.patch \
"

DEPENDS += "u-boot-default-script"
inherit ics_dm_fw_env_config

do_install_append() {
    ics_dm_generate_fw_env_config
}
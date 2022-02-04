SRC_URI += "\
    file://ics_dm_get_deviceid.sh \
    file://wifi-commissioning-gatt@.service \
"


DEPENDS += "dbus"
RDEPENDS:${PN} += "bash bluez5 (>=5.60) toml-cli wpa-supplicant"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/wifi-commissioning-gatt@.service ${D}${systemd_system_unitdir}/
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/ics_dm_get_deviceid.sh ${D}${bindir}/ics_dm_get_deviceid.sh
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
    lnr ${D}${systemd_system_unitdir}/wifi-commissioning-gatt@.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wifi-commissioning-gatt@${ICS_DM_WLAN0}.service
}

FILES:${PN} += "\
    ${bindir}/ics_dm_get_deviceid.sh \
    ${systemd_system_unitdir}/wifi-commissioning-gatt@.service \
"
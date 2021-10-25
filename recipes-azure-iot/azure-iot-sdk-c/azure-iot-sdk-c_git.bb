DESCRIPTION = "Microsoft Azure IoT SDKs and libraries for C"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-iot-sdk-c"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4283671594edec4c13aeb073c219237a"

SRC_URI = "gitsm://github.com/Azure/azure-iot-sdk-c.git;tag=LTS_07_2021_Ref01;nobranch=1"

S = "${WORKDIR}/git"

# util-linux for uuid-dev
DEPENDS = "util-linux curl openssl"

inherit cmake

EXTRA_OECMAKE += "-Dskip_samples:BOOL=ON"

# fix compilation of iot-hub-device-update, iot-module-template which depend on azure-iot-sdk-c
do_configure_prepend() {
   sed -i 's/${OPENSSL_LIBRARIES}/crypto ssl/g' ${S}/c-utility/CMakeLists.txt
   sed -i 's/${CURL_LIBRARIES}/curl/g' ${S}/c-utility/CMakeLists.txt
}

sysroot_stage_all_append () {
    sysroot_stage_dir ${D}${exec_prefix}/cmake ${SYSROOT_DESTDIR}${exec_prefix}/cmake
}

FILES_${PN}-dev += "${exec_prefix}/cmake"

BBCLASSEXTEND = "native nativesdk"
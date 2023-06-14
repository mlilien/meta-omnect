# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get omnect-device-service could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/omnect-device-service/0.11.1"
SRC_URI += "git://git@github.com/omnect/omnect-device-service.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "f29f4618873409fd4fedaa4c876c08960e6ab222"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anyhow/1.0.71 \
    crate://crates.io/async-broadcast/0.5.1 \
    crate://crates.io/async-channel/1.8.0 \
    crate://crates.io/async-executor/1.5.1 \
    crate://crates.io/async-fs/1.6.0 \
    crate://crates.io/async-io/1.13.0 \
    crate://crates.io/async-lock/2.7.0 \
    crate://crates.io/async-process/1.7.0 \
    crate://crates.io/async-recursion/1.0.4 \
    crate://crates.io/async-task/4.4.0 \
    crate://crates.io/async-trait/0.1.68 \
    crate://crates.io/atomic-waker/1.1.1 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/bindgen/0.63.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/blocking/1.3.1 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.26 \
    crate://crates.io/clang-sys/1.6.1 \
    crate://crates.io/concurrent-queue/2.2.0 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/cp_r/0.5.1 \
    crate://crates.io/cpufeatures/0.2.7 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-utils/0.8.15 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/darling/0.20.1 \
    crate://crates.io/darling_core/0.20.1 \
    crate://crates.io/darling_macro/0.20.1 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/dotenvy/0.15.7 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/enum_dispatch/0.3.11 \
    crate://crates.io/enumflags2/0.7.7 \
    crate://crates.io/enumflags2_derive/0.7.7 \
    crate://crates.io/env_logger/0.8.4 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/filetime/0.2.21 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.2.0 \
    crate://crates.io/fsevent-sys/4.1.0 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-lite/1.13.0 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/futures/0.3.28 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/gimli/0.27.2 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/h2/0.3.19 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.8 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.9 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-openssl/0.9.2 \
    crate://crates.io/hyper-proxy/0.9.1 \
    crate://crates.io/hyper-timeout/0.4.1 \
    crate://crates.io/hyper/0.14.26 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.57 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.4.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.9.6 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/iptables/0.5.0 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/js-sys/0.3.63 \
    crate://crates.io/kqueue-sys/1.0.3 \
    crate://crates.io/kqueue/1.0.7 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.146 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linked_hash_set/0.1.4 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/lock_api/0.4.10 \
    crate://crates.io/log-panics/2.1.0 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/mio/0.8.8 \
    crate://crates.io/network-interface/0.1.6 \
    crate://crates.io/nix/0.23.2 \
    crate://crates.io/nix/0.24.3 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/notify-debouncer-mini/0.3.0 \
    crate://crates.io/notify/6.0.0 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/object/0.30.4 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-sys/0.9.88 \
    crate://crates.io/openssl/0.10.54 \
    crate://crates.io/ordered-stream/0.2.0 \
    crate://crates.io/parking/2.1.0 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.8 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/2.3.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/polling/2.8.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro2/1.0.60 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/regex-syntax/0.7.2 \
    crate://crates.io/regex/1.8.4 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustix/0.37.20 \
    crate://crates.io/rustversion/1.0.12 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/sd-notify/0.4.1 \
    crate://crates.io/serde/1.0.164 \
    crate://crates.io/serde_derive/1.0.164 \
    crate://crates.io/serde_json/1.0.96 \
    crate://crates.io/serde_repr/0.1.12 \
    crate://crates.io/serde_with/2.3.3 \
    crate://crates.io/serde_with_macros/2.3.3 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/signal-hook/0.3.15 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/stdext/0.3.1 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strum/0.24.1 \
    crate://crates.io/strum_macros/0.24.3 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.18 \
    crate://crates.io/systemd-zbus/0.1.0 \
    crate://crates.io/tempfile/3.6.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.7 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/time/0.3.19 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-io-timeout/1.2.0 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio-openssl/0.6.3 \
    crate://crates.io/tokio-util/0.7.8 \
    crate://crates.io/tokio/1.28.2 \
    crate://crates.io/toml_datetime/0.6.1 \
    crate://crates.io/toml_edit/0.19.8 \
    crate://crates.io/tower-layer/0.3.2 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.24 \
    crate://crates.io/tracing-core/0.1.31 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/uds_windows/1.0.2 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/url/2.4.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.86 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.86 \
    crate://crates.io/wasm-bindgen-macro/0.2.86 \
    crate://crates.io/wasm-bindgen-shared/0.2.86 \
    crate://crates.io/wasm-bindgen/0.2.86 \
    crate://crates.io/which/4.4.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/winnow/0.4.1 \
    crate://crates.io/xdg-home/1.0.0 \
    crate://crates.io/zbus/3.13.1 \
    crate://crates.io/zbus_macros/3.13.1 \
    crate://crates.io/zbus_names/2.5.1 \
    crate://crates.io/zvariant/3.14.0 \
    crate://crates.io/zvariant_derive/3.14.0 \
    crate://crates.io/zvariant_utils/1.0.1 \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-cert-client-async;destsuffix=aziot-cert-client-async \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-cert-common-http;destsuffix=aziot-cert-common-http \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-cert-common;destsuffix=aziot-cert-common \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-certd-config;destsuffix=aziot-certd-config \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-identity-client-async;destsuffix=aziot-identity-client-async \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-identity-common-http;destsuffix=aziot-identity-common-http \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-identity-common;destsuffix=aziot-identity-common \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-identityd-config;destsuffix=aziot-identityd-config \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-key-client-async;destsuffix=aziot-key-client-async \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-key-common-http;destsuffix=aziot-key-common-http \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-key-common;destsuffix=aziot-key-common \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=aziot-keyd-config;destsuffix=aziot-keyd-config \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=cert-renewal;destsuffix=cert-renewal \
    git://git@github.com/Azure/iot-identity-service.git;protocol=https;nobranch=1;name=http-common;destsuffix=http-common \
    git://git@github.com/omnect/azure-iot-sdk-sys.git;protocol=ssh;nobranch=1;name=azure-iot-sdk-sys;destsuffix=azure-iot-sdk-sys \
    git://git@github.com/omnect/azure-iot-sdk.git;protocol=ssh;nobranch=1;name=azure-iot-sdk;destsuffix=azure-iot-sdk \
    git://git@github.com/omnect/eis-utils.git;protocol=ssh;nobranch=1;name=eis-utils;destsuffix=eis-utils \
"

SRCREV_FORMAT .= "_aziot-cert-client-async"
SRCREV_aziot-cert-client-async = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-cert-client-async"
SRCREV_FORMAT .= "_aziot-cert-common"
SRCREV_aziot-cert-common = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-cert-common"
SRCREV_FORMAT .= "_aziot-cert-common-http"
SRCREV_aziot-cert-common-http = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-cert-common-http"
SRCREV_FORMAT .= "_aziot-certd-config"
SRCREV_aziot-certd-config = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-certd-config"
SRCREV_FORMAT .= "_aziot-identity-client-async"
SRCREV_aziot-identity-client-async = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-identity-client-async"
SRCREV_FORMAT .= "_aziot-identity-common"
SRCREV_aziot-identity-common = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-identity-common"
SRCREV_FORMAT .= "_aziot-identity-common-http"
SRCREV_aziot-identity-common-http = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-identity-common-http"
SRCREV_FORMAT .= "_aziot-identityd-config"
SRCREV_aziot-identityd-config = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-identityd-config"
SRCREV_FORMAT .= "_aziot-key-client-async"
SRCREV_aziot-key-client-async = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-key-client-async"
SRCREV_FORMAT .= "_aziot-key-common"
SRCREV_aziot-key-common = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-key-common"
SRCREV_FORMAT .= "_aziot-key-common-http"
SRCREV_aziot-key-common-http = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-key-common-http"
SRCREV_FORMAT .= "_aziot-keyd-config"
SRCREV_aziot-keyd-config = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/aziot-keyd-config"
SRCREV_FORMAT .= "_azure-iot-sdk"
SRCREV_azure-iot-sdk = "0.9.4"
EXTRA_OECARGO_PATHS += "${WORKDIR}/azure-iot-sdk"
SRCREV_FORMAT .= "_azure-iot-sdk-sys"
SRCREV_azure-iot-sdk-sys = "0.5.8"
EXTRA_OECARGO_PATHS += "${WORKDIR}/azure-iot-sdk-sys"
SRCREV_FORMAT .= "_cert-renewal"
SRCREV_cert-renewal = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/cert-renewal"
SRCREV_FORMAT .= "_eis-utils"
SRCREV_eis-utils = "0.2.6"
EXTRA_OECARGO_PATHS += "${WORKDIR}/eis-utils"
SRCREV_FORMAT .= "_http-common"
SRCREV_http-common = "1.4.1"
EXTRA_OECARGO_PATHS += "${WORKDIR}/http-common"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://MIT OR Apache-2.0;md5=generateme \
"

SUMMARY = "This service allows remote features like: user fw update consent, factory reset, network adapter status and reboot."
HOMEPAGE = "git@github.com:omnect/omnect-device-service.git"
LICENSE = "MIT OR Apache-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include omnect-device-service-${PV}.inc
include omnect-device-service.inc
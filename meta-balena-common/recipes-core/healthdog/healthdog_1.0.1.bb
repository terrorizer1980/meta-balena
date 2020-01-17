# Auto-Generated by cargo-bitbake 0.3.12
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get healthdog could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/healthdog/1.0.1"
SRC_URI += "git://github.com/balena-os/healthdog-rs.git;protocol=https;nobranch=1"
SRCREV = "04f6180d6711e9fb0171432a822867a0f2100455"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/cc/1.0.46 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cstr-argument/0.0.2 \
    crate://crates.io/errno-dragonfly/0.1.1 \
    crate://crates.io/errno/0.2.4 \
    crate://crates.io/exec/0.3.1 \
    crate://crates.io/gcc/0.3.55 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/libc/0.2.65 \
    crate://crates.io/libsystemd-sys/0.2.2 \
    crate://crates.io/log/0.4.8 \
    crate://crates.io/memchr/1.0.2 \
    crate://crates.io/nix/0.15.0 \
    crate://crates.io/pkg-config/0.3.16 \
    crate://crates.io/systemd/0.4.0 \
    crate://crates.io/unicode-width/0.1.6 \
    crate://crates.io/utf8-cstr/0.1.6 \
    crate://crates.io/void/1.0.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.8 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=3bfd34238ccc26128aef96796a8bbf97 \
"

SUMMARY = "Helper program that connects external periodic heathchecks with systemd's watchdog support"
HOMEPAGE = "https://github.com/resin-os/healthdog-rs.git"
LICENSE = "Apache-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include healthdog-${PV}.inc
include healthdog.inc

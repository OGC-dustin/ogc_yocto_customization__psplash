SUMMARY = "psplash overrides"
DESCRIPTION ="this recipe provides overrides for psplash image variables"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM="file://COPYING;md5=1ef68d7e526c164e11da8965fdbed52c"

# Overide MACHINE_PSPLASH_PKG names that might be available in machine specific layers
MACHINE_PSPLASH_PKG:qemuall = "default"
MACHINE_PSPLASH_PKG:qemux86-64 = "default"
MACHINE_PSPLASH_PKG:rpi = "raspberrypi"

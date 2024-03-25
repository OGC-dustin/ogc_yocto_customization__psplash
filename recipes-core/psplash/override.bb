SUMMARY = "psplash overrides"
DESCRIPTION ="this recipe provides overrides for psplash image variables"

# Overide MACHINE_PSPLASH_PKG names that might be available in machine specific layers
MACHINE_PSPLASH_PKG:qemuall = "default"
MACHINE_PSPLASH_PKG:qemux86-64 = "default"
MACHINE_PSPLASH_PKG:rpi = "raspberrypi"

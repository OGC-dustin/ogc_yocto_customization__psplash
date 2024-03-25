SUMMARY = "customize boot time splash image"
DESCRIPTION = "customize boot time splash image"
LICENSE = "MIT"

python do_display_banner() {
    bb.plain("********************************************************");
    bb.plain("*                                                      *");
    bb.plain("*  OGC.Engineering - ogc_yocto_customization__psplash  *");
    bb.plain("*         Setting Custom psplash image                 *");
    bb.plain("*                                                      *");
    bb.plain("********************************************************");
}

addtask display_banner before do_build

# point to the folder with image information
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# change the psplash image
# ":forcevariable" option overwrites any machine specific override
SPLASH_IMAGES:forcevariable = "file://my-custom-image.png;outsuffix=default"

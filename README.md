# OGC.Engineering
### ogc_yocto_customization__hostname - customizing a target image's hostname
developer contact - dustin ( at ) ogc.engineering

---

## Purpose
* This README file contains information on the contents of the ogc-yocto-hostname layer.
* Please see the corresponding sections below for details.

## Dependencies
* URI: Yocto Poky https://git.yoctoproject.org/poky/
* branch: kirkstone

## Patches
* Please submit any patches against the ogc-yocto-hostname layer to the maintainer:
* Maintainer: Dustin <dustin@ogc.engineering>

## Table of Contents
```
  I. Adding the ogc-yocto-hostname layer to your build
 II. Misc
```

## I. Adding the ogc-yocto-hostname layer to your build
* Run 'bitbake-layers add-layer ogc-yocto-hostname'

## II. Misc
* Edit the base-files_%.bbappend hostname variable following notes within the recipe to customize the hostname

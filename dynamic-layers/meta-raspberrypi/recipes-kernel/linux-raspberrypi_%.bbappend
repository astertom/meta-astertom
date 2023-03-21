FILESEXTRAPATHS:prepend := "${THISDIR}/linux-raspberrypi:"
SRC_URI:append = " file://logo_linux_clut224.ppm"

COMPATIBLE_MACHINE = "^rpi$"

do_configure:prepend() {
    # logo support, if you supply logo_linux_clut224.ppm in SRC_URI, then it's going to be used
    if [ -e ${WORKDIR}/logo_linux_clut224.ppm ]; then
        install -m 0644 ${WORKDIR}/logo_linux_clut224.ppm ${S}/drivers/video/logo/logo_linux_clut224.ppm
    fi
}

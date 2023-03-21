SUMMARY = "Console base Astertom image"
HOMEPAGE = "https://astertom.pl"

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "pl-pl"

inherit core-image

CORE_OS_PACKAGES = " \
    alsa-plugins \
    alsa-utils \
    ca-certificates \
    kernel-modules \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    packagegroup-core-full-cmdline \
    tzdata \
"
IMAGE_EXTRA_LIBS = " \
    zlib \
    icu \
    libsqlite3 \
    libusb1 \
    libgpiod \
    libgpiodcxx \
"
IMAGE_CORE_FONTS = " \
    fontconfig \
    fontconfig-utils \
    freetype \
    packagegroup-fonts-truetype \
"
IMAGE_CORE_TOOLS = " \
    bzip2 \
    dosfstools \
    findutils \
    i2c-tools \
    nano \
    mc \
    procps \
    sysfsutils \
    unzip \
    util-linux \
    zip \
    usbutils \
    htop \
"
WIFI_SUPPORT = " \
    crda \
    iw \
    wpa-supplicant \
"

IMAGE_INSTALL += " \
    ${CORE_OS_PACKAGES} \
    ${IMAGE_EXTRA_LIBS} \
    ${IMAGE_CORE_FONTS} \
    ${IMAGE_CORE_TOOLS} \
    ${WIFI_SUPPORT} \
"

set_local_timezone() {
    ln -sf /usr/share/zoneinfo/Europe/Warsaw ${IMAGE_ROOTFS}/etc/localtime
}

ROOTFS_POSTPROCESS_COMMAND += " \
    set_local_timezone ; \
"
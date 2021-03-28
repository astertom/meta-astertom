ICECC_PARALLEL_MAKE = "-j 20"
INHERIT += "icecc"
ICECC_USER_CLASS_BL += "native nativesdk"
ICECC_USER_PACKAGE_BL += " \
    libunistring \
    gnutls \
    coreutils \
    m4 \
    wget \
    nano \
    findutils \
    gdb \
    pixman \
    patch \
    sed \
    gzip \
    grep \
    diffutils \
    cpio \
    tar \
    gawk \
    pango \
"
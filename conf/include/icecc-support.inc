ICECC_PARALLEL_MAKE = "-j 20"
INHERIT += "icecc"
ICECC_CLASS_DISABLE += "native nativesdk"
ICECC_RECIPE_DISABLE += " \
    coreutils \
    cpio \
    diffutils \
    findutils \
    gawk \
    gdb \
    gnutls \
    grep \
    gzip \
    json-c \
    libunistring \
    m4 \
    nano \
    pango \
    patch \
    pixman \
    sed \
    tar \
    wget \
"

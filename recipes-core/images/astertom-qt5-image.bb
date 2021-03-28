SUMMARY = "Astertom image with qt5 packages"
HOMEPAGE = "http://astertom.pl"
LICENSE = "MIT"

require recipes-core/images/astertom-core-image.bb
inherit populate_sdk_qt5

QT_PKGS = " \
    qtbase \
    qtbase-plugins \
    qttranslations \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtconnectivity \
    qtimageformats \
    qtlocation \
    qtlocation-plugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtscript \
    qtsensors \
    qtsensors-plugins \
    qtsvg \
    qtsvg-plugins \
    qtsystems \
    qtwebsockets \
    qtwebsockets-plugins \
    qtwebsockets-qmlplugins \
    qtwebchannel \
    qtxmlpatterns \
    qtserialbus \
    qtquickcontrols2 \
    qtquickcontrols \
    qtcharts \
    qtdatavis3d \
    qtknx \
    qtmqtt \
    quazip \
    qtserialport \
    qtremoteobjects \
    qtgamepad \
    qtnetworkauth \
    qtopcua \
    qtwebglplugin \
    qtscxml \
"

QT_EXTRAS = " \
    qt3d \
    qt3d-qmlplugins \
    qtgraphicaleffects \
"

QT_WEBENGINE = " \
    qtwebengine \
    qtwebengine-qmlplugins \
"

GST_PKGS = " \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    gstreamer1.0-libav \
    gstreamer1.0-rtsp-server \
"

IMAGE_INSTALL += " \
    ${QT_PKGS} \
    ${QT_EXTRAS} \  
"
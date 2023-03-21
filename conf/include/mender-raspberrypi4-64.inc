# Mender support for raspberry pi 4 64GB SD card

MENDER_FEATURES_ENABLE:append = " mender-uboot mender-image-sd mender-image"
MENDER_FEATURES_DISABLE:append = " mender-grub mender-image-uefi"


MENDER_STORAGE_DEVICE = "/dev/mmcblk0"
MENDER_STORAGE_TOTAL_SIZE_MB = "6144"
#MENDER_STORAGE_TOTAL_SIZE_MB = "30720"
MENDER_BOOT_PART_SIZE_MB = "64"
#MENDER_DATA_PART_SIZE_MB = "20480"
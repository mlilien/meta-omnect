part --no-table --offset ${OMNECT_PART_OFFSET_UBOOT_ENV1}K --source rawcopy --sourceparams="file=uboot-env.bin"
part --no-table --offset ${OMNECT_PART_OFFSET_UBOOT_ENV2}K --source rawcopy --sourceparams="file=uboot-env.bin"
part --offset ${OMNECT_PART_OFFSET_BOOT}K --fixed-size ${OMNECT_PART_SIZE_BOOT}K --fstype=vfat --label boot --source bootimg-partition --active

include omnect-os.common.wks.inc

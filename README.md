# ![Astertom](images/Astertom-logo-300-71.jpg)

## meta-astertom

Yocto layer for building Astertom distribution for reference boards.

## Supported boards

- raspberrypi4-64

## Dependencies

This layer depends on additional layers:

- [poky](http://git.yoctoproject.org/cgit/cgit.cgi/poky)
- [meta-openembedded](http://git.openembedded.org/meta-openembedded)

Optional:

- [meta-raspberrypi](http://git.yoctoproject.org/cgit.cgi/meta-raspberrypi)

## Environment preparation

### General informations

Before starting building, make sure that all required tools are installed on your host machine. For more informations how to configure your machine visit [Yocto project page](https://yoctoproject.org)

### By ansible playbook

You can use [setup_layser.yml](./setup_layers.yml) [ansible](https://www.ansible.com/) playbook to clone all required layers inside specific directory on your host machine, and set example configuration files: `local.conf` and `bblayers.conf`

To clone all required layers and setup environment run:

```bash
ansbile-playbook -i localhost, -e "clonedir=[path_to_dir]" setup_layers.yml
```

Available variables:

- `clone_dir` (directory where all layers will be cloned and machine specific directories will be created)

Example

```bash
ansbile-playbook -i localhost, -e "clonedir=/home/astertom/yocto" setup_layers.yml
```

### Manual

According to yocto manual:

- Clone all required layers inside some directory
- Clone meta-aster layer inside the same directory
- Create build directory
- Configure `bblayers.conf` file with proper paths
- Configure `local.conf` file according to your need
- For configuration files examples form `examples` directory of this layer can be used

## Building image and sdk

Source environment script

```bash
source [path_to_cloned_layers]/poky/oe-init-build-env [path_to_build_directory]
```

Building default image

```bash
bitbake astertom-core-image
```

Building sdk

```bash
bitbake astertom-core-image -c populate_sdk
```

```Note: All output files are located in default locations inside build directory```

## Additional informations

- By default building process is configured to use [icecream](https://github.com/icecc/icecream) distributed compilation to use more machines to speed up build process. If only one machine will be used comment `INHERIT += "icecc"` line in `local.conf` file from build directory.

- Images only have root user without password (`debug-tweaks` image feature enabled)

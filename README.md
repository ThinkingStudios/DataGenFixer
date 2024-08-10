# DataGenFixer

[![Hosted By: Cloudsmith](https://img.shields.io/badge/OSS%20hosting%20by-cloudsmith-blue?logo=cloudsmith&style=flat-square)](https://cloudsmith.com)

fix datagen doesn’t exit when finished with architectury loom.

## Add in your project

<details>
<summary>Fabric</summary>

```groovy
repositories {
    maven {
        url = "https://dl.cloudsmith.io/public/thinkingstudio/dategenfixer/maven/"
    }
}

dependencies {
    modImplementation "org.thinkingstudio.datagenfixer:datagenfix-fabric:0.1.0+mc1.21"
}
```
</details>

<details>
<summary>NeoForge</summary>

```groovy
repositories {
    maven {
        url = "https://dl.cloudsmith.io/public/thinkingstudio/dategenfixer/maven/"
    }
}

dependencies {
    modImplementation "org.thinkingstudio.datagenfixer:datagenfix-neo:0.1.0+mc1.21"
}
```
</details>


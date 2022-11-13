plugins {
    kotlin("jvm")
    id("pl.allegro.tech.build.axion-release") version "1.14.0"
}
scmVersion {
    tag {
        prefix.set("module3")
    }
}
project.version = scmVersion.version
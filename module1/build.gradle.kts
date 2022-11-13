plugins {
    kotlin("jvm")
    id("pl.allegro.tech.build.axion-release") version "1.14.0"
}
scmVersion {
    tag {
        prefix.set("module1")
    }
}

project.version = scmVersion.version

dependencies {
    implementation(project(":module3"))
}
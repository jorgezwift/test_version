plugins {
    kotlin("jvm")
    id("pl.allegro.tech.build.axion-release") version "1.14.0"
}

project.version = scmVersion.version

dependencies {
    implementation(project(":module3"))
}
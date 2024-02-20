plugins {
    kotlin("jvm") version "1.8.0"
    id("io.kotest.multiplatform") version "5.5.4" // Kotest 버전
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("io.kotest:kotest-runner-junit5:5.5.4")
    testImplementation("com.github.atomictest:atomictest:0.24")
}

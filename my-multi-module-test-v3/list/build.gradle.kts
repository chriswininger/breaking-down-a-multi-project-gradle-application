plugins {
  kotlin("jvm") version "1.5.30"
  `kotlin-dsl`
  `java-library`
}

repositories {
  mavenCentral()
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}

plugins {
  kotlin("jvm") version "1.5.30"
  `kotlin-dsl`
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  // wrapping this in api means that if something depends on utilities it will also pull in list
  api(project(":list"))
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}

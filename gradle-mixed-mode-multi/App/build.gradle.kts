plugins {
  kotlin("jvm") version "1.9.22"
  application
}

dependencies {
  implementation(project(":MusicService"))
}

application {
  mainClass.set("com.chriswininger.music.cli.AppKt")
}
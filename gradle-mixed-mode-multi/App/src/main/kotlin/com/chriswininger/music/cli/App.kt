package com.chriswininger.music.cli

import com.chriswininger.musicservice.MusicCollectionService

fun main() {
  val musicCollectionService = MusicCollectionService()

  print("Here is a list of all your fantastic music:\n\n")
  musicCollectionService.collection.forEach {
    println("   \uD83C\uDFB5 $it")
  }
}

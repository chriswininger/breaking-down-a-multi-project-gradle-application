package com.chriswininger.musicservice;

import java.util.List;

import com.google.common.collect.Lists;

public class MusicCollectionService {
  public List<String> getCollection() {
    return Lists.newArrayList(
        "jingle-bells.mp3",
        "it-really-kicks-the-llamas-ass.mp3",
        "chumbawamba.mp3",
        "creed.wav.exe"
    );
  }
}

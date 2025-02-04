package edu.unisabana.dyas.patterns.utils;

// Interfaz base del reproductor de audio
public interface AudioPlayer {
    void play(String audioType, String fileName);
    void stop();
}

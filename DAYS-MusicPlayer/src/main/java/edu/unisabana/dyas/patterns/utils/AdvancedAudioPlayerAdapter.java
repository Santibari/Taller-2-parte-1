package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            advancedAudioPlayer.playAdvanced(audioType, fileName);
        } else {
            System.out.println("Formato no soportado por el adaptador: " + audioType);
        }
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo la reproducción en AdvancedAudioPlayer.");
    }
}

package it.hilel.homework18;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicGenres = {new PopMusic(), new RockMusic(), new ClassicMusic()};
        for (MusicStyles x : musicGenres) {
            x.playMusic();
        }
    }
}

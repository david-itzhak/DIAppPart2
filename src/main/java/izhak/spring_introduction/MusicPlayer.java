package izhak.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired // if delete this annotation app still work. Why?
    public MusicPlayer(
            @Qualifier("classicalMusic") Music music1,
            @Qualifier("rockMusic") Music music2,
            @Qualifier("jazz") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusicList(MusicGenre genre) {
        switch(genre){
            case CLASSIC: return "Playing: " + playRandomSong(music1.getSongs());
            case ROCK: return "Playing: " + playRandomSong(music2.getSongs());
            case JAZZ: return "Playing: " + playRandomSong(music3.getSongs());
            default: return "PU";
        }
    }

    private String playRandomSong (String[] array){
        return array[new Random().nextInt(array.length)];
    }
}

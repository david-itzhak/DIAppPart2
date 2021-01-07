package izhak.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import static izhak.spring_introduction.MusicGenre.*;

@Component
public class Computer {
    int id;
    MusicPlayer musicPlayer;
    @Value("${computer.music_genre}")
    MusicGenre genre;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override

    public String toString() {
        return "Computer id=" + id + ". " + musicPlayer.playMusicList(genre) + ". Name: " + musicPlayer.getName() + ". Volume: " + musicPlayer.getVolume();
    }
}

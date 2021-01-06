package izhak.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusicList() {
        System.out.println("Playing: " + music.getSong());
    }

//    private void initMethodTest(){
//        System.out.println("Init method works");
//    }
//    private void destroyMethodTest(){
//        System.out.println("Destroy method works");
//    }
}

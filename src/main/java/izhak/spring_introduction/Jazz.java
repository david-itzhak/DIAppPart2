package izhak.spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Jazz implements Music {
    String[] songsArray = {"JMS 1", "JMS 2", "JMS 3"};

    @Override
    public String[] getSongs() {
        return songsArray;
    }
}

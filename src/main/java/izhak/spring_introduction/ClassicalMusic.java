package izhak.spring_introduction;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}

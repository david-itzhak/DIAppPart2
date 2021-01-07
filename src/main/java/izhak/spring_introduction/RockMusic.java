package izhak.spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public RockMusic() {}

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}

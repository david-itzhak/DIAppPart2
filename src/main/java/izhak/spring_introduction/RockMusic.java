package izhak.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class RockMusic implements Music {

    @PostConstruct
    private void postConstruct(){
        System.out.println("PostConstruct Rock Method works");
    }
    @PreDestroy
    private void preDestroy(){
        System.out.println("PreDestroy Rock Method works");
    }

    String[] songsArray = {"RMS 1", "RMS 2", "RMS 3"};

    @Override
    public String[] getSongs() {
        return songsArray;
    }
}

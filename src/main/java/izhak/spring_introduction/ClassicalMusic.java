package izhak.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    private void postConstruct(){
        System.out.println("PostConstruct Classic Method works");
    }
    @PreDestroy
    private void preDestroy(){
        System.out.println("PreDestroy Classic Method works");
    }

    String[] songsArray = {"CMS 1", "CMS 2", "CMS 3"};

    @Override
    public String[] getSongs() {
        return songsArray;
    }
}

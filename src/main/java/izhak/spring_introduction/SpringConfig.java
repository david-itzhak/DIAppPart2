package izhak.spring_introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("izhak.spring_introduction")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}

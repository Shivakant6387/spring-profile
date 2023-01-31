package org.example.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import javax.annotation.PostConstruct;

@Configuration
@Profile({"development", "default"})
public class DevelopmentConfig {
    @PostConstruct
    public void init(){
        System.out.println("development profile is set");
    }

}

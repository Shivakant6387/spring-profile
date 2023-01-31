package org.example.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import javax.annotation.PostConstruct;

@Configuration
@Profile({"production"})
public class ProductionConfig {

    @PostConstruct
    public void init(){
        System.out.println("production profile is set");
    }
}

package org.example.configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.example.User;
@Configuration
@Profile("prod")
public class ProdEnvConfig {
    @Bean
    public User getUser(){
        return new User(100, "Prod User");
    }
}

package org.example.configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.example.User;

@Configuration
@Profile("test")
public class TestEnvConfig {
    @Bean
    public User getUser(){
        return new User(300, "Test User");
    }
}

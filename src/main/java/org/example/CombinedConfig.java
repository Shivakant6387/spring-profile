package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CombinedConfig {
    @Bean
    @Production
    public String production(){
        return "production profile";
    }

    @Bean
    @Development

    public String developmentHelloWorld(){
        return "development profile";
    }
}

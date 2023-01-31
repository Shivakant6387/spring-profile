package org.example.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class RunJavaConfig {
    public static void main(String... args){
        // choosing an active profile
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("production");
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.close();

        // using default profile
        ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.close();
    }
}

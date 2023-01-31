package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class RunXmlConfig {
    public static void main(String... args){
        // setting an active profile
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("production");
        ctx.load("*-config.xml");
        ctx.refresh();
        print(ctx);
        ctx.close();

        // using the default active profile
        ctx = new GenericXmlApplicationContext();
        ctx.load("*-config.xml");
        ctx.refresh();
        print(ctx);
        ctx.close();
    }

    private static void print(ApplicationContext ctx){
        String welcome = ctx.getBean("profile", String.class);
        System.out.println("Active profile: " + welcome);
    }
}

package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringProfileDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.scan("com.concretepage.config");
        ctx.refresh();
        User user = ctx.getBean(User.class);
        System.out.println("id:"+user.id +", Name:"+ user.name );
    }
}

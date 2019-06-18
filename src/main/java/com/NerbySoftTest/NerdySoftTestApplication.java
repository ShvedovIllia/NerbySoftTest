package com.NerbySoftTest;

import com.NerbySoftTest.entity.Entity;
import com.NerbySoftTest.entity.TaskEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class NerdySoftTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NerdySoftTestApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Entity.class).testMethod();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

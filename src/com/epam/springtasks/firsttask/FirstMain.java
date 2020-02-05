package com.epam.springtasks.firsttask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstMain {

    public static void main(String... a) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        System.out.println(context.getBean("secondBean"));
    }
}
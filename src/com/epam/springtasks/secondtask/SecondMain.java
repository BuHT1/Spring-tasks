package com.epam.springtasks.secondtask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SecondMain {
    public static void main(String... a) {
        ApplicationContext context = new FileSystemXmlApplicationContext("res/secondtask/config.xml");
        for (int i = 0; i < 10; i++) {
            System.out.println("Singleton:" + context.getBean("color"));

            System.out.println("Random Color:" + context.getBean("colorRandom"));
        }
    }
}

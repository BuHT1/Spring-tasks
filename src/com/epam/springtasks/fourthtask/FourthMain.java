package com.epam.springtasks.fourthtask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.convert.converter.Converter;

public class FourthMain{

    public static void main(String... a) {
        ApplicationContext context = new FileSystemXmlApplicationContext("res/fourthtask/config.xml");
        System.out.println("Placeholder Overrider: " + context.getBean("system"));
        System.out.println("Regular Placeholder: " + context.getBean("system"));
    }

}

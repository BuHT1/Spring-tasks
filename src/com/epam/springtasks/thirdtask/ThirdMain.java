package com.epam.springtasks.thirdtask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

public class ThirdMain {
    public static void main(String... a) {
        ApplicationContext context = new FileSystemXmlApplicationContext("res/thirdtask/config.xml");
        ConversionService conversionService = (ConversionService) context.getBean("conversionService");
        if (conversionService.canConvert(String.class, Person.class)) {
            Person person = conversionService.convert("Vasya/Pypkin/33", Person.class);
            System.out.println("Converted: " + person);
        } else {
            System.out.println("Converter not found!");
        }
    }
}

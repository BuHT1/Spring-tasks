package com.epam.springtasks.sixthtask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SixthMain {
    public static void main(String... a) {
        ApplicationContext context = new FileSystemXmlApplicationContext("res/sixthtask/config.xml");
        System.out.println(context.getBean(First.class).myMethod("firstString"));  //Around Advice was executed
        System.out.println(context.getBean(First.class).notMyMethod("firstString")); //Around Advice wasn't executed
        System.out.println(context.getBean(Second.class).myMethod("secondString")); //Around Advice was executed
        System.out.println(context.getBean(Second.class).notMyMethod("secondString")); //Around Advice wasn't executed
    }
}

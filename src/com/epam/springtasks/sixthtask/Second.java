package com.epam.springtasks.sixthtask;

import org.springframework.stereotype.Component;

@Component
public class Second {

    public String myMethod(String string){
        return "myMethodSecondClass";
    }

    public String notMyMethod(String string){
        return "notMyMethodSecondClass";
    }
}

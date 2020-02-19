package com.epam.springtasks.sixthtask;

import org.springframework.stereotype.Component;

@Component
public class First {

    public String myMethod(String string){
        return "myMethodFirstClass";
    }

    public String notMyMethod(String string){
        return "notMyMethodFirstClass";
    }
}

package com.epam.springtasks.thirdtask.converters;

import com.epam.springtasks.thirdtask.Person;
import org.springframework.core.convert.converter.Converter;

public class StringToPersonConverter implements Converter<String, Person> {

    @Override
    public Person convert(String s) {
        String[] params = s.split("/");
        return new Person(params[0], params[1], Integer.parseInt(params[2]));
    }
}

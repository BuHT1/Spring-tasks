package com.epam.springtasks.firsttask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class First {
    List<String> strings;

    public void init() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("res/firsttask/1.csv"));
            strings = bufferedReader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("First{");
        sb.append("strings=").append(strings);
        sb.append('}');
        return sb.toString();
    }
}

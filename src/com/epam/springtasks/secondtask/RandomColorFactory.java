package com.epam.springtasks.secondtask;

import org.springframework.beans.factory.FactoryBean;

import java.awt.Color;
import java.util.Random;

public class RandomColorFactory implements FactoryBean<Color> {
    private Random random;

    public void init() {
        random = new Random();
    }

    @Override
    public Color getObject() {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

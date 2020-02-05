package com.epam.springtasks.secondtask;

import org.springframework.beans.factory.FactoryBean;

import java.awt.Color;

public class ColorFactory implements FactoryBean<Color> {
    private int r, g, b;

    @Override
    public Color getObject() throws Exception {
        return new Color(r, g, b);
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

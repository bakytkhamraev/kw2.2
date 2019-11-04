package com.company;

public abstract class Animal {
    protected String name;

    public String name() {
        return "";
    }

    public String getName() {
        return name;
    }

    public abstract String setName();
}
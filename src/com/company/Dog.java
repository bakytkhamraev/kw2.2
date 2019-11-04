package com.company;

public class Dog extends Animal implements Drawable, SoundProducable {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName() {
        return "";
    }

    @Override
    public String draw() {
        return "\uD83D\uDC36";
    }

    @Override
    public String callSound() {
        return "\uD83D\uDC36 ";
    }
}
package com.company;

public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public String getInfo() {
        return "square";
    }

    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public String draw() {
        return "\u25A0";
    }
}
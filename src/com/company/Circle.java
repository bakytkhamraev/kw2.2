package com.company;

public class Circle extends Figure{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public String getInfo() {
        return "circle";
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String draw() {
        return "\u25cf";
    }
}
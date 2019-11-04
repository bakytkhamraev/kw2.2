package com.company;

public class Rectangle extends Figure {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getInfo() {
        return "rectangle";
    }

    public double getPerimeter() {
        return (2 * a) + (2 * b);
    }

    @Override
    public String draw() {
        return "\u25AE";
    }
}

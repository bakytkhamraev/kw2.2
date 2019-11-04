package com.company;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getInfo() {
        return "triangle";
    }

    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String draw() {
        return "\u25b2";
    }
}
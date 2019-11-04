package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getInfo() + " = " + c.getPerimeter());

        Triangle t = new Triangle(3, 5, 7);
        System.out.println(t.getInfo() + " = " + t.getPerimeter());

        Square s = new Square(5);
        System.out.println(s.getInfo() + " = " + s.getPerimeter());

        Rectangle r = new Rectangle(2, 5);
        System.out.println(r.getInfo() + " = " + r.getPerimeter());

        Figure[] figure = new Figure[6];
        figure[0] = c;
        figure[1] = t;
        figure[2] = s;
        figure[3] = r;
        figure[4] = t;
        figure[5] = c;

        for (int i = 0; i < figure.length; i++) {
            System.out.println(figure[i].getInfo() + " " + figure[i].draw() + " = " + figure[i].getPerimeter());
        }

        Dog d = new Dog();
        d.draw();
        System.out.println(d.setName());
    }
}
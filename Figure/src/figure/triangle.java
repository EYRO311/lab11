/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figure;

/**
 *
 * @author eyro1
 */
public class triangle implements figure {
    private String color;
    private double a, b, c;

    public triangle(String color, double a, double b, double c) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figure;

/**
 *
 * @author eyro1
 */
public class rectangle implements figure {
    private String color;
    private double length, width;

    public rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}


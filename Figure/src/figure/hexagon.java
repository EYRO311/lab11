/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figure;

/**
 *
 * @author eyro1
 */
public class hexagon implements figure {
    private String color;
    private double side;

    public hexagon(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return "Hexagon";
    }

    @Override
    public double perimeter() {
        return 6 * side;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}


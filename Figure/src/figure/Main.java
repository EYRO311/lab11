/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figure;

/**
 *
 * @author eyro1
 */
public class Main {
    public static void main(String[] args) {
        figure[] shapes = {
            new triangle("Red", 3, 4, 5),
            new circle("Blue", 7),
            new rectangle("Green", 4, 6),
            new hexagon("Yellow", 2)
        };

        for (figure shape : shapes) {
            System.out.println("Figure: " + shape.getName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("Area: " + shape.area());
            System.out.println();
        }
    }
}


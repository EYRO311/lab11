from triangle import Triangle
from circle import Circle
from rectangle import Rectangle
from hexagon import Hexagon

def main():
    shapes = [
        Triangle("Red", 3, 4, 5),
        Circle("Blue", 7),
        Rectangle("Green", 4, 6),
        Hexagon("Yellow", 2)
    ]

    for shape in shapes:
        print(f"Figure: {shape.get_name()}")
        print(f"Color: {shape.getColor()}")
        print(f"Perimeter: {shape.perimeter()}")
        print(f"Area: {shape.area()}")
        print()

if __name__ == "__main__":
    main()

import math
from figure import Figure

class Triangle(Figure):
    def __init__(self, color: str, a: float, b: float, c: float):
        self.color = color
        self.a = a
        self.b = b
        self.c = c

    def getColor(self):
        return self.color

    def get_name(self):
        return "Triangle"

    def perimeter(self):
        return self.a + self.b + self.c

    def area(self):
        s = self.perimeter() / 2
        return math.sqrt(s * (s - self.a) * (s - self.b) * (s - self.c))

import math
from figure import Figure

class Circle(Figure):
    def __init__(self, color: str, radius: float):
        self.color = color
        self.radius = radius

    def getColor(self):
        return self.color

    def get_name(self):
        return "Circle"

    def perimeter(self):
        return 2 * math.pi * self.radius

    def area(self):
        return math.pi * (self.radius ** 2)

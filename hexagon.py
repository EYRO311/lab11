import math
from figure import Figure

class Hexagon(Figure):
    def __init__(self, color: str, side: float):
        self.color = color
        self.side = side

    def getColor(self):
        return self.color

    def get_name(self):
        return "Hexagon"

    def perimeter(self):
        return 6 * self.side

    def area(self):
        return (3 * math.sqrt(3) * (self.side ** 2)) / 2

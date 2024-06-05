from abc import ABC, abstractmethod

class Figure(ABC):
    @abstractmethod
    def getColor(self):
        pass

    @abstractmethod
    def perimeter(self):
        pass

    @abstractmethod
    def area(self):
        pass
    
    @abstractmethod
    def get_name(self):
        pass

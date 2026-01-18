package solid.openclose.fixed;

import java.util.List;

public class ShapeCalculatorFixed {
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea; 
    }
}



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

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculateArea(){
        return 3.14 * radius * radius;

    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double calculateArea() {
       return width * height;
    }
    }

class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    

    public double getBase() {
        return base;
    }
    @Override
    double calculateArea() {
        return base * height / 2;
    }

}
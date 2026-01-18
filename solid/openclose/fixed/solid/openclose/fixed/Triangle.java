package solid.openclose.fixed;

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

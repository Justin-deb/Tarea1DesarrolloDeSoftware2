public class Rectangle extends Shape{
    public Rectangle() {
        super(0,0);
    }

    public Rectangle(int width, int height) {
        super(width, height);
    }
    
    @Override
    public int calculateArea() {
        return height * width;
    }
}

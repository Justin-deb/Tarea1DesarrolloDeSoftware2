public class Square extends Shape{
    public Square() {
        super(0,0);
    }

    public Square(int width, int height) {
        super(width, height);
    }
    
    @Override
    public int calculateArea() {
        return height * width;
    }
}

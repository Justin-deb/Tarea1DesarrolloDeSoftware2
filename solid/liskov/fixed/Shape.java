public class Shape {
    protected int width;
    protected int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {return 0;}
}

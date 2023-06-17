public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //overload
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}

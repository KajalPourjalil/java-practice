public class Circle extends GeometricObject{
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    //overloading
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * 3.1415;
    }

    public double getPerimeter(){
        return 2 * 3.1415 * radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("the circle is created on " + getDateCreated() + " and the radius is " + getRadius());
        
    }
}

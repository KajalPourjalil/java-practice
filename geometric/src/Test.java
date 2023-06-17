public class Test{
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(15, 40);

        System.out.println("A circle " + circle.toString());
        System.out.println("color " + circle.getColor());
        System.out.println("radius " + circle.getRadius());
        System.out.println("area " + circle.getArea());
        System.out.println("diameter " + circle.getDiameter());
        System.out.println("perimeter " + circle.getPerimeter());

        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("area " + rectangle.getArea());
        System.out.println("perimeter " + rectangle.getPerimeter());
        
    }
}
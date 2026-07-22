package again.p3;

public class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Shape.PI * Math.pow(radius, 2);
    }
}

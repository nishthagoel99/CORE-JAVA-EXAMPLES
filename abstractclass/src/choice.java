//program that calculates area of circle and rectangle by using the concept of abstract classes
abstract class shape{
    public String color;
    public abstract double area();
    public abstract String toString();
    public shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }
}
class circle extends shape{
    int radius;
    public circle(String color,int radius)
    {
        super(color);
        this.radius=radius;
    }
    public int getRadius(int radius)
    {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Area of circle is : "+ area()+"\n color is : "+ getColor()+"\n";
    }
}
class rectangle extends shape{
    int length;
    int breadth;
    public rectangle(String color,int length,int breadth){
        super(color);
        this.length=length;
        this.breadth=breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return length*breadth;
    }

    @Override
    public String toString() {
        return "Area of rectangle is : "+ area()+"\n color is : "+ getColor()+"\n";
    }
}

public class choice {
    public static void main(String[] args)
    {
        rectangle obj1=new rectangle("red",2,3);
        circle obj2=new circle("black",7);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}

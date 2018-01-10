//A program which shows method overloading
class ar{
    double Area;
    public double area(int radius){
     Area=Math.PI*radius*radius;
     return Area;
    }
    public double area(int length,int breadth){
        Area=length*breadth;
        return Area;
    }
}
public class overload {
    public static void main(String[] args){
        ar obj1=new ar();
        System.out.println("area of circle is "+ obj1.area(7));
        System.out.println("area of rectangle is "+ obj1.area(7,2));


    }

}

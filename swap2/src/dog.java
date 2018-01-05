// swapping more than one values
//here swapping the name and color of 2 dogs
class dog1{
    String name;
    String color;

    public  dog1(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

public class dog {
    dog1 d;
    public dog(dog1 d){
        this.d =d;
    }
    public static void swap(dog dw1,dog dw2)
    {
        dog1 temp=dw1.d;
        dw1.d=dw2.d;
        dw2.d=temp;

    }

public static void main(String[] args){
dog1 d1=new dog1("bruno" , "white");
dog1 d2=new dog1("tuffy","black");
dog dw1=new dog(d1);
dog dw2=new dog(d2);
swap(dw1,dw2);
System.out.println("dog 1:");
System.out.println("Name is: "+ dw1.d.getName()+" , color is : "+ dw1.d.getColor());
    System.out.println("Name is: "+ dw2.d.getName()+" , color is : "+ dw2.d.getColor());
}
}


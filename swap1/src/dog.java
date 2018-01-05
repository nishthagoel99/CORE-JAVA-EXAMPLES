//Swapping names of dogs

public class dog{
    String name;
    public dog(String name){
        this.name=name;
    }
    public static void swap(dog d1,dog d2)
    {
        String temp;
        temp=d1.name;
        d1.name=d2.name;
        d2.name=temp;
    }
    public static void main(String[] args){
        dog d1=new dog("bruno");
        dog d2=new dog("tuffy");
        swap(d1,d2);
        System.out.println("name1=" + d1.name);
        System.out.print("name2=" + d2.name);
    }
}

//example of inheritance
 class Main {
public String name;
public int age;
public int marks;
public Main(String name,int age,int marks){
    this.name=name;
    this.age=age;
    this.marks=marks;
}
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

     public int getMarks() {
         return marks;
     }
     public int change(int marks){
    marks+=5;
    return marks;
     }

     public String toString() {
         return ("The name is:" + name+ "\nThe age is:" + age+ " \nThe marks are: "+ change(marks));
     }
 }
class student extends Main{
    String Class;
    public student(String name,int age,int marks,String Class){
        super(name,age,marks);
        this.Class=Class;
    }

    @Override
    public String toString() {
        return (super.toString()+ "\nThe class is : "+Class);
    }
}
public class school{
    public static void main(String[] args){
        student s=new student("rohan",12,25,"second");
        System.out.print(s.toString());
    }
}
//Displaying the details of a dog using class and objects
public class dog {
    String name;
    String breed;
    int age;
    String color;
    public dog(String name,String breed,int age,String color)
    {
        this.age=age;
        this.breed=breed;
        this.color=color;
        this.name=name;
    }
    public int getAge(){
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    public void display(){
        System.out.print("My name is "+ this.getName()+"\n My age is "+ this.getAge()+"\n My breed is " + this.getBreed()+"\n My color is "+ this.getColor());
    }
    public static void main(String[] args){
        dog d=new dog("Bruno","German Shephard",5,"white");
        d.display();
    }
}

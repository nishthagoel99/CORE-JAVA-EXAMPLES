//Hierarchical Inheritance
//Polymorphism

class A{
    public void m1(){
        System.out.println("Class A method");
    }
}
class B extends A{
    public void m1() {
        System.out.println("Class B method");
    }
}
class C extends A{
    public void m1() {
        System.out.println("Class C method");
    }
}
public class inheritance {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        C c=new C();
        A ref;
        ref=a;
        ref.m1();
        ref=b;
        ref.m1();
        ref=c;
        ref.m1();
    }
}

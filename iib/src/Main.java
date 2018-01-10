//Iteration block gets called everytime before the constructor is called
class test{
    {
        System.out.println("Iteration block called");
    }
    public test(){
        System.out.println("Default constructor called");
    }
    public test(int x){
        System.out.println("Parametrised constructor called");
    }
}

public class Main {
    public static void main(String[] args){
        test t=new test();
        t=new test(1);
    }
}

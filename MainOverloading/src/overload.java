//overloading main
public class overload {
    public static void main(String[] args){
        System.out.println("MAIN WITH SINGLE ARGUMENT");
        overload.main("hi");
    }
    public static void main(String args1){
        System.out.println(args1);
        overload.main("fine","okay");
    }
    public static void main(String args2,String args3){
        System.out.println(args2);
    System.out.println(args3);
    }
}

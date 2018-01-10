//Flexible nature of java.lang.object
public class test {
    public static void main(String[] args){
        Object t;
        t='y';
        {
            System.out.println(t.getClass().getName());
        }
        t="hi";
        {
            System.out.println(t.getClass().getName());
        }
        t=1;
        {
            System.out.println(t.getClass().getName());
        }
        t=false;
        {
            System.out.println(t.getClass().getName());
        }
        t=2.43;
        {
            System.out.println(t.getClass().getName());
        }
    }
}

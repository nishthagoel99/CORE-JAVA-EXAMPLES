import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/*
FORWARD DECLARATIONS
LABEL
 */
/*
public class practice {
    public static void main(String[] args)
    {
        test t1= new test();
        t1.fun(5);
    }
}
class test{
    void fun(int x)
    {
        System.out.print("Value of x is " + x);
    }
}
*/
public class practice{
    public static void main(String[] args)
    {
        outer:
        for(int i=1;i<2;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(j==1){
                    break outer;
                }
            System.out.print(j);
        }}
        int a=1_00;
        System.out.print();
    }
}
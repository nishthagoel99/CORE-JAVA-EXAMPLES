//Calling methods with parameters,returning statements

import java.util.Scanner;
public class practice3 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int base,ex;

        System.out.print("enter the value of base? ");
        base=input.nextInt();
        System.out.print("enter the value of exponential power? ");
        ex=input.nextInt();
        pow(base,ex); //calculating power

        System.out.println("enter string ? ");
        String n=input.nextLine();
        boolean result = isVowel(n); // checking if given string is a vowel or not

        System.out.println(result);
    }
    //using parameters in the method call
    public static void pow(int base,int ex)
    {
       //double y= Math.pow(base,ex); (used for doubles)
       int z=1;
       //System.out.println(base + " to the power of " + ex + " is = " + y);
        System.out.print(base + " to the power of " + ex + " is = " );
        for(int i=0;i<ex;i++)
        {
           z=base*z;
        }
        System.out.print(z);
    }

//returning values
public static boolean isVowel(String n)
{
    if((n.equalsIgnoreCase("a")) || (n.equalsIgnoreCase("e")) || (n.equalsIgnoreCase("i")) ||
            (n.equalsIgnoreCase("o")) || (n.equalsIgnoreCase("u")))
    {
        return true;
    }else
    {
        return false;
    }
}
}


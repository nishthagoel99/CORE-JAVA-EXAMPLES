/*
A program which tells the number of digits before and after the decimal.
 */

import java.util.Scanner;
public class decimal {
    public static void main(String[] args)
    {
        char ch='y';
        do {
            int beforedigit = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number? ");
            float number = input.nextFloat();
            String num = Float.toString(number);
            int index = num.indexOf(".");
            for (int i = 0; i < index; i++) {
                beforedigit++;
            }
            int afterdigit = num.length() - 1 - beforedigit;
            System.out.println("The number of digits before decimal point are " + beforedigit);
            System.out.println("The number of digits after decimal point are " + afterdigit);
            System.out.println();
            System.out.println();
            System.out.print("Want to enter more numbers(y/n)? ");
            ch=input.next().charAt(0);
        }while((ch=='y') || (ch=='Y'));

    }
}

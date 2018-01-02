/*
CHECKS IF THE PHONE NUMBER ENTERED BY THE USER IS VALID OR NOT
VALID WHEN -
IS A 10 DIGIT NUMBER
IF 12 DIGIT,STARTS WITH 91
IF 14 DIGIT,STARTS WITH 9191
 */
import java.util.Scanner;
public class check800phone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch='y';
        do {
            System.out.print("Enter the number? ");
            long number=input.nextLong();
            String num= Long.toString(number);
                if(num.length()==10)
                {
                    System.out.println("VALID NUMBER");
                }else if(num.length()==12) {
                    if (num.startsWith("91")) {
                        System.out.println("VALID NUMBER");
                    }
                }else if(num.length()==14){
                    if(num.startsWith("9191")){
                        System.out.println("VALID NUMBER");
                    }
                }else {
                    System.out.println("INVALID NUMBER");
                }

            System.out.print("want to enter a number again(Y/N)? ");
             ch=input.next().charAt(0);
        }while((ch=='y')||(ch=='Y'));
    }
}
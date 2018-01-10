//printing reverse of a string
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s1=input.next();
        System.out.println("Enter String 2:");
        String s2=input.next();
        String s3=s1.concat(s2);
        System.out.println(s3);
       reverse(s3);
    }
    public static void reverse(String s){
        for(int i=s.length()-1,j=0;i>=0;i--,j++)
            System.out.print(s.charAt(i));

        }
    }


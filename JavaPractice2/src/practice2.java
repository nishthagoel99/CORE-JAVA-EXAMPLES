/*
Java program which contains relational operators on strings and integers,
if-else loop,for loop,nested loop,while loop

 */
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("what is the value of x? ");
        int x=input.nextInt();
        System.out.print("what is the value of y? ");
        int y=input.nextInt();
        if(x>=y)
        {
            System.out.println("x is greater than y!");
        }
        else
        {
            System.out.println("y is greater than x!");
        }
        if(x==y)
        {
            System.out.println("x is equal to y!");
        }
        else if(x!=y)
        {
            System.out.println("x is not equal to y!");
        }
        //  comparing strings

        System.out.print("Enter string1 ?");
        String string1=input.next();
        System.out.print("Enter string2 ?");
        String string2=input.next();
        if(string1.equalsIgnoreCase(string2) || string1.equals(string2))
        {

            System.out.println("string1 is equal to string2!");
        }
        else
        {
            System.out.println("string1 is not equal to string2!");
        }

        if(string1.startsWith("a") || string1.endsWith("a"))
        {
            System.out.println("string1 starts or ends with a");
        }
         if(string2.contains("a"))
        {
            System.out.println("string2 contain a");
        }
        //if loop
        System.out.print("enter temperature? ");
        int temperature=input.nextInt();
        if (temperature > 70) {
            System.out.println("No coat required");
        } else if (temperature > 50) {
            System.out.println("Wear a jacket");
        } else if (temperature > 20) {
            System.out.println("Wear a warm coat");
        } else {
            System.out.println("Stay inside!");
        }
        //FOR LOOP

        System.out.print("how many names you want to enter? ");
       int no=input.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.print("Name #" + (i+1) + "? ");
            String name=input.next();

        }

        System.out.print("you want to multiply 2 with how many numbers? ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("2 times " + i + "= " + (2*i));
        }

        //NESTED LOOP1
        for (int i = 0; i < 5; i++) {
            System.out.print("row " + i + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //NESTED LOOP2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //nested loop3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
                if (i == j) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }
        //nested loop4
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<10;j++)
            {
                for(int k=0;k<3;k++)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        String answer = "";
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Enter yes or no: ");
            answer = input.next();
        }
        System.out.println("Thank you!");



    }
}





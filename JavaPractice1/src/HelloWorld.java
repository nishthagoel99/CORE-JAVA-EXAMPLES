/*
learning java
adding multi line comments
 */
import java.util.Scanner;

public class HelloWorld {
public static void main(String[] args) {
    firstmethod();
    secondmethod();
    firstmethod(); //called first method again
    secondmethod(); //called second method again
    System.out.println("Hello World"); //printing hello world(way to add single line comment
    System.out.println("Hello\\world"); // adding an hash in string so using escape sequence
    System.out.println("hello\"world"); //adding escape sequence
    System.out.println(); // giving space between 2 prints
    System.out.println("hello\nworld"); //adding string to next line
    System.out.println("hello\tworld"); // adding tab. also next line automatically comes when we use println
    System.out.print("first line");
    System.out.print("second line"); // no next lines when we use print
    int x = 10;
    System.out.println();
    String text = "my variable value is ";
    System.out.println(text + x); // string + integer= string
    x = 15; //variable value gets changed
    System.out.println(text + x);
    int y = 5;
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x % y = " + (x % y));

    x++;
    y *= 10;
    System.out.println("x = " + x);
    System.out.println("y = " + y);

    String var1 = "hey";
    String var2 = "world";
    System.out.println(var1 + " " + var2); //concatenation

    System.out.println((int) (10 / 4.0)); // 10/4.0 gives double which is then converted to int
    System.out.println((int) 10 / 4.0); //takes 10 as integer only and den u get double

    inputBirthday();
}



 /*
    for creating methods
     */
  public static void firstmethod()
    {
        System.out.println("called the first method");
    }
    public static void secondmethod()
    {
        System.out.println("called second method");
    }
    public static void inputBirthday()
    {
        Scanner console= new Scanner(System.in);
        System.out.print("On what day of the month were you born?");
        int day=console.nextInt();
        System.out.print("what is the name of the month in which you were born?");
        String month=console.next(); // AS SOON AS SPACE AAYE AND FOR INCLUDING SPACE WE HAVE console.nextLine()
        System.out.print("During what year were you born? ");
        int year=console.nextInt();
        System.out.println("You were born on " + month + " " + day + "," + " " + year + ". You're mighty old !");
    }
}


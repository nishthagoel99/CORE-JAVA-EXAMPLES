/*
A program which calculates the area of rectangle or circle depending on the choice the user makes!
 */
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        char c = 'y';
        do {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter 1 for calculating area of rectangle and Enter 2 for calculating area of circle! ");
            int ch = input.nextInt();
            String choice = "";
            double area = 0;
            switch (ch) {
                case 1:
                    choice = "Rectangle";
                    System.out.print("Enter length of rectangle? ");
                    int length = input.nextInt();
                    System.out.print("Enter breadth of rectangle? ");
                    int breadth = input.nextInt();
                    area = length * breadth;
                    break;
                case 2:
                    choice = "Circle";
                    System.out.print("Enter radius of circle? ");
                    int radius = input.nextInt();
                    area = Math.PI * Math.pow(radius, 2);
                    break;
                default:
                    System.out.print("INVALID INPUT! ");
            }
            System.out.println("Area of " + choice + "is " + area + " square units !");
            System.out.print("Want to calculate area again (y/n) ? ");
            c=input.next().charAt(0);
        }while(c=='y'|| c=='Y');
    }
}

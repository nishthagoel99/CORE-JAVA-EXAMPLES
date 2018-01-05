/*
Program that calculates the distance between two cartesian points
uses constructors
classes
 */

import java.util.Scanner;

public class point {
    private int x;
    private int y;
    public point(int startx,int starty)
    {
        x=startx;
        y=starty;
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public double distance(point p)
    {
        int dx=x-p.getx();
        int dy=y-p.gety();
        return Math.sqrt(dx*dx+dy*dy);

    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the values of x and y coordinates of first point? ");
        int a=input.nextInt();
        int b=input.nextInt();
        point p1=new point(a,b);
        System.out.println("Enter the values of x and y coordinates of second point? ");
        int c=input.nextInt();
        int d=input.nextInt();
        point p2=new point(c,d);
        System.out.print("Distance = "+ p1.distance(p2));

    }
}

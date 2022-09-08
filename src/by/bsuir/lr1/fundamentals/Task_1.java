package by.bsuir.lr1.fundamentals;

import java.util.Scanner;

public class Task_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.print("Enter y: ");
        int y = in.nextInt();

        System.out.printf("\nYou entered:\nx = %d\ny = %d\n\n", x,y);

        double upDigit = 1 + Math.pow(Math.sin(x + y), 2);
        double downDigit = 2 + Math.abs(x-(2*x/(1+x*x*y*y)));

        double result = upDigit/downDigit + x;

        System.out.printf("The result is: %f\n", result);
    }
}

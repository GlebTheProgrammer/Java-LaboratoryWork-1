package util.fundamentals;

import java.util.Scanner;

public class Task_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter h: ");
        double h = in.nextDouble();

        System.out.printf("\nYou entered:\na = %1.2f\nb = %1.2f\nh = %1.2f\n\n", a,b,h);
        System.out.printf("\nProgram took: [a,b] = [%1.2f,%1.2f]\nstep = %1.2f\n\n", a,b,h);

        System.out.println("Arg\t\tValue");
        for (double start = a; start <= b; start += h)
        {
            System.out.printf("%1.2f\t%f\n", start, Math.tan(start));
        }
    }
}

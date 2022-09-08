package util.fundamentals;

import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        System.out.printf("\nYou entered:\nx = %d\ny = %d\n\n", x,y);

        boolean result = isInTheField(x,y);

        System.out.printf("Program output: %b", result);
    }

    private static boolean isInTheField(int x, int y)
    {
        for(int y0 = 0; y0 <= 5; y0++)
        {
            for (int x0 = -4; x0 <= 4; x0++)
            {
                if (x == x0 && y == y0)
                    return true;
            }
        }
        for(int y0 = -3; y0 <= 0; y0++)
        {
            for (int x0 = -6; x0 <= 6; x0++)
            {
                if (x == x0 && y == y0)
                    return true;
            }
        }
        return false;
    }
}

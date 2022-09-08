package util.fundamentals;

import java.util.Scanner;

public class Task_6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = in.nextInt();

        System.out.println("\nEnter array data:");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("arr[%d] = ", i);
            array[i] = in.nextInt();
        }

        System.out.print("\nYour array is: [");
        for (int j : array)
        {
            System.out.printf("\t%d", j);
        }
        System.out.println("\t]\n");

        System.out.println("Yor matrix is:\n");
        PrintMatrix(array);
    }

    public static void PrintMatrix(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i; j < array.length; j++)
                System.out.printf("%d\t", array[j]);

            for (int j = 0; j < i; j++)
                System.out.printf("%d\t", array[j]);

            System.out.println();
        }
    }
}

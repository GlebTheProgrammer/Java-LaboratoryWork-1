package by.bsuir.lr1.fundamentals;

import java.util.Scanner;

public class Task_4
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

        System.out.println("Prime numbers are: ");
        int primeNum = 0;
        for(int j = 0; j < array.length; j++)
        {
            boolean isPrime = true;
            int dividers = 0;
            for (int k = 1; k <= array[j]; k++)
            {
                if (array[j] % k == 0) dividers++;

                if (dividers == 3)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                System.out.printf("arr[%d] = %d\n", j, array[j]);
                primeNum++;
            }

        }
        if (primeNum == 0) System.out.println("There is no prime digits in the array\n");

    }
}

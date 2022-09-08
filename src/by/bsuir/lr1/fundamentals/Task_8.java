package by.bsuir.lr1.fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1-st Array Size: ");
        int n_1 = in.nextInt();

        System.out.println("\nEnter 1-st array data:");
        int[] array_1 = new int[n_1];
        for (int i = 0; i < array_1.length; i++)
        {
            System.out.printf("arr_1[%d] = ", i);
            array_1[i] = in.nextInt();
        }

        System.out.print("\nEnter 2-nd Array Size: ");
        int n_2 = in.nextInt();
        System.out.println("\nEnter 2-nd array data:");
        int[] array_2 = new int[n_2];
        for (int i = 0; i < array_2.length; i++)
        {
            System.out.printf("arr_2[%d] = ", i);
            array_2[i] = in.nextInt();
        }

        System.out.print("\nYour arrays are: \n[");
        for (int j : array_1)
        {
            System.out.printf("\t%d", j);
        }
        System.out.println("\t]");

        System.out.print("[");
        for (int j : array_2)
        {
            System.out.printf("\t%d", j);
        }
        System.out.println("\t]\n");

        GetResultArray(array_1, array_2);
    }

    public static void GetResultArray(int[] array_1, int[] array_2)
    {
        var resultArray = new ArrayList<Integer>();
        var indexes = new ArrayList<Integer>();

        int counter = 0;
        int counter_1 = 0;
        int position = -1;
        for (int i = 0; i < array_1.length && counter != array_2.length; i++)
        {
            counter_1 = i;
            if (array_1[i] < array_2[counter])
            {
                resultArray.add(array_1[i]);
                position += 1;
                counter_1 += 1;
            }
            else
            {
                if (array_1[i] == array_2[counter])
                {
                    resultArray.add(array_1[i]);
                    resultArray.add(array_2[counter]);
                    counter += 1;
                    position += 2;
                    indexes.add(position);
                    counter_1 += 1;
                }
                else
                {
                    resultArray.add(array_2[counter]);
                    counter += 1;
                    position += 1;
                    indexes.add(position);
                    i -= 1;
                }
            }
        }

        while (counter < array_2.length)
        {
            resultArray.add(array_2[counter]);
            counter += 1;
            position += 1;
            indexes.add(position);
        }
        while (counter_1 < array_1.length)
        {
            resultArray.add(array_1[counter_1]);
            counter_1 += 1;
        }

        System.out.print("Result array is:\n[");
        for (var item : resultArray)
        {
            System.out.printf("\t%d", item);
        }
        System.out.print("\t]\n\nResult indexes are:\n");
        for (var index : indexes)
        {
            System.out.printf("%d\t", index);
        }
        System.out.println();
    }
}

package by.bsuir.lr1.fundamentals;

import java.util.Scanner;

public class Task_5
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

        System.out.printf("You need to remove %d digits to get array, sorted in ascending order\n", UnnecessaryNumbersCount(array));
    }

    public static int UnnecessaryNumbersCount(int[] initialArray)
    {
        if (initialArray.length == 1){
            return 0;
        }

        return CountNumbers(initialArray);
    }

    private static int CountNumbers(int[] numbers){
        int result = 0;
        for (int j = 0; j < numbers.length - 1; j++)
        {
            int resultCount = 0, currMaxNumber = numbers[j];

            for(int i = j; i < numbers.length - 1; i++){
                if (numbers[i + 1] <= currMaxNumber){
                    resultCount++;
                }
                else{
                    currMaxNumber = numbers[i + 1];
                }
            }

            currMaxNumber = numbers[j];
            for (int i = j; i > 0; i--)
            {
                if (numbers[i - 1] >= currMaxNumber){
                    resultCount++;
                }
                else{
                    currMaxNumber = numbers[i - 1];
                }
            }

            if (result == 0 || result > resultCount)
                result = resultCount;
        }

        return result;
    }
}

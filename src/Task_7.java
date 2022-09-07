import java.util.Scanner;

public class Task_7
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
        System.out.println("\t]");

        ShellSort(array);

        System.out.print("\nSorted array is: [");
        for (int j : array)
        {
            System.out.printf("\t%d", j);
        }
        System.out.println("\t]");
    }

    public static void ShellSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; )
        {
            if (array[i] <= array[i+1])
            {
                i += 1;
                continue;
            }
            else
            {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;

                if (i == 0)
                    continue;
                else
                    i -= 1;
            }
        }
    }
}

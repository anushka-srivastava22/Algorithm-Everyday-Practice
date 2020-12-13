import java.util.*;
class ShellSort
{
    public int sort(int ar[] , int n)
    {
        for(int gap = n/2; gap > 0; gap /= 2)
        {
            for(int i=gap; i<n; i += 1)
            {
                int temp = ar[i];
                int j;
                for( j=i; j>=gap && ar[j-gap] > temp; j -= gap)
                {
                    ar[j] = ar[j-gap];
                }
                ar[j] = temp;
            }
        }
        return 0;
    }
    void printArray(int ar[] , int n)
    {
        for(int i = 0; i<n; i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter a number ");
            ar[i] = sc.nextInt();

        }
        ShellSort ob = new ShellSort();
        ob.sort(ar , n);
        ob.printArray(ar , n);

    }
}
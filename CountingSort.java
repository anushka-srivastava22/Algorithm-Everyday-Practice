import java.util.*;
class CountingSort
{
    public void sort(int ar[] , int n)
    {
        int output[] = new int[n];
        int count[] = new int[10];
        for(int i=0;i<10;i++)
        {
            count[i] = 0;
        }
        for(int i=0;i<n;i++)
        {
            ++count[ar[i]];
        }
        for(int i=1; i<=9; i++)
        {
            count[i]+= count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            output[count[ar[i]]-1] = ar[i];
            --count[ar[i]];
        }
        for(int i=0;i<n;i++)
        {
            ar[i] = output[i];
        }
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
        CountingSort ob = new CountingSort();
        ob.sort(ar , n-1);
        ob.printArray(ar , n);

    }
}
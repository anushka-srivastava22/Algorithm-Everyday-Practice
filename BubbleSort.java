import java.util.*;
class BubbleSort
{
    void bubSort(int ar[] , int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j=0; j< n-1; j++)
            {
                if(ar[j] > ar[j+1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
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
        BubbleSort ob = new BubbleSort();
        ob.bubSort(ar , n);
        ob.printArray(ar , n);
        
    }
}
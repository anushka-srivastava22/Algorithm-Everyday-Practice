import java.util.*;
class InsertionSort 
{
    void insSort(int ar[] , int n)
    {
        for(int i=1;i<n;i++)
        {
            int key = ar[i];
            int j = i-1;
            while(j >= 0 && ar[j] > key)
            {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = key;
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
        InsertionSort ob = new InsertionSort();
        ob.insSort(ar , n);
        ob.printArray(ar , n);
        
    }
}

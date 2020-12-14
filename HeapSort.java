import java.util.*;
public class HeapSort 
{
    public void sort (int ar[] , int n)
    {
        for(int i = n/2-1 ; i>=0; i--)
        {
            heapify(ar , n , i);
        }
        for(int i=n-1; i>0; i--)
        {
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;
            heapify(ar , i , 0);
        }
    }
    void heapify(int ar[] , int n , int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && ar[l] > ar[largest])
        {
            largest = l;
        }
        if(r<n && ar[r] > ar[largest])
        {
            largest = r;
        }
        if(largest != i)
        {
            int swap = ar[i];
            ar[i] = ar[largest];
            ar[largest] = swap;
            heapify(ar , n , largest);
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
        HeapSort ob = new HeapSort();
        ob.sort(ar , n);
        ob.printArray(ar , n);

    }
}
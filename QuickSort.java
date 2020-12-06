import java.util.*;
class QuickSort
{
    public void sort(int a[] , int l , int h)
    {
        int pivot , i , j;
        if(l<h)
        {
            pivot = l;
            i=l;
            j=h;
            while(i < j)
            {
                while(a[i]<=a[pivot] && i<h)
                {
                    i++;
                }
                while(a[j]>a[pivot])
                {
                    j--;
                }
                if(i<j)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            int temp1 = a[pivot];
            a[pivot] = a[j];
            a[j] = temp1;
            sort(a , l , j-1);
            sort(a , j+1 , h);
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
        QuickSort ob = new QuickSort();
        ob.sort(ar , 0 , n-1);
        ob.printArray(ar , n);
        
    }
}

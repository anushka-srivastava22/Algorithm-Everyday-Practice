import java.util.Scanner;
class MergeSort
{
    void merge(int arr[] , int l , int m , int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0; i<n1; i++)
        {
            L[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j] = arr[m+1+j];
        }
        int i=0 , j=0;
        int k = l;
        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[] , int l , int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(arr , l ,m);
            sort(arr,m+1,r);
            merge(arr , l, m,r);
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
        MergeSort ob = new MergeSort();
        ob.sort(ar , 0 , n-1);
        ob.printArray(ar , n);
        
    }
}

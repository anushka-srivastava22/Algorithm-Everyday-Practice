import java.util.Scanner;
class SelectionSort
{
    void selSort(int ar[] , int n)
    {
        for(int i=0; i<n-1;i++)
        {
            int m = i;
            for(int j=i+1; j<n; j++)
            {
                if(ar[j] < ar[m])
                {
                    m = j;
                }
            }
            int temp = ar[m];
            ar[m] = ar[i];
            ar[i] = temp;
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
        SelectionSort ob = new SelectionSort();
        ob.selSort(ar , n);
        ob.printArray(ar , n);
        
    }
}

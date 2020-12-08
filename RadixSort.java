import java.util.*;
class RadixSort
{
    static int getMax(int ar[] , int n)
    {
        int max = ar[0];
        for(int i=1;i<n;i++)
        {
            if(ar[i] > max)
            {
                max = ar[i];
            }
        }
        return max;
    }
    static  void countSort(int ar[] , int n , int exp)
    {
        int output[] = new int[n];
        
        int count[] = new int[10];
        for(int i=0;i<10;i++)
        {
            count[i] = 0;
        }
        for(int i=0;i<n;i++)
        {
            count[(ar[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++)
        {
            count[i]+= count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            output[count[(ar[i]/exp)%10]-1] = ar[i];
            count[(ar[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++)
        {
            ar[i] = output[i];
        }
    }
    static void sort(int ar[] , int n)
    {
        int m=getMax(ar,n);
        for(int exp = 1;m/exp>0;exp *= 10)
        {
            countSort(ar,n,exp);
        }
    }
    static void printArray(int ar[] , int n)
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
        
        sort(ar , n);
        printArray(ar , n);

    }
}
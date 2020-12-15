import java.util.*;
class InterpolationSearch
{
    int search(int ar[] , int x)
    {
        int lo = 0 , hi = (ar.length - 1);
        while(lo <= hi && x >=ar[lo] && x <=ar[hi])
        {
            if(lo == hi)
            {
                if(ar[lo] == x)
                {
                    return lo;
                }
                return -1;
            }
            int pos = lo + (((hi - lo) / (ar[hi] - ar[lo])) * (x - ar[lo]));
            if(ar[pos] == x)
            {
                return pos;
            }
            if(ar[pos] < x)
            {
                lo = pos+1;
            }
            else
            {
                hi = pos-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        InterpolationSearch ls = new InterpolationSearch();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            ar[i] = sc.nextInt();
            
        }
        System.out.println("Enter a number to be searched");
        int x = sc.nextInt();
        int a = ls.search(ar , x);
        if(a== -1 )
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}
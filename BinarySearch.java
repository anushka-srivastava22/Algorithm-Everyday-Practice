import java.util.*;
class BinarySearch
{
    public boolean search(int ar[] , int x , int min , int max)
    {
        int mid = (min + max)/2;
        while(min < max)
        {
            if(ar[mid] == x)
            {
                return true;
            }
            else if(ar[mid] < x)
            {
                min = mid+1;
            }
            else
            {
                max = mid-1;
            }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        BinarySearch ls = new BinarySearch();
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
        boolean a = ls.search(ar , x , 0 , n-1);
        if(a==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
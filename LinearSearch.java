import java.util.*;
class LinearSearch
{
    public boolean search(int ar[],int n, int x)
    {
        for(int i=0;i<n;i++)
        {
            if(ar[i] == x)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        LinearSearch ls = new LinearSearch();
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
        boolean a = ls.search(ar , n , x);
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
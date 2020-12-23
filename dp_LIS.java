import java.util.*;
class dp_LIS
{
    static int max_ref;
    static int _lis(int arr[] , int n)
    {
        if(n == 1)
        {
            return 1;
        }
        int res , max_ending = 1;
        for(int i = 1; i < n; i++)
        {
            res = lis(arr , i);
            if(arr[i-1] < arr[n-1] && res + 1 > max_ending)
            {
                max_ending = res + 1;
            }
        }
        if(max_ref < max_ending)
        {
            max_ref = max_ending;
        }
        return max_ending;
    }
    static int lis(int arr[] , int n)
    {
        max_ref = 1;
        _lis(arr , n);
        return max_ref;
    }
    public static void main(String args[])
    {
        int arr[] = {10,22,9,33,21,50,41,60};
        int n = arr.length;
        System.out.println("Length of lis "+lis(arr , n)+"\n");
    }
}
class MatrixChainMultiplication
{
    static int MCO(int p[] , int i , int j)
    {
        if(i == j)
        {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++)
        {
            int count = MCO(p , i , k) + MCO(p , k+1 , j) + p[i-1]*p[k]*p[j];
            if(count < min)
            {
                min = count;
            }
        }
        return min;
    }
    
    public static void main(String args[])
    {
        int arr[] = new int[] {1,2,3,4,3};
        int n = arr.length;
        System.out.println("Minimum number of Multiplication is "+MCO(arr , 1 , n-1));
    }
} 
                
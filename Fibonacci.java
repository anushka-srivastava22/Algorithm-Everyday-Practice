import java.util.*;
class Fibonacci
{
    final int MAX = 100;
    final int NIL = -1;
    int lookup[] = new int[MAX];
    void initialise()
    {
        for(int i = 0; i < MAX; i++)
        {
            lookup[i] = NIL;
        }
    }
    int fib(int n)
    {
        if(lookup[n] == NIL)
        {
            if(n <= 1)
            {
                lookup[n] = n;
            }
            else
            {
                lookup[n] = fib(n-1) + fib(n-2);
            }
        }
        return lookup[n];
    }
    public static void main(String args[])
    {
        Fibonacci f = new Fibonacci();
        int n = 40;
        f.initialise();
        System.out.println("Fibonacci Number is "+f.fib(n));
    }
}
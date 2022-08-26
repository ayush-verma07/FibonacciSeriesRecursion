//Ayush Verma
import java.util.*;

public class Fib {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Which element in the Fibonacci series would you like to view? --> ");
        int x = console.nextInt();
        System.out.println(f(x));
    }

    public static int f(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        return (f(n - 1)) + (f(n - 2));
    }
}

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        if (n < k)
        {
            long tmp = Math.abs(n-k);
            if (tmp == 1) System.out.println(tmp);
            else System.out.println(n);
        }
        else if (n == k || k == 1) System.out.println(0);
        else if (n%2 == 0 && k%2 == 0)
        {
            if (n%k == 0) System.out.println(0);
            else
            {
                long candidate = n%k;
                long candidate2 = Math.abs(candidate-k);
                System.out.println(Math.min(candidate,candidate2));
            }
        }
        else System.out.println(1);

        sc.close();
    }
}
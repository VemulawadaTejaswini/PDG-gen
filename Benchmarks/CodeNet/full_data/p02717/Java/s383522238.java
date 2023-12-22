import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        long n = key.nextLong();
        long k = key.nextLong();
        long min = 0;
        if (n>=k)
        {
            min = n%k;
        }

        if(min > k/2)
        {
            min = Math.abs(min-k);
        }

        System.out.println(min);
    }
}
import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        long n = key.nextLong();
        long k = key.nextLong();
        if(n<k)
            System.out.println(n);
        else
        {
            while(n>0)
            {
                if(n % k == 0)
                {
                    n = 0;
                    break;
                }
                if(n<k)
                {
                    n = n - k;
                    n = Math.abs(n);
                    break;
                }
                else
                    n = n -k;
            }
            System.out.println(n);
        }
        
    }
}
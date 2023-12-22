import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n, a, b;
        
        n = sc.nextLong();
        a = sc.nextLong();
        b = sc.nextLong();

        if (n < 2 || a > b){
            System.out.println(0);
            System.exit(0);
        }

        if (a==b)
        {
            System.out.println(n);
            System.exit(0);
        }

        long length = n - 2;
        //long cnum = b - a +1;

        System.out.println(length*(b-a)+1);
    }
}
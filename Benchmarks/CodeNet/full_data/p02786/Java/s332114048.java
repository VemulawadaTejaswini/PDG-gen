import java.util.Scanner;
import java.util.Arrays;

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        long h = s.nextLong();
        long a = 2;
        long t = h/a;
        if((h%a)!=0)
        {
            t++;
        }
        long tw0_pow =(long)(Math.pow(2, (t+1)));

        System.out.println(tw0_pow-1);
    }
}
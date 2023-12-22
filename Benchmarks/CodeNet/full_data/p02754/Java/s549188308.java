import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long ab = a+b;
        long tmp = n/ab;
        long tmp2 = n-ab*tmp;

        if (tmp2 >= a) System.out.println(a*tmp+a);
        else System.out.println(a*tmp+tmp2);
    }
}
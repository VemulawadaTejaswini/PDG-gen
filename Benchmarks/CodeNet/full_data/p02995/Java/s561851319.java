import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //final int n = sc.nextInt();
        final long a = sc.nextLong();
        final long b = sc.nextLong();
        final long c = sc.nextLong();
        final long d = sc.nextLong();

        Compute compute = new Compute();
        long tmp = compute.gcd(c,d);
        long tmp2 = d/tmp;
        long lcm = tmp2*c;

        long numOfNum = b - a + 1;
        long cnt1 = (b/c) - ((a-1)/c);
        long cnt2 = (b/d) - ((a-1)/d);
        long cnt3 = (b/lcm) - ((a-1)/lcm);

        System.out.println(numOfNum - cnt1 - cnt2 + cnt3);
        sc.close();
    }
}
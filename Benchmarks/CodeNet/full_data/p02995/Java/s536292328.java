import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ans = 0, l = 0, as = 0, bs = 0;

        if (c > d) {
            long f = c;
            c = d;
            d = f;
        }

        l = lcm(c, d);
        as = (a - 1) - (((a - 1) / c) + ((a - 1) / d) - ((a - 1) / l));
        bs = b - ((b / c) + (b / d) - (b / l));
        ans = bs - as;
        System.out.println(ans);
        sc.close();
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

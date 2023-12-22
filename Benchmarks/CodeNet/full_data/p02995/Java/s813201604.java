import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        if(c < d) {
            long t = c;
            c = d;
            d = t;
        }
        long ans = (b - a + 1) - ((b / c - (a - 1) / c) + (b / d - (a - 1) / d)
                 - (b / lcm(c, d) - (a - 1) / lcm(c, d)));
        System.out.println(ans);
    }
    static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    static long gcd(long m, long n) {
        long r = m % n;
        while(r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}

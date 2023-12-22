import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long g = Long.parseLong(sc.next()) / 2l;
        for (int i = 0; i < n - 1; i++) {
            g = lcm(g, Long.parseLong(sc.next()) / 2l);
        }

        long res = 0;
        for (long i = g; i <= m ; i += g) {
            if(i % 2 == 0) {
                continue;
            }
            res++;
        }
        System.out.println(res);
    }

    static long gcd(long x, long y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}

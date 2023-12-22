import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextLong();
        long s = scanner.nextLong();
        if (s == n) {
            System.out.println(n + 1);
        } else {
            for (long b = 2; b * b <= n; b++) {
                if (f(b, n) == s) {
                    System.out.println(b);
                    return;
                }
            }
            long min = Long.MAX_VALUE;
            for (long p = 1; p * p < n; p++) {
                long b = (n - s) / p + 1;
                if (b != 0 && (n - s) % p == 0 && f(b, n) == s) {
                    min = Math.min(min, b);
                }
            }
            System.out.println(min == Long.MAX_VALUE ? -1 : min);
        }
    }

    static long f(long b, long n) {
        long s = 0;
        while (n > 0) {
            n /= b;
            s += n % b;
        }
        return s;
    }
}
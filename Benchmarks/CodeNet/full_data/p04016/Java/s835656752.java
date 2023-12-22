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
            for (long p = (long)Math.sqrt(n); p > 0; p--) {
                long b = (n - s) / p + 1;
                if (f(b, n) == s) {
                    System.out.println(b);
                    return;
                }
            }
            System.out.println(-1);
        }
    }

    static long f(long b, long n) {
        long s = n % b;
        while (n >= b) {
            n = Math.floorDiv(n, b);
            s += n % b;
        }
        return s;
    }
}
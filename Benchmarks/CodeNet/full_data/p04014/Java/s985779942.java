import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();
        if (s == n) {
            System.out.println(n + 1);
            return;
        }
        for (long i = 2; i * i <= n; i++) {
            if (solve(n, s, i)) {
                System.out.println(i);
                return;
            }
        }
        for (long p = 1; p * p < n; p++) {
            long b = (n - s) / p + 1;
            if (!(b * b >= n && b <= n)) {
                continue;
            }
            if (solve(n, s, b)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println(-1);
    }
    public static boolean solve(long n, long s, long num) {
        long ans = 0;
        while (n > 0) {
            ans += n % num;
            n /= num;
        }
        if (ans == s) {
            return true;
        }
        return false;
    }
}

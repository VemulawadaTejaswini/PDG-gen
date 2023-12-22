import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static long[] a, p;
    public static void main(String[]$) {
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        a = new long[n + 1];
        p = new long[n + 1];
        a[0] = 1;
        p[0] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        System.out.println(f(n, m));
    }

    static long f(int n, long x) {
        if (n == 0)
            return x <= 0 ? 0 : 1;
        if (x <= a[n - 1] + 1)
            return f(n - 1, x - 1);
        return p[n - 1] + 1 + f(n - 1, x - 2 - a[n - 1]);
    }
}
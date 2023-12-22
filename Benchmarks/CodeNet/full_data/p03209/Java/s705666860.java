import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long x = input.nextLong();
        long[] a = new long[n];
        long[] p = new long[n];
        a[0] = 1; p[0] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = 2 * a[i-1] + 3;
            p[i] = 2 * p[i-1] + 1;
        }
        System.out.print(foo(n, x, a, p));
    }

    private static long foo (int n, long x, long[] a, long[] p) {
        if (n == 0)
            return x == 1 ? 1: 0;
        else if (x <= 1 + a[n-1])
            return foo(n-1, x-1, a, p);
        else
            return p[n-1] + 1 + foo(n-1, x - 2 - a[n-1], a, p);
    }
}
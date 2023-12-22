import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] m = new long[n];
        long[] l = new long[n + 1];
        long[] r = new long[n + 1];

        // 左側から最小公約数を求めていく
        for (int i = 0; i < n; i++) {
            l[i + 1] = gcd(l[i], a[i]);
        }

        // 右側から最小公約数を求めていく
        for (int i = n - 1; i > 0; i--) {
            r[i] = gcd(r[i + 1], a[i]);
        }

        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, gcd(l[i], r[i + 1]));
        }

        System.out.println(max);
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
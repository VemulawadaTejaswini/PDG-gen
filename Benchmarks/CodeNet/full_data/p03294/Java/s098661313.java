import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        long lcm = a[0];
        for (int i = 1; i < N; i++) {
            lcm = lcm(lcm, a[i]);
        }
        lcm--;

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += lcm % a[i];
        }
        System.out.println(ans);
    }

    static long lcm(long m, long n) {
        return m / gcd(m, n) * n;
    }

    static long gcd(long m, long n) {
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m % n);
    }
}

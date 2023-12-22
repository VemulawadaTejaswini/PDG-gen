import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
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
        return m / gcd(m, n) * n / gcd(m, n) * gcd(m, n);
    }

    static long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        long r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

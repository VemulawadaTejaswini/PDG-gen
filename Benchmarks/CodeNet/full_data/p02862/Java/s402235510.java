import java.util.*;

class Main {
    static final long MOD = 1_000_000_007;
    static long inv(long a, long m) {
        long r1 = a, r0 = m;
        long x1 = 1, x0 = 0;
        while (r1 != 0) {
            long q = r0 / r1;
            long v = r1;
            r1 = r0 - q * r1;
            r0 = v;
            long w = x1;
            x1 = x0 - q * x1;
            x0 = w;
        }
        if (x0 < 0) {
            x0 += m;
        }
        return x0;
    }
    static long f(long x, long y) {
        if ((x + y) % 3 != 0) return 0;
        long n = (x + y) / 3;
        long k = (2 * x - y) / 3;
        if (k < 0 || k > n) return 0;
        long ret = 1;
        for (long i = 0; i < k; i++) {
            ret = ret * (n - i) % MOD * inv(i + 1, MOD) % MOD;
        }
        return ret;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println(f(x,y));
    }
}

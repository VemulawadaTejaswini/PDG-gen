import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int MAX = 510000;
        int MOD = 998244353;

        long fac[] = new long[MAX];
        long finv[] = new long[MAX];
        long inv[] = new long[MAX];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        long K = sc.nextLong();

        comInit(fac, finv, inv, MAX, MOD);
        long res = 0;
        for (long a = 0; a <= N; a++) {
            long rem = K - a * A;
            if (rem % B == 0) {
                long b = rem / B;
                if (b <= N) {
                    long temp = com(N, (int) a, fac, finv, inv, MAX, MOD) * com(N, (int) b, fac, finv, inv, MAX, MOD)
                            % MOD;
                    res += temp;
                    res %= MOD;
                }
            }
        }
        System.out.println(res);
    }

    private static void comInit(long[] fac, long[] finv, long[] inv, int MAX, int MOD) {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;

        }
    }

    private static long com(int n, int k, long[] fac, long[] finv, long[] inv, int MAX, int MOD) {
        if (n < k) {
            return 0;
        }
        if (n < 0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;

    }
}

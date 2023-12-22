import java.util.*;

public class Main {

    private static final int MOD = 1000000007;

    private static long[] fact;
    private static long[] finv;

    private static void setFact(int max) {
        fact = new long[max];
        finv = new long[max];
        long[] inv = new long[max];

        fact[0] = fact[1] = 1;
        finv[0] = finv[1] = 1;

        inv[0] = 1;
        inv[1] = 1;
        for (int i = 2; i < max; i++) {
            fact[i] = fact[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
        //System.out.println(Arrays.toString(fact));
        //System.out.println(Arrays.toString(finv));
    }

    private static long nCr(int n, int r) {
        if (n < r || n < 0 || r < 0) return 0;
        return fact[n] * (finv[r] * finv[n - r] % MOD) % MOD;
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();

        setFact(H+W+1);

        long ret = 0;
        for (int i = B; i < W; i++) {
            ret += (nCr((H - A - 1) + i, i) * nCr((W - i - 1) + (A - 1), A - 1)) % MOD;
            ret %= MOD;
        }

        System.out.println(ret);
    }
}
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        sc.close();
        combinationInit();
        long ans = 0;
        // long ans = combination(H - 1 + W - 1, Math.min(H - 1, W - 1));
        for (int i = 0; i < H - A; i++) {
            long tmp = combination(B - 1 + i, Math.min(B - 1, i));
            tmp *= combination((W - B - 1) + (H - i - 1), Math.min((W - B - 1), (H - i - 1)));
            tmp %= MOD;
            ans += tmp;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    static int MAX = 510000;
    static long[] fac = new long[MAX], finv = new long[MAX], inv = new long[MAX];

    static void combinationInit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[(int) MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    static long combination(int n, int k) {
        // System.out.println(n + " " + k);
        if (n < k)
            return 0;
        if (n < 0 || k < 0)
            return 0;

        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
}
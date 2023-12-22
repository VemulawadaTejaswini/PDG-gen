import java.util.*;

public class Main {

    public static void main(String[] args) {
        final long MOD = (long) (1e9) + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] frac = new long[n + 1];
        long[] frac_inv = new long[n + 1];

        frac[0] = 1;
        frac_inv[0] = 1;
        for (int i = 1; i <= n; i++) {
            frac[i] = (frac[i-1] * i) % MOD;
            frac_inv[i] = modinv(frac[i], MOD);
        }

        k = Math.min(k, n - 1);

        long ans = 0;
        for (int j = 0; j <= k; j++) {
            long nCj = (frac[n] * frac_inv[j] % MOD) * frac_inv[n - j] % MOD;
            long pCq = (frac[n - 1] * frac_inv[n - j - 1] % MOD) * frac_inv[j] % MOD;
            ans = (ans + ((nCj * pCq) % MOD)) % MOD;
        }

        System.out.println(ans);
    }

    static long modpow(long a, long n, long MOD) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            n >>= 1;
        }

        return res;
    }

    static long modinv(long a, long MOD) {
        return modpow(a, MOD - 2, MOD);
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long mod = 1000000007;

        long fac[] = new long[n + 3];
        long finv[] = new long[n + 3];
        long inv[] = new long[n + 3];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2 ; i < n + 3; i++) {
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[(int)mod % i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }

        long ans = 0;
        for (int i = 0 ; i < n - k + 1 ; i++) {
            ans -= a[i] * COM(n - i - 1, k - 1, fac, finv, mod);
            ans %= mod;
            ans += a[n - i - 1] * COM(n - i - 1, k - 1, fac, finv, mod);
            ans %= mod;
        }
        System.out.println((ans + mod) % mod);

    }
    static long COM(int n, int k, long[] fac, long[] finv, long mod){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
    }

}
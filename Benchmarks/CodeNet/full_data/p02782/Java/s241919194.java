import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long MOD = (long)1e9 + 7;

        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int sumMax = r2+c2+1;
        long[] frac = new long[sumMax+1];
        long[] frac_inv = new long[sumMax+1];

        frac[0] = 1;
        frac_inv[0] = 1;

        for(int i = 1 ; i <= sumMax ; i++){
            frac[i] = (frac[i-1]*i) % MOD;
            frac_inv[i] = modinv(frac[i], MOD);
        }

        long ans = 0;
        for(int i = r1 ; i <= r2 ; i++){
            long tmp1 = 0;
            long tmp2 = 0;
            tmp1 = (frac[i + c2 + 1] * frac_inv[c2]) % MOD;
            tmp2 = (frac[i+c1] * frac_inv[c1-1]) % MOD;
            long tmp = (tmp1 - tmp2 + MOD) % MOD;
            tmp = (tmp * frac_inv[i+1]) % MOD;

            ans = (ans + tmp) % MOD;
        }

        System.out.println(ans);
    }

    // a^n mod を計算する
    static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1){
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return res;
    }

    // a^{-1} mod を計算する
    static long modinv(long a, long mod) {
        return modpow(a, mod - 2, mod);
    }
}
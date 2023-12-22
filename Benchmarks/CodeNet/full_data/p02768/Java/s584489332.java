import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        long ans = (modPow(2, n) - 1) % MOD;
        ans -= comb(n, a);
        if (ans < 0) {
            ans += MOD;
        }
        ans -= comb(n, b);
        if (ans < 0) {
            ans += MOD;
        }
        System.out.println(ans);
    }

    // 繰り返し２乗法
    private static long modPow(long n, int p) {
        long res = 1;
        long a = n;
        for (a %= MOD; p > 0; a = a * a % MOD, p >>= 1) {
            if ((p & 1) > 0) {
                res = res * a % MOD;
            }
        }
        return res;
    }

    // 逆元
    private static long modInv(long a) {
        return modPow(a, MOD - 2);
    }

    private static long comb(long n, long r) {
        long ret = 1;
        for (long i = 0; i < r; i++) {
            ret *= n - i;
            ret %= MOD;
            ret *= modInv(i + 1);
            ret %= MOD;
        }
        return ret;
    }
}
import java.util.Scanner;

public class Main {
    static long[] fac = new long[1000003];
    static long[] finv = new long[1000003];
    static long[] inv = new long[1000003];
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        //前処理
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 1000003; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }

        if ((x + y) % 3 != 0) {
            System.out.println(0);
            return;
        }

        int n = (x + y) / 3;

        for (int i = 0 ; i <= n ; i++) {
            if (i + 2 * (n - i) == x && i * 2 + n - i == y) {
                System.out.println(comb(n, i));
                return;
            }
        }
        System.out.println(0);

    }

    static long comb(int n, int k) {
        if (n < k)
            return 0;
        if (n < 0 || k < 0)
            return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

}
//package Round613;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sguar <shugangcao@gmail.com>
 * welcome to kuaishou
 * Created on 2020-01-12
 */
public class Main {
    private static final long MOD = 1_000_000_007;

    long[] factorial;
    long[] inverseFactorial;



    public void init(int n) {
        factorial = new long[n + 1];
        inverseFactorial = new long[n + 1];

        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i % MOD;
        }
        inverseFactorial[n] = inv(factorial[n]);
        for (int i = n - 1; i >= 0; i--) {
            inverseFactorial[i] = inverseFactorial[i + 1] * (i + 1) % MOD;
        }
    }

    public void run() {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        init(n);
        //debug();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextLong();
        }
        Arrays.sort(a);

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = (ans
                    + getC(n - i, k - 1)
                    * ((a[n - i] - a[i - 1]) % MOD)
                    % MOD)
                    % MOD;
        }
        System.out.println(ans);

    }

    public long getC(int i, int j) {
        if (i < j) return 0;
        return factorial[i] * inverseFactorial[j] % MOD * inverseFactorial[i - j] % MOD;
    }

    public long inv(long x) {
        return pow(x, MOD - 2);
    }

    public long pow(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x % MOD;
            }
            n >>= 1;
            x = x * x % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}


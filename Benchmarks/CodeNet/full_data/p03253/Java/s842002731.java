import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();


        long result = 1;
        for (int i = 2; i*i <= m; i++) {
            int c = 0;
            while (m % i == 0) {
                c++;
                m /= i;
            }
            result = result * comb(c + n - 1, n - 1) % MOD;
        }
        if (m != 1) result = result * n % MOD;


        System.out.println(result);

        sc.close();
    }

    private static long modPow(long a, long b) {
        if (b == 0) return 1;
        long c = modPow(a, b/2);
        long ret = (c * c) % MOD;
        if (b % 2 == 1) ret = (ret * a) % MOD;
        return ret;
    }

    private static long comb(int x, int y) {
        if (y > x - y) return comb(x, x-y);
        long num = 1, denom = 1;

        for (int i = 1; i <= y; i++) {
            num = num * (x - i + 1) % MOD;
            denom = denom * i % MOD;
        }

        return num * modPow(denom, MOD-2) % MOD;
    }
}

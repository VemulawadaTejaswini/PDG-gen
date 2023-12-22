import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        long a;
        a = sc.nextLong();
        long b;
        b = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(n, a, b);
    }
}

class Solver {
    static final long MOD = 1000000007;

    public void solve(long n, long a, long b) {
        long all = iterativePow(2, n, MOD) % MOD;

        long allButA = calcSub(n, a, MOD);
        long allButB = calcSub(n, b, MOD);

        long ans = (all + MOD - 1) % MOD; // Ignore the case where no flower selected
        ans = (ans + MOD - allButA) % MOD;
        ans = (ans + MOD - allButB) % MOD;

        System.out.println(ans);
    }

    private long calcSub(long n, long k, long mod) {
        long x = permutation(n, k, mod);
        long y = permutation(k, k, mod);
        long invY = iterativePow(y, mod - 2, mod);

        return x * invY % mod;
    }

    private long permutation(long n, long k, long mod) {
        long ans = 1;
        for (long i = n - k + 1; i <= n; i++) {
            ans *= i;
            ans %= mod;
        }
        return ans;
    }

    private long invMod(long n, long mod) {
        return iterativePow(n, mod - 2, mod);
    }

    private long iterativePow(long n, long p, long mod) {
        if (p == 0) {
            return 1;
        }
        if (p % 2 == 0) {
            long pow = iterativePow(n, p / 2, mod);
            return pow * pow % mod;
        }
        return n * iterativePow(n, p - 1, mod) % mod;
    }
}


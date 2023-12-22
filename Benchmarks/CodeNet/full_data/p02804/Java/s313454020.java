import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MaxMinSums solver = new MaxMinSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class MaxMinSums {
        public static int MOD = 1000000007;
        static long[] fac;
        static long[] finv;
        static long[] inv;

        static void comInit(int max) {
            fac = new long[max + 1];
            finv = new long[max + 1];
            inv = new long[max + 1];

            // 階乗
            fac[0] = fac[1] = 1;
            // 逆元の階乗
            finv[0] = finv[1] = 1;
            // 逆元
            inv[1] = 1;

            for (int i = 2; i <= max; i++) {
                fac[i] = fac[i - 1] * i % MOD;
                inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
                finv[i] = finv[i - 1] * inv[i] % MOD;
            }
        }

        static long com(int n, int k) {
            if (n < k) {
                return 0;
            }
            return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            List<Long> list = new ArrayList<>();

            comInit(n);

            for (int i = 0; i < n; i++) {
                list.add(in.nextLong());
            }

            list.sort(Comparator.naturalOrder());

            long ans = 0;
            for (int i = 0; i < list.size(); i++) {
                if (n - i - 1 >= k - 1) {
                    ans -= com(n - i - 1, k - 1) * list.get(i);
                }
                if (i >= k - 1) {
                    ans += com(i, k - 1) * list.get(i);
                }
                ans %= MOD;
            }
            out.println(ans);
        }

    }
}


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

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
        BannedK solver = new BannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class BannedK {
        public static int MOD = 1000000007;
        static long[] fac;
        static long[] finv;
        static long[] inv;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] k = new int[n];

            comInit(n);

            HashMap<Integer, Integer> counter = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                counter.put(a, counter.getOrDefault(a, 0) + 1);
                k[i] = a;
            }

            HashMap<Integer, Long> pattern = new HashMap<>();
            for (Integer key : counter.keySet()) {
                pattern.put(key, com(counter.get(key), 2));
            }

            for (int i = 0; i < n; i++) {
                int a = k[i];
                int anum = counter.get(a);
                long result = 0;
                for (Integer key : pattern.keySet()) {
                    if (key == a) {
                        result += com(anum - 1, 2);
                    } else {
                        result += pattern.get(key);
                    }
                }
                out.println(result);
            }
        }

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

    }
}


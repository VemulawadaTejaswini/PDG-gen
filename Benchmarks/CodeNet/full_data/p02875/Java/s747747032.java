import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ProblemC_NoAbNoBa solver = new ProblemC_NoAbNoBa();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemC_NoAbNoBa {
        final int N = (int) (1e7 + 100);
        final int MOD = 998244353;
        int[] fact = new int[N];
        int[] inv = new int[N];
        int[] invFact = new int[N];
        int[] table = new int[7];
        Map<String, Boolean> cache = new HashMap<>();

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            if (false) {
                gen("");
                for (int i = 0; i < table.length; i++) {
                    int total = (int) Math.pow(3.0, 2 * i);
//            System.out.printf("%d\t%d\t%d\t%.2f\n", table[i], total - table[i], total, 100.0*table[i]/total);
                    System.out.printf("%d \n", table[i]);
                }
                System.out.println(Arrays.toString(table));
            }

            int n = in.nextInt();
            precalc();
            long ans = 1;
            for (int i = 0; i < n; i++) {
                ans = 3 * ans % MOD;
            }

            int[] p2 = new int[n + 1];
            p2[0] = 1;
            for (int i = 1; i < p2.length; i++) {
                p2[i] = 2 * p2[i - 1] % MOD;
            }

            for (int i = n / 2 + 1; i <= n; i++) {
                ans = (ans - 2L * p2[n - i] * C(n, i)) % MOD;
            }
            if (ans < 0) {
                ans += MOD;
            }
            out.println(ans);
        }

        private void precalc() {
            inv[1] = 1;
            for (int i = 2; i < N; i++) {
                inv[i] = (int) ((MOD - (MOD / i) * (long) inv[MOD % i] % MOD) % MOD);
            }
            fact[0] = 1;
            invFact[0] = 1;
            for (int i = 1; i < N; i++) {
                fact[i] = (int) (i * (long) fact[i - 1] % MOD);
                invFact[i] = (int) (inv[i] * (long) invFact[i - 1] % MOD);
            }
        }

        private int C(int n, int k) {
            if (k < 0 || k > n) {
                return 0;
            }
            long a = fact[n];
            long b = invFact[k] * (long) invFact[n - k] % MOD;
            return (int) (a * b % MOD);
        }

        private void gen(String s) {
            if (s.length() >= 14) {
                return;
            }
            if (s.length() == 6 && !isGood(s)) {
                System.out.println(s);
            }
            if (isGood(s)) {
                ++table[s.length() / 2];
            }
            for (char c0 = 'a'; c0 <= 'c'; c0++) {
                for (char c1 = 'a'; c1 <= 'c'; c1++) {
                    gen(s + c0 + c1);
                }
            }
        }

        private boolean isGood(String s) {
            if (cache.containsKey(s)) {
                return cache.get(s);
            }
            boolean res = s.isEmpty();
            for (int i = 0; i + 1 < s.length(); i++) {
                char c0 = s.charAt(i);
                char c1 = s.charAt(i + 1);
//            if (Math.min(c0, c1) == 'a' && Math.max(c0, c1) == 'b') {
//            if (c0 == 'a' && c1 == 'b') {
//                continue;
//            }
                if (c0 == 'a' && c1 == 'a' || c0 == 'b' && c1 == 'b') {
                    continue;
                }
                if (isGood(s.substring(0, i) + s.substring(i + 2))) {
                    res = true;
                    break;
                }
            }
            cache.put(s, res);
            return res;
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


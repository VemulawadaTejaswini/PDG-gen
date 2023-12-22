import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        S_DigitSum solver = new S_DigitSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class S_DigitSum {
        long mod = (int) 1e9 + 7;
        long[][] dp;
        int d;

        private long calc(String num) {
            int n = num.length();
            long ans = 0;
            int pref = 0;

            for (int i = 0; i < n; i++) {
                int x = num.charAt(i) - '0';
                for (int dig = 0; dig < x; dig++) {
                    int rem = (d - (pref + dig) % d) % d;
                    ans = (ans + dp[n - 1 - i][rem]) % mod;
                }
                pref += x;
            }
            if (pref % d == 0)
                ans++;
            return ans - 1 + mod;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String K = in.ns();
            int n = K.length();

            d = in.ni();
            dp = new long[n + 1][d];
            dp[0][0] = 1;

            for (int i = 0; i < n; i++) {
                for (int r = 0; r < d; r++) {
                    for (int a = 0; a <= 9; a++) {
                        int rem = (r + a) % d;
                        dp[i + 1][rem] = (dp[i + 1][rem] + dp[i][r]) % mod;
                    }
                }
            }
            out.println(calc(K) % mod);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
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

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}


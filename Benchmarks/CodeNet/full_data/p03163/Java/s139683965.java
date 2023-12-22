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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni(), W = in.ni();
            int[] w = new int[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.ni();
                v[i] = in.ni();
            }
            long[][] dp = new long[n + 1][W + 1];
            for (int i = 0; i < n; i++) {
                for (int ww = 0; ww < W; ww++) {
                    dp[i + 1][ww] = Math.max(dp[i + 1][ww], dp[i][ww]);
                    if (ww + w[i] <= W)
                        dp[i + 1][ww + w[i]] = Math.max(dp[i + 1][ww + w[i]], dp[i][ww] + v[i]);
                }
            }
            long max = 0;
            for (int ww = 0; ww <= W; ww++) {
                max = Math.max(max, dp[n][ww]);
            }
            out.println(max);

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


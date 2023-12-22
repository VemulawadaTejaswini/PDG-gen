import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BDoNotDuplicate solver = new BDoNotDuplicate();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDoNotDuplicate {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), a[] = new int[n * 2], prev[] = new int[(int) (2e5 + 10)];
            long K = in.nextLong(), dp[][] = new long[60][n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                a[i + n] = a[i];
            }

            Arrays.fill(dp[0], n + 1);
            Arrays.fill(prev, -1);
            for (int i = n * 2 - 1; i >= 0; --i) {
                if (i < n) {
                    dp[0][i] = prev[a[i]] - i + 1;
                }
                prev[a[i]] = i;
            }
            for (int k = 1; (1L << k) < n * K; ++k) {
                for (int i = 0; i < n; ++i) {
                    dp[k][i] = Math.min(dp[k - 1][(int) ((dp[k - 1][i] + i) % n)] + dp[k - 1][i], n * K + 1);
                }
            }

            long pos = 0;
            long steps = 0;
            while (true) {
                int k = 0;
                while (steps + dp[k][(int) pos] < n * (K - 1)) ++k;
                if (k == 0) break;
                steps += dp[k - 1][(int) pos];
                pos += dp[k - 1][(int) pos];
                pos %= n;
            }
            pos += dp[0][(int) pos];
            pos %= n;
            int ans[] = new int[n], tot = 0;

            while (pos < n) {
                if (dp[0][(int) pos] + pos <= n) pos += dp[0][(int) pos];
                else {
                    ans[tot++] = a[(int) pos];
                    ++pos;
                }
            }

            for (int i = 0; i < tot; ++i) out.printf("%d ", ans[i]);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}


/*input
3 4
1 2 3
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {

        final int MAXN = (int) (1e5) + 10;
        final long MOD = (long) (1e9) + 7;
        long a[] = new long[102];
        long dp[][] = new long[102][MAXN];

        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int n = in.nextInt(), k = in.nextInt();
            long sum = 0L;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= k; j++) {
                    dp[i][j] += dp[i][j - 1];
                    dp[i][j] %= MOD;
                }
                for (int j = 0; j <= k; j++) {
                    dp[i + 1][j] = dp[i][j];
                    int idx = (int) (j - a[i] - 1);
                    if (idx >= 0) {
                        dp[i + 1][j] -= dp[i][idx];
                    }
                    dp[i + 1][j] %= MOD;
                }
            }
            out.println(dp[n][k]);

        }

        

        public int max(int ...a) {
            int max = Integer.MIN_VALUE;
            for (int i : a) max = Math.max(max, i);
            return max;
        }

        public int min(int ...a) {
            int min = Integer.MAX_VALUE;
            for (int i : a) min = Math.min(min, i);
            return min;
        }

        public long max(long ...a) {
            long max = Long.MIN_VALUE;
            for (long i : a) max = Math.max(max, i);
            return max;
        }

        public long min(long ...a) {
            long min = Long.MAX_VALUE;
            for (long i : a) min = Math.min(min, i);
            return min;
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
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}


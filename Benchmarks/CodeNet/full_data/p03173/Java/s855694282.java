/*input
5
10 10 10 10 10
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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

        final int MAXN = (int) (4e2) + 10;
        long dp[][] = new long[MAXN][MAXN];
        final long INF = (long) (1e18);
        long a[] = new long[MAXN];
        long pre[] = new long[MAXN];

        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                pre[i + 1] = pre[i] + a[i];
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) dp[i][j] = INF;
            }
            out.println(solve(0, n - 1));

        }

        public long rangesum(int l, int r) {
            r++;
            return pre[r] - pre[l];
        }

        public long solve(int l, int r) {
            if (l >= r) return 0L;
            if (dp[l][r] != INF) return dp[l][r];
            long ans = INF, sum = 0L;
            for (int i = l; i < r; i++) {
                ans = min(ans, solve(l, i) + solve(i + 1, r) + rangesum(l, r));
            }
            return dp[l][r] = ans;
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


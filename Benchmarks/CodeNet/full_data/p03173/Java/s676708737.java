import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        int n;
        long[][] dp;
        long[] a;

        private void fill(int left, int right) {
            if (dp[left][right] != Long.MAX_VALUE) return;
            for (int i = 0; left + i < right; i++) {
                fill(left, left + i);
                fill(left + i + 1, right);

                long combine = sum(left, left + i) + sum(left + i + 1, right);
                dp[left][right] = Math.min(dp[left][right], dp[left][left+i] + dp[left+i+1][right] + combine);
            }
        }

        long[] sum;
        private long sum(int left, int right) {
            if (left == 0) return sum[right];
            return sum[right] - sum[left-1];
        }

        private void solve(InputReader inp, PrintWriter out) {
            n = inp.nextInt();
            dp = new long[n][n];

            a = new long[n];
            for (int i = 0; i < n; i++) a[i] = inp.nextInt();

            sum = new long[n];
            sum[0] = a[0];
            for (int i = 1; i < n; i++) sum[i] = sum[i-1] + a[i];

            for (long[] array: dp) Arrays.fill(array, Long.MAX_VALUE);
            for (int i = 0; i < n; i++) dp[i][i] = 0;

            fill(0, n - 1);

            out.print(dp[0][n-1]);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
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
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}


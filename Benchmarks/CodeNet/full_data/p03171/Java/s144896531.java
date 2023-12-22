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
        boolean[][] set;
        int[] a;

        private void res(int left, int right, boolean max) {
            if (left == right) return;
            if (!set[left+1][right]) res(left+1, right, !max);
            if (!set[left][right-1]) res(left, right-1, !max);
            if (max) dp[left][right] = Math.max(a[left] + dp[left+1][right], a[right] + dp[left][right-1]);
            else dp[left][right] = Math.min(-a[left] + dp[left+1][right], -a[right] + dp[left][right-1]);
            set[left][right] = true;
        }

        private void solve(InputReader inp, PrintWriter out) {
            n = inp.nextInt();
            dp = new long[n][n];
            set = new boolean[n][n];
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = inp.nextInt();
                set[i][i] = true;
                dp[i][i] = a[i];
                if (n % 2 == 0) dp[i][i] *= -1;
            }
            res(0, n-1, true);
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


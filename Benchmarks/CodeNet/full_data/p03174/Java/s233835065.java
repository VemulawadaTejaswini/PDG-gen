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
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            int maximumMask = (1 << n) - 1;

            long MOD = 1000000007;
            long[] dp = new long[maximumMask + 1];
            dp[0] = 1;

            boolean[][] match = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    match[i][j] = inp.nextInt() == 1;
                }
             }

            for (int i = 1; i <= n; i++) {
                int mask = 0;
                for (int j = 0; j < i; j++) mask = (mask << 1) | 1;

                while (mask <= maximumMask) {
                    for (int j = 0; j < n; j++) {
                        // if j'th position is a 1
                        if (((1 << j) & mask) > 0) {
                            int mask2 = mask ^ (1 << j);
                            if (match[j][i-1]) dp[mask] = (dp[mask] + dp[mask2]) % MOD;
                        }
                    }

                    // next mask with i bits
                    int c = mask & -mask;
                    int r = mask + c;
                    mask = (((r ^ mask) >> 2) / c) | r;
                }
            }
            out.print(dp[maximumMask]);
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
    }
}



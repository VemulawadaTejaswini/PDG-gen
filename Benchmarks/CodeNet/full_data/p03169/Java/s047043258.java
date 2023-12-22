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
        private int n;
        private double[][][] dp;

        private void calc(int i, int j, int k) {
            if (dp[i][j][k] >= 0) return;
            if (i > 0 && dp[i-1][j][k] == -1) calc(i - 1, j, k);
            if (j > 0 && dp[i+1][j-1][k] == -1) calc(i+1, j - 1, k);
            if (k > 0 && dp[i][j+1][k-1] == -1) calc(i, j+1, k - 1);
            dp[i][j][k] = 0;
            if (i > 0) dp[i][j][k] += i * dp[i-1][j][k] / (i + j + k);
            if (j > 0) dp[i][j][k] += j * dp[i+1][j-1][k] / (i + j + k);
            if (k > 0) dp[i][j][k] += k * dp[i][j+1][k-1] / (i + j + k);
            dp[i][j][k] += (double) n / (i + j + k);
        }

        private void solve(InputReader inp, PrintWriter out) {
            n = inp.nextInt();
            dp = new double[n+1][n+1][n+1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        dp[i][j][k] = -1;
                    }
                }
            }
            dp[0][0][0] = 0;
            int[] cnt = new int[4];
            for (int i = 0; i < n; i++) cnt[inp.nextInt()]++;
            calc(cnt[1], cnt[2], cnt[3]);
            out.println(dp[cnt[1]][cnt[2]][cnt[3]]);
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



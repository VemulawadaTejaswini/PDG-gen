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
 *
 * @author Coer
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int W = in.nextInt();
            int V = n * 1000;
            int[] w = new int[n + 1];
            int[] v = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }
            // 只考虑前i个物品的情况下，总价值是j所需最少容量值
            long[][] dp = new long[n + 1][V + 1];
            for (int i = 0; i <= V; i++) {
                if (i == 0) {
                    dp[0][i] = 0;
                } else {
                    dp[0][i] = Long.MAX_VALUE;
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= V; j++) {
                    if (v[i] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        if (dp[i - 1][j - v[i]] == Long.MAX_VALUE) {
                            dp[i][j] = dp[i - 1][j];
                        } else {
                            dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - v[i]] + w[i]);
                        }
                    }
                }
            }
            int ans = 0;
            for (int tot = 0; tot <= V; tot++) {
                if (dp[n][tot] <= W) {
                    ans = tot;
                }
            }
            out.println(ans);
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

    }
}
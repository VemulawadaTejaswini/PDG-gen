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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] heights = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                heights[i] = in.nextInt();
            }

            int[][] dp = new int[2][n + 1];

            for (int i = 2; i < n + 1; i++) {
                int cost1 = Math.abs(heights[i] - heights[i - 1]);
                int cost2 = Math.abs(heights[i] - heights[i - 2]);

                dp[0][i] = cost1 + Math.min(dp[0][i - 1], dp[1][i - 1]);
                dp[1][i] = cost2 + Math.min(dp[0][i - 2], dp[1][i - 2]);
            }

            out.println(Math.min(dp[0][n], dp[1][n]));
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


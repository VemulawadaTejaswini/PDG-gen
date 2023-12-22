import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int k = in.nextInt() - 1;

            long MOD = 1000000007;

            long[] fibo = {1, 1, 2, 3, 5, 8, 13, 21};

            long[][] dp = new long[h + 1][w];
            dp[0][0] = 1;
            for (int i = 1; i <= h; i++) {
                for (int j = 0; j < w; j++) {
                    dp[i][j] = dp[i - 1][j] * fibo[j] * fibo[w - 1 - j] % MOD;
                    if (j > 0) dp[i][j] = (dp[i][j] + dp[i - 1][j - 1] * fibo[j - 1] * fibo[w - 1 - j]) % MOD;
                    if (j < w - 1) dp[i][j] = (dp[i][j] + dp[i - 1][j + 1] * fibo[j] * fibo[w - 2 - j]) % MOD;
                }
            }

            out.println(dp[h][k]);
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}


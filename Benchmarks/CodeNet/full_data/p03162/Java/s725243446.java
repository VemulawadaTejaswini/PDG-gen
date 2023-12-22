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
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CVacation solver = new CVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CVacation {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            int[][] ar = new int[n][3];
            int[][] dp = new int[n][3];
            for (int i = 0; i < n; ++i) {
                ar[i][0] = in.ni();
                ar[i][1] = in.ni();
                ar[i][2] = in.ni();
            }
            dp[0][0] = ar[0][0];
            dp[0][1] = ar[0][1];
            dp[0][2] = ar[0][2];
            for (int i = 1; i < n; ++i) {
                for (int j = 0; j < 3; ++j) {
                    for (int j1 = 0; j1 < 3; ++j1) {
                        if (j1 != j)
                            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j1] + ar[i][j]);
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < 3; ++i) {
                ans = Math.max(ans, dp[n - 1][i]);
            }
            out.print(ans);
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

        public int ni() {
            return Integer.parseInt(next());
        }

    }
}


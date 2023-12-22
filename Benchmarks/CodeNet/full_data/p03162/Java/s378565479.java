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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[][] v = new int[n + 1][3];
            for (int i = 1; i < n + 1; i++) {
                v[i][0] = in.nextInt();
                v[i][1] = in.nextInt();
                v[i][2] = in.nextInt();
            }
            int[][] dp = new int[n + 1][3];
            for (int i = 0; i < 3; i++) {
                dp[1][i] = v[1][i];
            }
            for (int i = 2; i < n + 1; i++) {
                for (int cur = 0; cur < 3; cur++) {
                    for (int pre = 0; pre < 3; pre++) {
                        if (pre != cur) {
                            dp[i][cur] = Math.max(dp[i][cur], dp[i - 1][pre] + v[i][cur]);
                        }
                    }
                }
            }
            out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
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
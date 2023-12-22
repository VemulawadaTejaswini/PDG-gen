import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EGetEverything solver = new EGetEverything();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGetEverything {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[m];
            int[] c = new int[m];

            for (int i = 0; i < m; i++) {
                a[i] = in.nextInt();
                int b = in.nextInt();
                for (int j = 0; j < b; j++) {
                    int k = in.nextInt() - 1;
                    c[i] |= (1 << k);
                }
            }

            int target = (1 << n) - 1;
            int[][] dp = new int[m + 1][target + 1];
            for (int i = 0; i <= m; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }

            dp[0][0] = 0;

            for (int i = 0; i < m; i++) {
                for (int state = 0; state <= target; state++) {
                    if (dp[i][state] == Integer.MAX_VALUE)
                        continue;

                    dp[i + 1][state | c[i]] = Math.min(dp[i + 1][state | c[i]], dp[i][state] + a[i]);
                    dp[i + 1][state] = Math.min(dp[i + 1][state], dp[i][state]);
                }
            }

            int answer = dp[m][target];
            if (answer == Integer.MAX_VALUE)
                answer = -1;
            out.println(answer);
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


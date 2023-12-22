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
        TaskH solver = new TaskH();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskH {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int MODULO = (int) (1e+9) + 7;
            int n = in.nextInt();
            int m = in.nextInt();
            boolean[][] field = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                String s = in.next();
                for (int j = 0; j < m; j++)
                    if (s.charAt(j) == '.')
                        field[i][j] = true;
            }
            int[][] dp = new int[n][m];
            dp[0][0] = 1;
            for (int i = 1; i < m; i++) {
                if (field[0][i])
                    dp[0][i] = 1;
                else
                    break;
            }
            for (int i = 1; i < n; i++)
                if (field[i][0])
                    dp[i][0] = 1;
                else
                    break;
            for (int i = 1; i < n; i++)
                for (int j = 1; j < m; j++)
                    if (field[i][j])
                        dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % MODULO;
            out.println(dp[n - 1][m - 1]);
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


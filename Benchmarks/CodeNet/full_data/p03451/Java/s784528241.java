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
        Task1 solver = new Task1();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task1 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int[][] A = new int[2][N];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = in.nextInt();
                }
            }

            int[][] dp = new int[2][N];

            dp[0][0] = A[0][0];
            dp[1][0] = A[0][0] + A[1][0];

            for (int j = 1; j < N; j++) {
                dp[0][j] = A[0][j] + dp[0][j - 1];
                dp[1][j] = A[1][j] + Math.max(dp[0][j], dp[1][j - 1]);
            }

            out.println(dp[1][N - 1]);
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


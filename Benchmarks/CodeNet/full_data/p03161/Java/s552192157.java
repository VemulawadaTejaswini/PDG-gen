import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt(), K = in.nextInt();
            int[] stones = new int[N];
            for (int i = 0; i < N; i++)
                stones[i] = in.nextInt();

            int[] dp = new int[N];
            dp[0] = 0;

            for (int i = 1; i < N; i++) {
                dp[i] = Integer.MAX_VALUE;
                for (int j = 1; j <= K && (i - j) >= 0; j++) {
                    int jump = Math.abs(stones[i] - stones[i - j]) + dp[i - j];
                    dp[i] = Math.min(dp[i], jump);
                }
            }

            out.println(dp[N - 1]);
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


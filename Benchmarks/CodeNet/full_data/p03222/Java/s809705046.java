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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DNumberOfAmidakuji solver = new DNumberOfAmidakuji();
        solver.solve(1, in, out);
        out.close();
    }

    static class DNumberOfAmidakuji {
        final long mod = (long) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt(), K = in.nextInt();
            long dp[][] = new long[h + 10][w + 10];
            dp[0][0] = 1;
            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    for (int k = 0; k < 1 << (w - 1); ++k) {
                        boolean ok = true;
                        for (int l = 0; l < w - 2 && ok; ++l) {
                            if ((k >> l & 1) == 1 && (k >> (l + 1) & 1) == 1) ok = false;
                        }
                        if (ok) {
                            if ((k >> j & 1) == 1) {
                                dp[i + 1][j + 1] += dp[i][j];
                                dp[i + 1][j + 1] %= mod;
                            } else if (j > 0 && (k >> (j - 1) & 1) == 1) {
                                dp[i + 1][j - 1] += dp[i][j];
                                dp[i + 1][j - 1] %= mod;
                            } else {
                                dp[i + 1][j] += dp[i][j];
                                dp[i + 1][j] %= mod;
                            }
                        }
                    }
                }
            }
            out.println(dp[h][K - 1]);
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


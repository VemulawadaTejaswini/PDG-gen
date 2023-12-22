import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static final int MOD = (int) (1e9 + 7);

    public void solve(InputReader in, PrintWriter out) {
        int h = in.nextInt(), n = in.nextInt();
        int[] magics = new int[10001];
        for (int i = 1; i <= 10000; ++i) {
            magics[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt(), b = in.nextInt();
            magics[a] = Math.min(magics[a], b);
        }

        long[] dp = new long[h + 1];
        for (int i = 1; i <= h; ++i) {
            dp[i] = Long.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <= 10000; ++i) {
            if (magics[i] == Integer.MAX_VALUE) continue;
            for (int j = h; j >= 1; --j) {
                dp[j] = Math.min(dp[j], magics[i] * ((j + i - 1) / i));
                for (int k = 1; j - k * i > 0; ++k) {
                    if (dp[j - k * i] < Long.MAX_VALUE) {
                        dp[j] = Math.min(dp[j], dp[j - k * i] + magics[i] * k);
                    }
                }
            }
        }

        out.println(dp[h]);
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(in, out);
        out.flush();
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

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int[] val = new int[n];
        long[] prefix = new long[n];
        for (int i = 0; i < n; i++) {
            val[i] = in.nextInt();
            if (i == 0) {
                prefix[i] = val[i];
            } else {
                prefix[i] += prefix[i - 1] + val[i];
            }
        }

        long[][] dp = new long[n][n];
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0; i < n; i++) {
                if (i + gap < n) {
                    if (gap == 0) {
                        // dp[i][i + gap] = val[i];
                    } else if (gap == 1) {
                        dp[i][i + gap] = val[i] + val[i + gap];
                    } else {
                        long min = Integer.MAX_VALUE;
                        for (int p = i; p < i + gap; p++) {
                            min = Math.min(min, dp[i][p] + dp[p + 1][i + gap]);
                        }
                        dp[i][i + gap] = min + prefix[i + gap] - (i - 1 >= 0 ? prefix[i - 1] : 0);
                    }
                }
            }
        }

        out.println(dp[0][n - 1]);
        out.close();
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}

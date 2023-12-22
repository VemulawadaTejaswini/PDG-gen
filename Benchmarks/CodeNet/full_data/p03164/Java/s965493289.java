import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int w = in.nextInt();

        long[] wa = new long[n];
        int[] va = new int[n];
        int vsum = 0;
        for (int i = 0; i < n; i++) {
            wa[i] = in.nextInt();
            va[i] = in.nextInt();
            vsum += va[i];
        }
        vsum++;
        long[][] dp = new long[n][vsum + 1];
        for (int i = 0; i <= vsum; i++) {
            if (i == va[0]) {
                dp[0][va[0]] = wa[0];
            } else {
                dp[0][i] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= vsum; j++) {
                long val = (j - va[i] >= 0) ? wa[i] + dp[i - 1][j - va[i]] : Integer.MAX_VALUE;
                dp[i][j] = Math.min(dp[i - 1][j], val);
            }
        }

        long ans = 0;
        for (int k = 0; k < vsum; k++) {
            if (dp[n - 1][k] <= w) {
                ans = Math.max(ans, k);
            }
        }
        out.println(ans);
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

    }
}

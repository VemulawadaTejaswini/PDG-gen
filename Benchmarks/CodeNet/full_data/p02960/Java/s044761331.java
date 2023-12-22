import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static PrintWriter out = new PrintWriter(System.out);
    static long mod = 1000000007;

    void solve() {
        String s = scanner.next();
        int n = s.length();
        int[] mod13 = new int[n + 1];
        mod13[0] = 1;
        for (int i = 1; i <= n; i++) {
            mod13[i] = mod13[i - 1] * 10 % 13;
        }

        long[][] dp = new long[n + 1][13];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(n - i) == '?') {
                for (int m = 0; m < 10; m++) {
                    for (int j = 0; j < 13; j++) {
                        int k = (m * mod13[i - 1] + j) % 13;
                        dp[i][k] = (dp[i][k] + dp[i - 1][j]) % mod;
                    }
                }
            } else {
                for (int j = 0; j < 13; j++) {
                    int k = ((s.charAt(n - i) - '0') * mod13[i - 1] + j) % 13;
                    dp[i][k] = dp[i - 1][j] % mod;
                }
            }
        }
        out.println(dp[n][5]);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.close();
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] cost = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            cost[i] = a;
            for (int j = 0; j < b; j++) {
                c[i] += 1 << (scanner.nextInt() - 1);
            }
        }
        int[][] dp = new int[m + 1][1 << n];
        Arrays.fill(dp[0], 0x7fffff);
        dp[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            Arrays.fill(dp[i], 0x7fffff);
            for (int j = 0; j < 1 << n; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                dp[i][j | c[i - 1]] = Math.min(dp[i][j | c[i - 1]], dp[i - 1][j] + cost[i - 1]);
            }
        }
        System.out.println(dp[m][(1 << n) - 1] == 0x7fffff ? -1 : dp[m][(1 << n) - 1]);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

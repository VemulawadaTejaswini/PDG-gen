import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        long[][] dp = new long[n + 1][13];
        dp[0][0] = 1;
        int f = 1;

        for (int i = 0; i < n; i++) {
            char c = S.charAt(n - i - 1);
            if (c == '?') {
                for (int j = 0; j < 13; j++) {
                    for (int d = 0; d < 10; d++) {
                        dp[i + 1][(j + f * d) % 13] += dp[i][j];
                        dp[i + 1][(j + f * d) % 13] %= (int) 1e9 + 7;
                    }
                }
            } else {
                int d = c - '0';
                for (int j = 0; j < 13; j++) {
                    dp[i + 1][(j + f * d) % 13] += dp[i][j];
                    dp[i + 1][(j + f * d) % 13] %= (int) 1e9 + 7;
                }
            }
            f *= 10;
            f %= 13;
        }
        System.out.println(dp[n][5]);
    }
}

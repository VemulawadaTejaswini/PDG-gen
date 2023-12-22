import java.util.*;

public class Main {
    void run() {
        int MOD = (int) 1e9 + 7;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        int[][] dp = new int[n + 1][13];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            for (int j = 0; j < 13; j++) {
                if (c == '?') {
                    for (int k = 0; k < 10; k++) {
                        int nextJ = (10 * j + k) % 13;
                        dp[i + 1][nextJ] = (dp[i + 1][nextJ] + dp[i][j]) % MOD;
                    }
                } else {
                    int k = Character.getNumericValue(c);
                    int nextJ = (10 * j + k) % 13;
                    dp[i + 1][nextJ] = (dp[i + 1][nextJ] + dp[i][j]) % MOD;
                }
            }
        }

        System.out.println(dp[n][5]);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

import java.util.*;

public class Main {
    long[][][] dp;
    int mod  = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String K = sc.next();
        int D = sc.nextInt();

        Main instance = new Main();

        int res = (int) instance.solve(K, D);

        System.out.println(res);
    }

    public long solve(String K, int D) {
        int n = K.length();

        this.dp = new long[n][2][D];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < D; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        long res = dfs(0, K, D, 0, 0);

        return (res + mod - 1) % mod;
    }

    public long dfs(int index, String K, int D, int flag, int d) {
        if (index >= K.length()) {
            if (d == 0) return 1;
            else return 0;
        }

        if (dp[index][flag][d] != -1) return dp[index][flag][d];

        int ch = K.charAt(index) - '0';

        long res = 0;

        if (flag == 1) {
            for (int i = 0; i < 10; i++) {
                res += dfs(index + 1, K, D, 1, (d + i) % D);
                res %= mod;
            }
        } else {
            for (int i = 0; i < ch; i++) {
                res += dfs(index + 1, K, D, 1, (d + i) % D);
                res %= mod;
            }
            res += dfs(index + 1, K, D, 0, (d + ch) % D);
        }

        dp[index][flag][d] = res % mod;
        return dp[index][flag][d];

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        int vMax = 1000 * 100;
        long INF = Long.MAX_VALUE - 1000000000;
        long[][] dp = new long[N + 1][vMax + 1];

        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < vMax + 1; j++) {
                dp[i][j] = INF;
            }
        }
        dp[0][0] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= vMax; j++) {
                if (j >= v[i]) {
                    dp[i + 1][j] = Math.min(dp[i][j - v[i]] + w[i], dp[i][j]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }

        int result = 0;
        for (int i = 0; i <= vMax; i++) {
            if (dp[N][i] <= W) {
                result = i;
            }
        }

        System.out.println(result);
    }
}

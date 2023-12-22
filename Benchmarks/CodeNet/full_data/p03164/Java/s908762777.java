import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        int N = itr.nextInt();
        int W = itr.nextInt();

        int[] weight = new int[N];
        int[] value = new int[N];

        for (int i = 0; i < N; i++) {
            weight[i] = itr.nextInt();
            value[i] = itr.nextInt();
        }

        long[][] dp = new long[N][W + 1];
        for (int i = weight[0]; i <= W; i++) {
            dp[0][i] = (long) value[0];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= W; j++) {
                if (j > weight[i])
                    dp[i][j] = Math.max(dp[i - 1][j], (long)value[i] + dp[i - 1][j - weight[i]]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        System.out.println(dp[N - 1][W]);
    }
}
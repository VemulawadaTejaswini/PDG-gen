import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int N = sc.nextInt();

            int[] A = new int[N + 1];
            int[] B = new int[N + 1];
            for (int i = 0; i < N; i++) {
                A[i + 1] = sc.nextInt();
                B[i + 1] = sc.nextInt();
            }

            long[][] dp = new long[N + 2][H + 10000 + 2];

            for (int i = 0; i <= N; i++) {
                Arrays.fill(dp[i], Long.MAX_VALUE / 2);
                dp[i][0] = 0;
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= H + A[i]; j++) {
                    if (j < A[i]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - A[i]] + B[i]);
                    }
                }
            }

            long ans = Long.MAX_VALUE / 2;

            for (int i = dp[N].length - 1; i >= H; i--) {
                ans = Math.min(ans, dp[N][i]);
            }

            System.out.println(ans);
        }
    }

}

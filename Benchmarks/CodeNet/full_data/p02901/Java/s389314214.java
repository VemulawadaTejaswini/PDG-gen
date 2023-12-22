import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[M];
            int[] B = new int[M];
            int[] C = new int[M];
            for (int i = 0; i < M; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
                int c = 0;
                for (int j = 0; j < B[i]; j++) {
                    c += 1 << (sc.nextInt() - 1);
                }
                C[i] = c;
            }

            long[][] dp = new long[M + 1][1 << N];
            Arrays.fill(dp[0], Long.MAX_VALUE);
            dp[0][0] = 0;

            for (int i = 1; i <= M; i++) {
                System.arraycopy(dp[i - 1], 0, dp[i], 0, dp[i].length);

                for (int j = 0; j < (1 << N); j++) {
                    if (dp[i - 1][j] != Long.MAX_VALUE) {
                        int k = (j | C[i - 1]);
                        dp[i][k] = Math.min(dp[i][k], dp[i - 1][j] + A[i - 1]);
                    }
                }
            }

            long ans = dp[M][(1 << N) - 1];

            System.out.println(ans == Long.MAX_VALUE ? -1 : ans);
        }
    }

}

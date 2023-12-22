import java.util.Scanner;

/**
 * Vacation
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            long[][] dp = new long[3][N + 1];

            for (int i = 1; i <= N; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                dp[0][i] = a + Math.max(dp[1][i - 1], dp[2][i - 1]);
                dp[1][i] = b + Math.max(dp[2][i - 1], dp[0][i - 1]);
                dp[2][i] = c + Math.max(dp[0][i - 1], dp[1][i - 1]);
            }

            long ans = Math.max(dp[0][N], Math.max(dp[1][N], dp[2][N]));

            System.out.println(ans);
        }
    }

}

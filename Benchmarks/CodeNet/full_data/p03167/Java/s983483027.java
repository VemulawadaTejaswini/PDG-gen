import java.util.Scanner;

/**
 * Grid 1
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            boolean[][] G = new boolean[H][W];
            for (int i = 0; i < H; i++) {
                char[] c = sc.next().toCharArray();

                for (int j = 0; j < W; j++) {
                    if (c[j] == '.') {
                        G[i][j] = true;
                    }
                }
            }

            long[][] dp = new long[H][W];
            dp[0][0] = 1;

            for (int k = 1; k <= H + W - 2; k++) {
                for (int i = 0; i < H; i++) {
                    int j = k - i;

                    if (j < 0) {
                        break;
                    }

                    if (j >= W) {
                        continue;
                    }

                    if (!G[i][j]) {
                        continue;
                    }

                    if (i == 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
                    }
                }
            }

            System.out.println(dp[H - 1][W - 1]);
        }
    }

}

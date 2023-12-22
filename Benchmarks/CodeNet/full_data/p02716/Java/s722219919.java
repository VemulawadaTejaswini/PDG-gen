
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        long[][][] dp = new long[n + 1][n / 2 + 10][2];
        for (long[][] x: dp) {
            for (long[] x2: x) {
                Arrays.fill(x2, Integer.MIN_VALUE);
            }
        }
        dp[0][0][0] = 0;
        // dp[i][j][k] ... i番目までの整数列で、j個を使って、(直前の数を使っていなければk = 0)の最大値
//        debug(dp);
        for (int i = 0; i < n; i++) {
            for (int j = Math.max(0, i / 2 - 4); j <= i / 2 + 1; j++) {
                dp[i + 1][j + 1][1] = dp[i][j][0] + aArr[i];
                dp[i + 1][j][0] = Math.max(dp[i][j][0], dp[i][j][1]);
            }
        }
//        debug(dp);
        System.out.println(Math.max(dp[n][n / 2][0], dp[n][n / 2][1]));
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

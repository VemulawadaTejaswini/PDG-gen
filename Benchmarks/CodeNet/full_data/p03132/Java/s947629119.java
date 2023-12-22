import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
        }

        // 0 - hidari 0
        // 1 - hidari g
        // 2 - k
        // 3 - migi g
        // 4 - migi 0
        long INF = 2L << 60;
        long[][] dp = new long[l + 1][5];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < 5; j++) {
                dp[i][j] = INF;
            }
        }

        for (int i = 0; i < l; i++) {

            for (int j = 0; j < 5; j++) {
                long nex = 0;
                if (j == 0 || j == 4) {
                    nex = dp[i][j] + a[i];
                }
                if (j == 1 || j == 3) {
                    if (a[i] % 2 == 0 && a[i] != 0)
                        nex = dp[i][j];
                    else if (a[i] == 0) {
                        nex = dp[i][j] + 2;
                    } else {
                        nex = dp[i][j] + 1;
                    }

                }
                if (j == 2) {
                    if (a[i] % 2 == 1)
                        nex = dp[i][j];
                    else
                        nex = dp[i][j] + 1;
                }

                for (int k = j; k < 5; k++) {
                    dp[i + 1][k] = Math.min(dp[i + 1][k], nex);
                }
            }
        }
        long ans = dp[l][0];
        for (int i = 0; i < 5; i++) {
            ans = Math.min(ans, dp[l][i]);
        }
        System.out.println(ans);
    }

}

import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        // 主処理
        int[][] dp = new int[2][n];
        for (int i = 0; i < 2; i++) {
            int pre = 0;
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = a[i][j] + pre;
                    pre = dp[i][j];
                } else {
                    dp[i][j] = Math.max(a[i][j] + pre, a[i][j] + dp[i - 1][j]);
                    pre = dp[i][j];
                }
            }
        }
        int result = dp[1][n - 1];

        // 出力
        System.out.println(result);
        sc.close();
    }
}

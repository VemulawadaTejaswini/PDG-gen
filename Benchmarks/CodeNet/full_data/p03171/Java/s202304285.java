import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        long[][] dp = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][i] = 0;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 0; i + k <= n; i++) {
                int j = i + k;
                if ((n - k) % 2 == 0) {
                    dp[i][j] = Math.max(dp[i][j - 1] + a[j - 1], dp[i + 1][j] + a[i]);
                } else {
                    dp[i][j] = Math.min(dp[i][j - 1] - a[j - 1], dp[i + 1][j] - a[i]);
                }
            }
        }

        System.out.println(dp[0][n]);
    }
}

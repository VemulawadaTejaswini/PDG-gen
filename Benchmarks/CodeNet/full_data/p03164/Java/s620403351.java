import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long w = Long.parseLong(sc.next());
        long[] wary = new long[n];
        int[] vary = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            wary[i] = Long.parseLong(sc.next());
            vary[i] = Integer.parseInt(sc.next());
            if (max < vary[i]) {
                max = vary[i];
            }
        }
        long[][] dp = new long[n + 1][max * n + 1];
        Arrays.fill(dp[0], 1_000_000_005);
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max * n + 1; j++) {
                if (j < vary[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - vary[i]] + wary[i]);
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < max * n + 1; i++) {
            if (dp[n][i] <= w) {
                ans = Math.max(ans, i);
            }
        }
        System.out.println(ans);
    }
}
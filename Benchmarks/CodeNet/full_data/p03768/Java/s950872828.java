import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] aArr = new int[m];
        int[] bArr = new int[m];
        for (int i = 0; i < m; i++) {
            aArr[i] = sc.nextInt() - 1;
            bArr[i] = sc.nextInt() - 1;
        }
        int q = sc.nextInt();
        int[][] dp = new int[11][n];
        int[] colors = new int[q + 1];
        for (int i = 1; i <= q; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt();
            dp[y][x] = i;
            colors[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j], dp[i + 1][j]);
            }
            for (int j = 0; j < m; j++) {
                dp[i][aArr[j]] = Math.max(dp[i][aArr[j]], dp[i + 1][bArr[j]]);
                dp[i][bArr[j]] = Math.max(dp[i][bArr[j]], dp[i + 1][aArr[j]]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(colors[dp[0][i]]).append("\n");
        }
       System.out.print(sb);
    }
}

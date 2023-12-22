import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();
        int K = sc.nextInt();

        int[][][] dp = new int[c.length+1][K+1][2];
        dp[0][0][0] = 1;
        for (int i=0;i<c.length;i++) {
            for (int j=0;j<K+1;j++) {
                dp[i+1][j][0] += dp[i][j][0];
                dp[i+1][j][1] += dp[i][j][1];
            }
            for (int j=0;j<K;j++) {
                dp[i+1][j+1][0] += dp[i][j][0];
                dp[i+1][j+1][1] += 9*dp[i][j][1]+Math.max((int)c[i]-49, 0)*dp[i][j][0];
            }
        }
        System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[c.length][K][0]+dp[c.length][K][1]);
    }
}

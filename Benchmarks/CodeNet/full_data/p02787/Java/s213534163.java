
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] magic = new int[n][2];
        for (int i = 0; i < n; i++) {
            magic[i][0] = sc.nextInt();
            magic[i][1] = sc.nextInt();
        }
        int[] dp = new int[h + 1];
        for (int i = 0; i <= h; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < n; j++) {
                if (i - magic[j][0] <= 0) {
                    dp[i] = Math.min(dp[i], magic[j][1]);
                } else {
                    dp[i] = Math.min(dp[i], magic[j][1] + dp[i - magic[j][0]]);
                }
            }
        }
        System.out.println(dp[h]);
    }


    public static int log2(long x) {
        return (int) (Math.log(x) / Math.log(2));
    }
}

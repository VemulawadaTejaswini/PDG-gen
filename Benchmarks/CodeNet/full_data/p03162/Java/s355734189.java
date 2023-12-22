
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static int n = 0;

    public static int[][] happy = new int[100001][3];
    public static long[][] dp = new long[100001][4];
    public final static long oo = -1;

    public static long solve(int idx, int prev) {
        if (idx == n) {
            return 0;
        } else {
            if (dp[idx][prev] == -1) {
                long max = oo;
                for (int i = 0; i < 3; i++) {
                    if (i != prev) {
                        max = Math.max(max, solve(idx + 1, i) + happy[idx][i]);
                    }
                }
                return dp[idx][prev] = max;
            } else {
                return dp[idx][prev];
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100001; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = -1;
            }
        }
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                happy[i][j] = in.nextInt();
            }
        }
        long ans = solve(0, 3);
        System.out.println(ans);
    }

}

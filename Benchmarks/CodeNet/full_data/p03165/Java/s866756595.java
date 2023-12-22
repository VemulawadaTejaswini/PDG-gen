
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = " " + sc.next();
        String t = " " + sc.next();
        int lens = s.length(), lent = t.length();
        int[][] dp = new int[2][lent];
        String[][] ans = new String[2][lent];

        Arrays.fill(ans[0], "");
        dp[0][0] = 0;


        int x = 0;

        for (int i = 1; i < lens; i++) {
            x = 1 - x;
            Arrays.fill(dp[x], 0);
            Arrays.fill(ans[x], "");
            for (int j = 1; j < lent; j++) {
                if (s.charAt(i) == t.charAt(j) && dp[1 - x][j - 1] + 1 > dp[x][j]) {
                    dp[x][j] = dp[1 - x][j - 1] + 1;
                    ans[x][j] = ans[1 - x][j - 1] + s.charAt(i);
                }
                if (dp[x][j] < dp[1 - x][j]) {
                    dp[x][j] = dp[1 - x][j];
                    ans[x][j] = ans[1 - x][j];
                }
                if (dp[x][j] < dp[x][j - 1]) {
                    dp[x][j] = dp[x][j - 1];
                    ans[x][j] = ans[x][j - 1];
                }
            }
//            debug(dp[x]);
//            debug(ans[x]);
        }

        System.out.println(ans[x][lent - 1]);
    }
}

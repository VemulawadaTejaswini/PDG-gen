
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static int n = 0, m = 0;
    public static char grid[][] = null;
    public static long[][] dp = new long[1001][1001];

    public static long solve(int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else {
            if (dp[i][j] == -1) {
                long c1 = 0;
                long c2 = 0;
                if (j < m - 1 && grid[i][j + 1] == '.') {
                    c1 = solve(i, j + 1);
                }
                if (i < n - 1 && grid[i + 1][j] == '.') {
                    c2 = solve(i + 1, j);
                }
                return dp[i][j] = c1 + c2;
            } else {
                return dp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                dp[i][j] = -1;
            }
        }
        n = in.nextInt();
        m = in.nextInt();
        grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = in.next();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        System.out.println(solve(0, 0));
    }

}

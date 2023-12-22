import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int INF = (int) 1e9 + 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        solve(scanner, writer);
        scanner.close();
        writer.close();
    }

    private static final int MOD = (int) Math.pow(10, 9) + 7;
    public static void solve(Scanner scanner, PrintWriter writer) {
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        char[][] m = new char[rows][];
        for (int i = 0; i < rows; i++) {
            m[i] = scanner.next().toCharArray();
        }

        // dp[i][j] denote number of paths to square (i,j)
        // dp[i][j] = dp[i-1][j] + dp[i][j-1] if m[i][j] is '.'
        // dp[i][j] = 0 if [i][j] is '#'
        // base case: dp[0][0] = 1;
        int[][] dp = new int[rows][];
        for (int i = 0; i < rows; i++) {
            dp[i] = new int[columns];
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (m[i][j] == '#') {
                    dp[i][j] = 0;
                } else if (i - 1 < 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j - 1 < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    dp[i][j] %= MOD;
                }
            }
        }

        //for (int i = 0; i < rows; i++) {
        //    writer.println(Arrays.toString(dp[i]));
        //}

        int ans = dp[rows-1][columns-1];

        writer.println(ans);
    }
}

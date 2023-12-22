import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int odd = scanner.nextInt();
        long mod = 1_000_000_007;
        long[][][] dp = new long[num + 1][num + 1][odd + 1];
        dp[0][0][0] = 1;
        for (int i = 1; i <= num; i++)
            for (int j = 0; j <= i; j++)
                for (int k = 2 * j; k <= odd; k++) {
                    if (j > 0) {
                        dp[i][j][k] = dp[i - 1][j - 1][k - 2 * j];
                    }
                    dp[i][j][k] += (2 * j + 1) * dp[i - 1][j][k - 2 * j];
                    if (j < num) {
                        dp[i][j][k] += (j + 1) * (j + 1) * dp[i - 1][j + 1][k - 2 * j];
                    }
                    dp[i][j][k] %= mod;
                }
        System.out.println(dp[num][0][odd]);
    }
}
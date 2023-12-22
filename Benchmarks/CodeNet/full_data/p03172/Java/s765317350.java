import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int candies = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = scanner.nextInt();
        }

        long[][] dp = new long[count + 1][candies + 1];
        dp[0][0] = 1;
        for (int i = 0; i <= count; ++i) {
            for (int j = 0; j <= candies; ++j) {
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                    if (j > arr[i - 1]) {
                        dp[i][j] -= dp[i - 1][j - arr[i - 1] - 1];
                    }
                }
                if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
                dp[i][j] = dp[i][j] % 1000000007;
            }
        }

        long ans = dp[count][candies];
        if (candies > 0) {
            ans -= dp[count][candies - 1];
        }
        System.out.println(ans);
    }
}

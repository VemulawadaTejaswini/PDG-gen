import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int count = scanner.nextInt();
        double[] arr = new double[count + 1];
        for (int i = 1; i <= count; ++i) {
            arr[i] = scanner.nextDouble();
        }

        double[][] dp = new double[count + 1][count + 1];
        double res = 0.0;
        dp[0][0] = 1.0;
        for (int i = 0; i <= count; ++i) {
            for (int j = 0; i + j <= count; ++j) {
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j] * arr[i + j];
                }
                if (j > 0) {
                    dp[i][j] += dp[i][j - 1] * (1.0 - arr[i + j]);
                }
                if (i + j == count && i > j) {
                    res += dp[i][j];
                }
            }
        }

        System.out.println(res);
    }
}
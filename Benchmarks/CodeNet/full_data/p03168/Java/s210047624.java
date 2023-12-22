import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final float[] ps = new float[n + 1];
        for (int i = 1; i <= n; i++) {
            ps[i] = in.nextFloat();
        }
        // [win count][current]
        float[][] dp = new float[n + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] * (1 - ps[i]);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                float f1 = dp[i - 1][j - 1] * ps[j];
                float f2 = dp[i][j - 1] * (1 - ps[j]);
                dp[i][j] = f1 + f2;
            }
        }
        float result = 0;
        for (int i = n / 2 + 1; i <= n; i++) {
            result += dp[i][n];
        }
        System.out.println(result);

    }
}

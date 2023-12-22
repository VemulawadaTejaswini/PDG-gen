import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] AB = new int[N][2];
        for (int i = 0; i < N; i++) {
            AB[i][0] = sc.nextInt();
            AB[i][1] = sc.nextInt();
        }

        Arrays.sort(AB, (a, b) -> a[0] - b[0]);

        int max = 0;
        int[][] dp = new int[N+1][T];

        for (int i = 0; i < N; i++) {
            int a = AB[i][0];
            int b = AB[i][1];
            for (int j = T - 1; j >= 0; j--) {
                dp[i+1][j] = dp[i][j];
                if (j >= a) {
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j-a] + b);
                }
            }
            max = Math.max(max, dp[i][T-1] + b);
        }
        System.out.println(max);
    }
}

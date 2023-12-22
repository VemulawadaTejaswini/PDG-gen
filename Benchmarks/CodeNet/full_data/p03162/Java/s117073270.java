import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] input = new long[3][n];
        for (int i = 0; i < n; i++) for (int k = 0; k < 3; k++) input[k][i] = scanner.nextInt();
        long[][] dp = new long[3][n];
        for (int i = 0; i < 3; i++) dp[i][0] = input[i][0];
        for (int i = 1; i < n; i++)
            for (int k = 0; k < 3; k++)
                for (int p = 0; p < 3; p++)
                    if (p != k) dp[k][i] = Math.max(dp[k][i], input[k][i] + dp[p][i - 1]);
        System.out.println(Math.max(dp[0][n - 1], Math.max(dp[1][n - 1], dp[2][n - 1])));

    }


}

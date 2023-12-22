import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int res = 0;
        int[][] dp = new int[N][S + 1];
        dp[0][0] = 1;
        for (int i = 1; i < N; i++) {
            dp[i][0] = 1;
            res += dp[i][0];
        }
        for (int j = 1; j < S + 1; j++) {
            dp[0][j] = A[0] == S ? 1 : 0;
            res += dp[0][j];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < S + 1; j++) {
                int c1 = 0;
                if (A[i] <= j) {
                    c1 = dp[i - 1][j - A[i]];
                }
                int c2 = dp[i - 1][j];
                dp[i][j] = c1 + c2;
                res += dp[i][j];
            }
        }
        System.out.println(res);
    }
}
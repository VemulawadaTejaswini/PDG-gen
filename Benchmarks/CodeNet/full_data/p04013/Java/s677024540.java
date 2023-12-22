import java.util.Scanner;

public class Main {
    static long[][][] dp;
    static int[] x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        dp = new long[n+1][n+1][50*50+100];
        x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        dp[0][0][0] = 1;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < a * n; j++) {
                    dp[k+1][i + 1][j + x[k]] += dp[k][i][j];
                    dp[k+1][i][j] += dp[k][i][j];
                }
            }
        }
        long ret = 0;
        for (int i = 1; i <= n; i++) {
            ret += dp[n][i][a*i];
        }
        System.out.println(ret);
    }
}
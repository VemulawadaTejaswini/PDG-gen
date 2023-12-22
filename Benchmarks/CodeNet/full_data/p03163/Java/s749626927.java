import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] wt = new int[n];
        int[] v = new int[n];

        for(int i = 0; i < n; i++){
            wt[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        long[][] dp = new long[n+1][w+1];

        for(int i = 0; i < n+1; i++){
            dp[i][0] = 0;
        }

        for(int i = 0; i < w+1; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < w+1; j++){
                dp[i][j] = Math.max(dp[i-1][j],j-wt[i-1] >= 0 ? dp[i-1][j-wt[i-1]]+v[i-1] : 0);
            }
        }

        System.out.println(dp[n][w]);
    }
}

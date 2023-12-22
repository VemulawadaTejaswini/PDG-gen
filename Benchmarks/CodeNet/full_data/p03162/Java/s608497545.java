import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] al = new int[N+1];
        int[] bl = new int[N+1];
        int[] cl = new int[N+1];

        for (int i = 1; i <= N; i++) {
            al[i] = sc.nextInt();
            bl[i] = sc.nextInt();
            cl[i] = sc.nextInt();
        }

        int[][] dp = new int[N+1][3];

        dp[0][0]  = 0;
        dp[0][1]  = 0;
        dp[0][2]  = 0;
        for (int i = 1; i <= N; i++) {
            dp[i][0] =  Math.max(dp[i-1][1], dp[i-1][2]) + al[i];
            dp[i][1] =  Math.max(dp[i-1][0], dp[i-1][2]) + bl[i];
            dp[i][2] =  Math.max(dp[i-1][0], dp[i-1][1]) + cl[i];            
        }
        System.out.println(Math.max(Math.max(dp[N][0], dp[N][1]), dp[N][2]));

    }
}
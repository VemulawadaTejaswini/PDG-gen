import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[][] dp = new int[3][N];
        dp[0][0] = a[0];
        dp[1][0] = b[0];
        dp[2][0] = c[0];

        for(int i=1; i<N; i++) {
            dp[0][i] = Math.max(dp[0][i-1]+b[i], dp[0][i-1]+c[i]);
            dp[1][i] = Math.max(dp[1][i-1]+c[i], dp[1][i-1]+a[i]);
            dp[2][i] = Math.max(dp[2][i-1]+a[i], dp[2][i-1]+b[i]);
        }


        System.out.println(Math.max(Math.max(dp[0][N-1], dp[1][N-1]), dp[2][N-1]));
    }
}
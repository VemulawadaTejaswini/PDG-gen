import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++) {
            h[i] = in.nextInt();
        }
        int[] dp = new int[n];
        dp[n-1] = 0;
        dp[n-2] = 0;
        dp[n-2] = Math.abs(h[n-1]-h[n-2]);
        for(int i=n-3; i>=0; i--) {
            dp[i] = Math.min(Math.abs(h[i+1]-h[i])+dp[i+1], Math.abs(h[i+2]-h[i])+dp[i+2]);
        }
        System.out.println(dp[0]);
    }
}

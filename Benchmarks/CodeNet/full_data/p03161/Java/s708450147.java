import java.util.Scanner;

public class Main {
    static public void main(String args[]){
        final int INF = (int)1e10;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] h = new long[n];
        long[] dp = new long[n];
        for(int i = 0; i < n ; i++){
            h[i] = sc.nextLong();
            dp[i] = INF;
        }
        dp[0] = 0;
        dp[0] = 0;

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 1 ; j <= k ; j++) {
                if (i + k < n) {
                    dp[i + k] = Math.min(dp[i + k], dp[i] + Math.abs(h[i + k] - h[i]));
                }
            }
        }

        System.out.println(dp[n-1]);
    }
}

import java.util.Scanner;

public class Main {
    static public void main(String args[]){
        final int INF = (int)1e8;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] h = new int[n];
        int[] dp = new int[n];
        for(int i = 0; i < n ; i++){
            h[i] = sc.nextInt();
            dp[i] = INF;
        }
        dp[0] = 0;
        
        for(int i = 0 ; i < n-1 ; i++){
            dp[i+1] = Math.min(dp[i+1], dp[i]+Math.abs(h[i+1]-h[i]));
            if(i+2 < n){
                dp[i+2] = Math.min(dp[i+2], dp[i]+Math.abs(h[i+2]-h[i]));
            }
        }

        System.out.println(dp[n-1]);
    }
}

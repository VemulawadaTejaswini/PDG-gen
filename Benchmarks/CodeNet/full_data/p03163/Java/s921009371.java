import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int []weights = new int[n];
        int []values =  new int[n];
        for(int i=0;i<n;i++){
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }
        long [][]dp = new long[n+1][w+1];
        for(int i=1;i<=n;++i){
            for(int k = 1;k<=w;++k ) {
                if(weights[i-1]<=k){
                    dp[i][k] = Math.max(dp[i-1][k],values[i-1]+dp[i-1][k-weights[i-1]]);
                }else{
                    dp[i][k] = Math.max(dp[i][k-1],dp[i-1][k]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}

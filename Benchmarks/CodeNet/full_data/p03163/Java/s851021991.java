import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int[] weight = new int[n];
        long[] values = new long[n];

        for(int i =0; i< n; i++) {
            weight[i] = in.nextInt();
            values[i] = in.nextLong();
        }

        long[][] dp = new long[n+1][w+1];

        for(int i =0; i<=n; i++){
            for(int j =0; j<=w; j++){
               if(i==0 || j ==0) dp[i][j] = 0;
               else if(weight[i-1]<=j) {
                 dp[i][j] = Math.max(values[i-1] + dp[i-1][j-weight[i-1]],
                    dp[i-1][j]);
               } else{
                dp[i][j] = dp[i-1][j];
               }
            }
        }

        System.out.println(dp[n][w]);
    }
}

import java.io.*;
import java.util.*;
public class Main {
    static long MOD = 1000*1000*1000 + 7;
    public static void main(String args[]) {
        int n = 0;
        
        int[][] met = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            met = new int[n][n];
            for(int i = 0; i < n ;i++) {
                for(int j = 0; j < n ;j++) {
                    met[i][j] = scanner.nextInt();
                }
            }
        }
        
        long[][] dp = new long[n + 1][1<<n];
        dp[0][0] = 1;
        for(int m = 1; m <= n; m++) {
            for(int wmask = 0; wmask < (1<<n) ; wmask++) {
                for(int w = 0; w < n; w++) {
                    if((wmask & (1<<w)) ==0 && met[m-1][w] == 1){
                        int newWMask = wmask | (1<<w);
                        dp[m][newWMask] += dp[m-1][wmask]; 
                        // System.out.println(dp[m][newWMask] + " " + newWMask + " " + wmask);
                        if(dp[m][newWMask] >= MOD)
                            dp[m][newWMask] -= MOD;
                    }
                }
            }
        }
        // for(long[] d: dp)
        //     System.out.println(Arrays.toString(d));
        System.out.println(dp[n][(1<<n) - 1]);
        
    }
    
}
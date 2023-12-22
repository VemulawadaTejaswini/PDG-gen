import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        int n = 0, k = 0;
        int[][] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            
            arr = new int[n][3];
            for (int i=0; i < n; i++) {
                for(int j = 0; j < 3 ; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
        }
        int[][] dp = new int[n + 1][3];
        //dp[i][j] = max happiness for day i and j activity;
        int ret = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < 3; j++) {
                dp[i][j] = 0;
                for(int a = 0; a < 3; a++) {
                    if(j != a) {
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][a] + arr[i-1][j]);
                    }
                }
                ret = Math.max(ret, dp[i][j]);
            }
        }
        // for(int[] ar : dp)
        //     System.out.println(Arrays.toString(ar));
        System.out.println(ret);
        
    }
}
import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        int n = 0, w = 0;
        int[][] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            w = scanner.nextInt();
            
            arr = new int[n][2];
            for (int i=0; i < n; i++) {
                for(int j = 0; j < 2 ; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
        }
        long[][] dp = new long[n + 1][w + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<= w ; j++) {
                dp[i][j] = dp[i - 1][j];
                if(j-arr[i-1][0] >= 0)
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - arr[i-1][0]] + arr[i-1][1]);
            }
        }
        
        System.out.println(dp[n][w]);
        
    }
}
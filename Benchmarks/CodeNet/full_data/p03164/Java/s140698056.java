import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] weight = new int[n];
        int[] value  = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            value[i]  = sc.nextInt();
        }
        // Let's think about dp[n][v] = mini-weight to get value 'v' of n madeno things
        
        long[][] dp = new long[n][100001];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 100001; j++) {
                if (i == 0) {
                    if (value[i] < j) {
                        dp[i][j] = 1000000;
                    } else {
                        dp[i][j] = weight[i];
                    }
                } else {
                    if (j - value[i] < 0) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.min(dp[i-1][j-value[i]] + weight[i], dp[i-1][j]); // add or not 
                    }      
                }
            }    
        }
        for (int i = 100000; i >= 0 ; i--) {
            if (dp[n-1][i] <= w) {
                System.out.println(i);
                break;
            } else {
                continue;
            }
        }
        sc.close();
    }
}

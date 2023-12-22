import java.util.*;
import java.lang.*;

public class Main {
    
    static int n;
    static int[] h;
    static int[][] dp;
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = new int[n];
        dp = new int[n][2];
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        //System.out.println("---");
        
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                dp[i][0] = Math.abs(h[i] - h[i + 1]);
                if (i + 2 < n) {
                    dp[i][1] = Math.abs(h[i] - h[i + 2]);
                } else {
                    dp[i][1] = 0;
                }
            } else {
                dp[i][0] = 0;
                dp[i][1] = 0;
            }
            //System.out.println(i + ": " + "(" + dp[i][0] + ", " + dp[i][1] + ")");
        }
        
        ans = checkCost(0, 0);
        System.out.println(ans);
    }
    
    static int checkCost(int i, int sum) {
        
        if (i == n - 1) {
            return sum += 0;
        }
        if (i == n - 2) {
            return sum += dp[i][1];
        }
        
        return sum += Math.min(checkCost(i + 1, sum + dp[i][0]),
                               checkCost(i + 2, sum + dp[i][1]));
    }
}

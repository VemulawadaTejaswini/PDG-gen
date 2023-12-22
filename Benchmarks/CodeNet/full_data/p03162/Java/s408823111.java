import java.util.*;
import java.math.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();
        long dp[][]  = new long[n+100][3];
        long h[][]   = new long[n+100][3];
        
        for (int i = 0; i < n; i++) {
            for (int b = 0; b < 3; b++) {
                h[i][b] = sc.nextInt();
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < 3; s++) {
                for (int x = 0; x < 3; x++) {
                    if (s == x) continue;
                    dp[i+1][x] = Math.max(dp[i+1][x], h[i][x] + dp[i][s]);
                }
            }
        }
        
        long ans = 0;
        for (long aa : dp[n]) {
            if (ans < aa) ans = aa;
        }
        System.out.println(ans);
    }
}

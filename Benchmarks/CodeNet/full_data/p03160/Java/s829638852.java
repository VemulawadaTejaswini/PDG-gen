import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long h[] = new long[n+101];
        long dp[] = new long[n+101];
        final long INF = 10000001;
        
        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n + 101; i++) {
            dp[i] = INF;
        }
        dp[0] = 0;
        
        for(int i = 0; i < n; i++) {
            for (int a = 1; a <= k; a++) {
                dp[i+a] = Math.min(dp[i] + Math.abs(h[i] - h[i+a]), dp[i+a]);
            }
        }
        
        System.out.println(dp[n - 1]);
    }
}

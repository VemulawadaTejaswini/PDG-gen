import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt() - 1;
        int[] weights = new int[n];
        long[] values = new long[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextLong();
        }
        
        long[][] dp = new long[n + 1][W + 1];
        for (int w = 0; w <= W; w++) {
            dp[0][w] = 0;
        }        
        long[][] prev_w = new long[n + 1][W + 1];
        
        for (int i = 0; i < n; i++) {
            for (int w = 0; w <= W; w++) {
                if (weights[i] <= w) {
                    dp[i + 1][w] = Math.max(dp[i][w - weights[i]] + values[i], dp[i][w]);
                    if (dp[i][w - weights[i]] + values[i] > dp[i][w]) {
                        prev_w[i+1][w] = w - weights[i];
                    } else {
                        prev_w[i+1][w] = w;
                    }
                } else {
                    dp[i + 1][w] = dp[i][w];
                    prev_w[i+1][w] = w;
                }
            }
        }
        
        Set<Integer> set = new HashSet<Integer>();
        int cur_w = W;
        for (int i = n-1; i >= 0; --i) {
            // 選んでいた場合
            if (prev_w[i+1][cur_w] == cur_w - weights[i]) {
                set.add(i);
            }
            
            // 復元テーブルをたどる
            cur_w = (int)prev_w[i+1][cur_w];
        }
        
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(i)) continue;
            max = Math.max(max, (int)values[i]);
        }
        System.out.println(dp[n][W] + max);
        
    }
} 
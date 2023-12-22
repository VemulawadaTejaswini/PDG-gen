import java.util.Scanner;

/**
 * @author yoshizaki
 * EDCP A
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // 足場の数
        int node = scanner.nextInt();
        // 足場の高さの配列
        int[] height = new int[node];
        // DP用配列
        int[] dp = new int[node];
        // 足場の高さを取得
        for (int i = 0 ; i < node ; i ++) height[i] = scanner.nextInt();
        // DP用配列の初期化
        for(int i = 0; i < node; i++) dp[i] = 10000;
        // 初期条件 初めのコストはゼロ
        dp[0] = 0;
        
        for (int i = 1; i < node; ++i) {
            int cost = dp[i-1] + Math.abs(height[i] - height[i-1]);
            if (dp[i] > cost) dp[i] = cost; 
            if (i <= 1) continue;
            int cost2 = dp[i-2] + Math.abs(height[i] - height[i-2]);
            if (dp[i] > cost2) dp[i] = cost2;
        }
        System.out.println(dp[node -1]);
    }
}
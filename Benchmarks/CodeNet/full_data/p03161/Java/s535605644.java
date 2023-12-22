import java.util.*;
public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] height = new int[n];

        for(int ind = 0; ind < n; ind++) {
            height[ind] = sc.nextInt();
        }

        int[] dp = new int[n];

        for(int ind = 1; ind < n; ind++) {

            int i = ind - 1;
            int minCost = Integer.MAX_VALUE;
            while(i >= 0 && ind - i <= k) {
                minCost = Math.min(minCost, Math.abs(height[ind] - height[i]) + dp[i]);
                i--;
            }
            dp[ind] = minCost;
        }

        System.out.println(dp[n - 1]);
    }
}

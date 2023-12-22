import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[0] = 1000000000;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(h[i - 1] - h[i]), dp[i - 2] + Math.abs(h[i - 2] - h[i]));
        }
        System.out.println(dp[n]);
    }
}
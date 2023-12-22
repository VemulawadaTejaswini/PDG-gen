import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[0] = 1000000000;
        for (int i = 2; i <= n; i++) {
            int min = 1000000000;
            for (int j = 1; j <= k && j < i; j++) {
                min = Math.min(dp[i - j] + Math.abs(h[i - j] - h[i]), min);
            }
            dp[i] = min;
        }
        System.out.println(dp[n]);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] h = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        sc.close();

        Arrays.fill(dp, (int)2e9);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(h[i] - h[i+1]));
            } 
            if (i + 2 < n) {
                dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(h[i] - h[i+2]));
            }
        }

        System.out.println(dp[n-1]);        
    }
}
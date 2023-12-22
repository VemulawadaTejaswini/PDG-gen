import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // educational dp 2

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        long[] dp = new long[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            int limit = Math.min(i + k + 1, n);
            for (int j = i + 1; j < limit; j++) {
                long cost = Math.abs(list[i] - list[j]) + dp[i];
                if (dp[j] == -1) {
                    dp[j] = cost;
                } else {
                    dp[j] = Math.min(dp[j], cost);
                }
            }
        }
        System.out.println(dp[n - 1]);
    }
}
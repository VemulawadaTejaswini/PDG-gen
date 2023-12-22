

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) h[i] = in.nextInt();
        System.out.println(minCost(N, K, h));
    }

    public static int minCost(int N, int K, int[] h) {
        int[] dp = new int[N];
        for (int i = 1; i < N; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i - 1; j >= 0 && j >= i - K; j--) {
                min = Math.min(min, dp[j] + Math.abs(h[i] - h[j]));
            }
            dp[i] = min;
        }
        return dp[N - 1];
    }
}

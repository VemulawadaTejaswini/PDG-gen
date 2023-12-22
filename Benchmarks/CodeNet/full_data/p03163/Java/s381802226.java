/**
 * Knapsack problem
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        // w = weights, v = values
        int[] w = new int[N];
        int[] v = new int[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        sc.close();

        int[] dp = new int[1000000];

        for (int i = 0; i < N; i++) {
            for (int j = W; j >= 0; j--) {
                if (j + w[i] <= W) {
                    dp[j + w[i]] = Math.max(dp[j + w[i]], dp[j] + v[i]);
                }
            }
        }

        int res = 0;
        for (int i = 0; i <= W; i++) {
            res = Math.max(dp[i], res);
        }

        System.out.println(res);
    }
}
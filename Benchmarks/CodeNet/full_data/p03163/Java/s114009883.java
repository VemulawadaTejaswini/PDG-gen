import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int W = scanner.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
//        System.out.println(solve(W, w, v));
        System.out.println(solve2(W, w, v));
    }

    private static long solve(int W, int[] w, int[] v) {
        long[][] dp = new long[w.length][W + 1];
        for (int i = 0; i < dp.length; ++i)
            Arrays.fill(dp[i], -1);
        return findMax(0, w, v, W, dp);
    }

    private static long findMax(int ind, int[] w, int[] v, int W, long[][] dp) {
        if (ind > w.length - 1)
            return 0;
        if (dp[ind][W] >= 0)
            return dp[ind][W];
        long res;
        if (w[ind] > W) {
             res = findMax(ind + 1, w, v, W, dp);
        } else {
            res = Math.max(
                    v[ind] + findMax(ind + 1, w, v, W - w[ind], dp),
                    findMax(ind + 1, w, v, W, dp));
        }
//        System.out.println("ind:" + ind + " W:" + W);
        dp[ind][W] = res;
        return res;
    }

    private static long solve2(int W, int[] w, int[] v) {
//        for (int ind = w.length - 1; ind >= 0; --ind) {
//            for (int i = 0)
//        }
        long[][] dp = new long[w.length][W + 1];
        for (int i = 0; i < dp.length; ++i)
            Arrays.fill(dp[i], 0);
        for (int ww = 1; ww <= W; ++ww) {
            for (int ind = 0; ind < w.length; ++ind) {
                if (w[ind] <= ww) {
                    if (ind == 0) {
                        dp[ind][ww] = v[ind];
                    } else {
                        dp[ind][ww] = Math.max(v[ind] + dp[ind - 1][ww - w[ind]], dp[ind - 1][ww]);
                    }
                } else if (ind > 0) {
                    dp[ind][ww] = dp[ind - 1][ww];
                }
            }
        }
        return dp[w.length - 1][W];
    }
}

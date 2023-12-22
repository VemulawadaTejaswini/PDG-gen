import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
        System.out.println(solve(W, w, v));
//        System.out.println(solve2(W, w, v));
    }

    private static long solve(int W, int[] w, int[] v) {
        long[][] dp = new long[w.length][W + 1];
        for (int i = 0; i < dp.length; ++i)
            Arrays.fill(dp[i], -1);
//        return findMax(0, w, v, W, new HashMap<>());
        return findMaxArr(0 , w, v, W, dp);
    }

    private static long findMax(int ind, int[] w, int[] v, int W, Map<Integer, Map<Integer, Long>> cache) {
        if (ind > w.length - 1)
            return 0;
//        String key = ind + "_" + W;
        Map<Integer, Long> cache2 = cache.get(ind);
        if (cache2 != null && cache.get(ind).containsKey(W))
            return cache.get(ind).get(W);
        long res;
        if (w[ind] > W) {
            res = findMax(ind + 1, w, v, W, cache);
        } else {
            res = Math.max(
                    v[ind] + findMax(ind + 1, w, v, W - w[ind], cache),
                    findMax(ind + 1, w, v, W, cache));
        }
//        System.out.println("ind:" + ind + " W:" + W);
        if (cache2 == null) {
            cache2 = new HashMap<>();
        }
        cache2.put(W, res);
        cache.put(ind, cache2);
        return res;
    }

    private static long findMaxArr(int ind, int[] w, int[] v, int W, long[][] dp) {
        if (ind > w.length - 1)
            return 0;
        if (dp[ind][W] > -1)
            return dp[ind][W];
        long res;
        if (w[ind] > W) {
            res = findMaxArr(ind + 1, w, v, W, dp);
        } else {
            res = Math.max(
                    v[ind] + findMaxArr(ind + 1, w, v, W - w[ind], dp),
                    findMaxArr(ind + 1, w, v, W, dp));
        }
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

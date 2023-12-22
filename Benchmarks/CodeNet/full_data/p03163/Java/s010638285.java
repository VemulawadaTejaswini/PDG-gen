import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int W = reader.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            w[i] = reader.nextInt();
            v[i] = reader.nextInt();
        }
        System.out.println(solve(w, v, W));
    }

    private static long solve(int[] w, int[] v, int W) {
        boolean[] taken = new boolean[w.length];
        long[][] dp = new long[w.length][W + 1];
        for (int i = 0; i < w.length; ++i)
            Arrays.fill(dp[i], -1);
        long max = calcMax(-1, w, v, W, w.length, taken, dp);
//        System.out.println(Arrays.toString(dp));
        return max;

    }

    private static long calcMax(int ind, int[] w, int[] v, int W, int n, boolean[] taken, long[][] dp) {
        if (ind >= 0 && dp[ind][W] >= 0)
            return dp[ind][W];
        long max = 0;
        for (int i = 0; i < taken.length; ++i) {
            if (!taken[i] && (W - w[i] >= 0)) {
                taken[i] = true;
                max = Math.max(calcMax(i, w, v, W - w[i], n - 1, taken, dp), max);
                dp[i][W] = max;
                taken[i] = false;
            }
        }
        long res = max;
        if (ind >= 0) {
            res += v[ind];
//            dp[ind] = res;
        }
        return res;
//        return res;
    }
}

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static long knapsack2(long[] w, int[] v, long C) {
        int n = w.length;

        int max_v = 100000; // N <= 100, v[i] <= 1000
        long[] dp = new long[max_v+1]; // value为dp[i]需要的最小权重
        Arrays.fill(dp, Integer.MAX_VALUE);
        

        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = max_v; j >= 1; j--) {
                if (j >= v[i-1]) {
                    dp[j] = Math.min(dp[j], dp[j- v[i-1]]+w[i-1]);
                }
            }
        }

        long ans = 0;
        for (int j = max_v; j >= 1; j--) {
            if (dp[j] <= C) {
                ans = j;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long C = in.nextLong();

        long[] w = new long[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i]  = in.nextLong();
            v[i] = in.nextInt();
        }
        in.close();

        // call function hear
        long ret = knapsack2(w, v, C);
        System.out.println(ret);
    }
}
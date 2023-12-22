
import java.util.Scanner;

class Main {
    private static long maxKnapsack(int[] ws, long[] vs, int idx, int total, long[][] dp) {
        if (total <= 0 || idx == ws.length) return 0;

        if (dp[idx][total] != 0) {
            return dp[idx][total];
        }
        long loot1 = 0;
        if (ws[idx] <= total)
            loot1 = vs[idx] + maxKnapsack(ws, vs, idx + 1, total - ws[idx], dp);

        dp[idx][total] = Math.max(loot1, maxKnapsack(ws, vs, idx + 1, total, dp));
        return dp[idx][total];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt();
        int[] ws = new int[n];
        long[] vs = new long[n];

        long[][] dp = new long[n][w + 1];
        for (int i = 0; i < n; i++) {
            ws[i] = sc.nextInt();
            vs[i] = sc.nextInt();
        }
        System.out.println(maxKnapsack(ws, vs, 0, w, dp));
    }
}


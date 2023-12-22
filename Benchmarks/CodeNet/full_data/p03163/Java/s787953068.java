import java.util.Scanner;

class Main {
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
        //System.out.println(maxKnapsack(ws, vs, 0, w, dp));
        System.out.println(maxKnapsack(ws, vs, w));
    }

    private static long maxKnapsack(int[] ws, long[] vs, int w) {
        long[] dp = new long[w + 1];
        for (int i = 0; i < ws.length; i++) {
            for (int s = 1; s <= w; s++) {
                if (s >= ws[i]) {
                    dp[s] = Math.max(dp[s - ws[i]] + vs[i], dp[s]);
                }
            }
        }
        return dp[w];
    }
}


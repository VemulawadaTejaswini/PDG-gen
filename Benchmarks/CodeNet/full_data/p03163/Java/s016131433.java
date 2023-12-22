import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();

        int[] wt = new int[N];
        int[] val = new int[N];

        for (int i = 0; i < N; i++) {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }

        System.out.println(knapsack(W,N,wt,val));
    }

    static long knapsack(int W, int N, int[] wt, int[] val) {

        long[][] dp = new int[N+1][W+1];

        for (int i = 0; i <= N; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) 
                    dp[i][w] = 0;
                else if (wt[i-1] <= w) {
                    long a = val[i-1] + dp[i-1][w-wt[i-1]];
                    long b = dp[i-1][w];
                    dp[i][w] = Math.max(a,b);
                } else
                    dp[i][w] = dp[i-1][w];
            }
        }

        return dp[N][W];
    }
}






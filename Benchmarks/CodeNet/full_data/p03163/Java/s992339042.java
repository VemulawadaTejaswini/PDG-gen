import java.util.*;

class Main {

    int N, W;

    int[] w,v;

    long[][] dp;

    private void run() {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        W = sc.nextInt();

        w = new int[N];
        v = new int[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        dp = new long[W+1][N];

        System.out.println(sack(W, 0));
    }

    private long sack(int W, int i) {
        if (i >= N) return 0;
        if (dp[W][i] != 0) return dp[W][i];

        long a = sack(W, i+1);
        long b = 0;
        if (W-w[i] >= 0) { 
            b = sack(W - w[i], i + 1) + v[i];
        }
        System.out.println(dp[W][i]);
        dp[W][i] = Math.max(a,b);
        return dp[W][i];
    }

    public static void main(String[] args) {
        Main solver = new Main();
        solver.run();
    }
}

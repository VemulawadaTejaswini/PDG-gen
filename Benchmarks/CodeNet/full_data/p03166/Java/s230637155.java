
import java.util.*;

public class Main {
    
    long INF = Long.MAX_VALUE;
    long[] dp;
    int N;
    ArrayList<ArrayList<Integer>> G;
    int MAX_M = 100000;
    int MAX_N = 100000;
    
    public static void main(String[] args) {
        new Main().solve();
    }
    
    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        dp = new long[N + 1];
        Arrays.fill(dp, -1);
        G = new ArrayList<ArrayList<Integer>>(N + 1);
        for (int i = 0; i <= N; i++) {
            G.add(i, new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            G.get(x).add(y);
        }
        long res = 0;
        for(int v = 1;v <= N;v++){
            res = Math.max(res, rec(v));
        }
        System.out.println(res);
    }

    // dp[i]: iを始点としたときの最大の最大値
    long rec(int i) {
        long res = 0;
        if (dp[i] != -1) {
            return dp[i];
        }
        for (int j : G.get(i)) {
            res = Math.max(res, rec(j) + 1);
        }
        return dp[i] = res;
    }
}

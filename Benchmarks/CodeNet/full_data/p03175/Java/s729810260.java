import java.util.ArrayList;
import java.util.Scanner;

class DpP {
    static int n, ans;
    final static int N = (int)1e5+5, MOD = (int)1e9+7;
    static ArrayList<Integer>[] g = new ArrayList[N];
    static int[][] dp = new int[N][2];

    static int dfs(int vertex, int parent, int color){
        if(dp[vertex][color] != -1){
            return dp[vertex][color];
        }
        dp[vertex][color] = 1;
        for(int child : g[vertex]){
            if(child != parent){
                if(color == 1){
                    dp[vertex][color] *= dfs(child, vertex, 1);
                }
                else {
                    dp[vertex][color] *= (dfs(child, vertex, 0) + dfs(child, vertex, 1));
                }
                dp[vertex][color] %= MOD;
            }
        }
        return dp[vertex][color];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0; i < N; ++i){
            g[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < n - 1; ++i){
            int x, y;
            x = in.nextInt();
            y = in.nextInt();
            g[x].add(y);
            g[y].add(x);
        }
        for(int i = 0; i < N; ++i) {
           dp[i][0] = -1;
           dp[i][1] = -1;
        }
        ans = 0;
        ans += dfs(1, 0, 0);
        ans %= MOD;
        ans += dfs(1, 0, 1);
        ans %= MOD;
        System.out.println(ans);
    }
}

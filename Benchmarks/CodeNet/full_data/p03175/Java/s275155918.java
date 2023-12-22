import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            int v1 = sc.nextInt() - 1;
            int v2 = sc.nextInt() - 1;
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }

        long[][] dp = new long[N][2];
        int m = (int) 1e9 + 7;

        dfs(map, 0, -1, dp, m);


        System.out.println((dp[0][0] + dp[0][1]) % m);


    }

    public static void dfs(Map<Integer, List<Integer>> map, int cur, int parent, long[][] dp, int m) {
        dp[cur][0] = 1;
        dp[cur][1] = 1;

        for (int next : map.get(cur)) {
            if (next == parent) continue;
            dfs(map, next, cur, dp, m);
            dp[cur][0] *= dp[next][1];
            dp[cur][0] = dp[cur][0] % m;
            dp[cur][1] *= dp[next][0] + dp[next][1];
            dp[cur][1] = dp[cur][1] % m;
        }
    }
}

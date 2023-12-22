import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Longest Path
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<Integer>[] edges = new List[N + 1];
            for (int i = 1; i <= N; i++) {
                edges[i] = new ArrayList<>();
            }

            boolean[] count = new boolean[N + 1];

            for (int i = 0; i < M; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                edges[x].add(y);
                count[y] = true;
            }

            int[] dp = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                if (!count[i]) {
                    dfs(dp, i, 0, edges);
                }
            }

            int max = 0;
            for (int d : dp) {
                max = Math.max(max, d);
            }

            System.out.println(max);
        }
    }

    static void dfs(int[] dp, int v, int d, List<Integer>[] edges) {
        for (Integer e : edges[v]) {
            int ei = e.intValue();

            dp[ei] = Math.max(dp[ei], d + 1);

            dfs(dp, ei, dp[ei], edges);
        }
    }

}

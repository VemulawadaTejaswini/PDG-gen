import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph = new ArrayList[110000];
    static int[] dp = new int[110000];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Arrays.fill(dp,0,n, -1);
        for (int i = 0; i < m; ++i) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            if (graph[x] == null)
                graph[x] = new ArrayList<>();
            graph[x].add(y);
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            res = Math.max(res, solve(i));
        }
        System.out.println(res-1);
    }

    private static int solve(int a) {
        if (dp[a] != -1)
            return dp[a];
        int res = 0;
        if(graph[a]!= null) {
            for (int i = 0; i < graph[a].size(); ++i) {
                res = Math.max(res, solve(graph[a].get(i)) + 1);
            }
        }else {
            res = 1;
        }
        return dp[a] = res;
    }
}
/*
 *
 */
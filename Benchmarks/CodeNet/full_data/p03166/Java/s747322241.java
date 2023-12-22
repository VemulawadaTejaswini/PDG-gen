import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

class Main {
    static boolean[] visited;
    static int[] from;
    static int[] to;
    static int n;
    static int m;
    static ArrayList<Integer> topo;
    static Deque<Integer> stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        from = new int[m];
        to = new int[m];
        stack = new ArrayDeque<Integer>();
        visited = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < m; i++) {
            from[i] = sc.nextInt() - 1;
            to[i] = sc.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        for (int i = 0; i < n; i++) {
            int pos = stack.pop();
            dp[pos] = Math.max(0, dp[pos]);
            for (int j = 0; j < m; j++) {
                if (from[j] == pos) {
                    dp[to[j]] = Math.max(dp[pos] + 1, dp[to[j]]);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
        sc.close();
    }

    public static void dfs(int v) {
        visited[v] = true;
        for (int i = 0; i < m; i++) {
            if (from[i] == v) {
                if (!visited[to[i]]) {
                    dfs(to[i]);
                }
            }
        }
        stack.push(v);
    }
}
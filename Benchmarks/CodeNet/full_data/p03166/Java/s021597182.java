import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] go;
    static int n;
    static int m;
    static Deque<Integer> stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        go = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            go[i] = new ArrayList<Integer>();
        }
        stack = new ArrayDeque<Integer>();
        visited = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            go[x].add(y);
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
            for (Integer next : go[pos]) {
                dp[next] = Math.max(dp[pos] + 1, dp[next]);
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
        for (Integer next : go[v]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
        stack.push(v);
    }
}
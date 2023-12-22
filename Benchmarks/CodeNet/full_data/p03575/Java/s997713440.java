import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[m];
        int[] b = new int[m];
        boolean[][] graph = new boolean[n][n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            int aa = Integer.parseInt(sc.next());
            int bb = Integer.parseInt(sc.next());
            a[i] = aa - 1;
            b[i] = bb - 1;
            graph[a[i]][b[i]] = true;
            graph[b[i]][a[i]] = true;
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            graph[a[i]][b[i]] = false;
            graph[b[i]][a[i]] = false;
            for (int j = 0; j < n; j++) {
                visited[j] = false;
            }
            dfs(n, 0, graph, visited);
            boolean bridge = false;
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    bridge = true;
                }
            }
            if (bridge) {
                ans++;
            }
            graph[a[i]][b[i]] = true;
            graph[b[i]][a[i]] = true;
        }
        System.out.println(ans);
    }

    private static void dfs(int n, int v, boolean[][] graph, boolean[] visited) {
        visited[v] = true;
        for (int i = 0; i < n; i++) {
            if (!graph[v][i]) {
                continue;
            }
            if (visited[i]) {
                continue;
            }
            dfs(n, i, graph, visited);
        }
    }
}
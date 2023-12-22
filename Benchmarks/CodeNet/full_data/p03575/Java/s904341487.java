import java.util.Scanner;

public class Main {

    private static int n;
    private static boolean[][] graph;
    private static boolean[] visited;

    private static void dfs(int v) {
        visited[v] = true;
        for (int v2 = 0; v2 < n; v2++) {
            if (!graph[v][v2] || visited[v2]) {
                continue;
            }
            dfs(v2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        graph = new boolean[n][n];
        visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            graph[a[i] - 1][b[i] - 1] = true;
            graph[b[i] - 1][a[i] - 1] = true;
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            graph[a[i] - 1][b[i] - 1] = false;
            graph[b[i] - 1][a[i] - 1] = false;
            for (int j = 0; j < n; j++) {
                visited[j] = false;
            }
            dfs(0);

            boolean bridge = false;
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    bridge = true;
                }
            }
            if (bridge) {
                result += 1;
            }
            graph[a[i] - 1][b[i] - 1] = true;
            graph[b[i] - 1][a[i] - 1] = true;
        }
        System.out.println(result);
    }

}

import java.util.*;

public class Main {
    static int n, m;
    static List<Integer>[] graph;
    static int[] distance;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList[n+1];
        distance = new int[n+1];
        Arrays.setAll(graph, i -> new ArrayList<>());
        Arrays.fill(distance, -1);
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
        }
        for (int i=1; i<=n; i++) {
            dfs(i, 0);
        }
        int maxDist = 0;
        for (int i : distance) maxDist = Math.max(maxDist, i);
        System.out.println(maxDist);
    }
    static void dfs(int u, int dist) {
        distance[u] = Math.max(distance[u], dist);
        for (int v : graph[u]) {
            if (distance[v] < 1 + dist) {
                dfs(v, dist+1);
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    static class Graph {
        int V;
        List<Integer> adj[];
        int[] indegree;
        public Graph(final int V) {
            this.V = V;
            adj = new List[V];
            indegree = new int[V];
            for(int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
        }
        public void addEdge(int u, int v) {
            adj[u].add(v);
            indegree[v]++;
        }
    }
    public static int max = 0;
    public static void dfs(Graph g, int i, boolean[] visited, int edges) {
        max = Math.max(max, edges);
        visited[i] = true;
        for(int j : g.adj[i]) {
            dfs(g, j, visited, edges + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Graph g = new Graph(n);
        for(int i = 0; i < m; i++) {
            g.addEdge(sc.nextInt() - 1, sc.nextInt() - 1);
        }
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(g.indegree[i] == 0) {
                dfs(g, i, visited, 0);
            }
        }
        System.out.println(max);
    }
}

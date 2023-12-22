import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    static class Graph {
        int V;
        List<Integer> adj[];
        int[] indegree;
        int[] dist;
        public Graph(final int V) {
            this.V = V;
            adj = new List[V];
            indegree = new int[V];
            dist = new int[V];
            for(int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
        }
        public void addEdge(int u, int v) {
            adj[u].add(v);
            indegree[v]++;
        }
    }
    public static void dfs(Graph g, int i, boolean[] visited) {
        if(visited[i]) {
            return;
        }
        visited[i] = true;
        for(int j : g.adj[i]) {
            g.dist[j] = Math.max(g.dist[j], g.dist[i] + 1);
            --g.indegree[j];
            if(g.indegree[j] == 0) {
                dfs(g, j, visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m == 0) {
            System.out.println(0);
            return;
        }
        Graph g = new Graph(n);
        for(int i = 0; i < m; i++) {
            g.addEdge(sc.nextInt() - 1, sc.nextInt() - 1);
        }
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(g.indegree[i] == 0) {
                dfs(g, i, visited);
            }
        }
        int max = 0;
        for(int d : g.dist) {
            if(max < d) {
                max = d;
            }
        }
        System.out.println(max);
    }
}

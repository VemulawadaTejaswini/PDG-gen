import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Graph {
    ArrayList<Integer>[] graph;

    @SuppressWarnings("unchecked")
    Graph(int n) {
        graph = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
    }
    public void addEdge(int u, int v) {
        graph[u].add(v);
    }
    public ArrayList<Integer> neighbors(int u) {
        return graph[u];
    }
}

public class Main {
    static Graph g;
    static boolean[] visited;
    static int distance[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();

        g = new Graph(n);
        visited = new boolean[n];
        distance = new int[n];

        for(int i = 0; i < m; i++) {
            int u = in.nextInt(), v = in.nextInt();
            u--; v--;
            g.addEdge(u, v);
        }
        int mx = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                distance[i] = 0;
                mx = Math.max(mx, go(i));
                visited[i] = true;
            }
        }

        System.out.println(mx);
    }

    private static int go(int u) {
        if(visited[u]) return distance[u];
        visited[u] = true;
        for (int v : g.neighbors(u)) {
            distance[v] = go(v);
            distance[u] = Math.max(distance[u], distance[v] + 1);
        }
        return distance[u];
    }

}
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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        g = new Graph(n);
        for(int i = 0; i < m; i++) {
            int u = in.nextInt(), v = in.nextInt();
            u--; v--;
            g.addEdge(u, v);
        }
        boolean[] visited = new boolean[n];
        int mx = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                mx = Math.max(mx, go(i));
                visited[i] = true;
            }
        }

        System.out.println(mx - 1);
    }

    private static int go(int u) {
        int ans = 0;
        for (int v : g.neighbors(u)) {
            ans = Math.max(ans, go(v));
        }
        return ans + 1;
    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        if (N == 1) {
            System.out.println(0);
            return;
        }
        List<Integer>[] graph = new List[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        Edge[] edges = new Edge[N-1];
        for (int i = 0; i < N-1; i++) {
            int u = scan.nextInt()-1;
            int v = scan.nextInt()-1;
            int w = scan.nextInt();
            graph[u].add(i);
            graph[v].add(i);
            Edge e = new Edge();
            e.id = i;
            e.from = u;
            e.to = v;
            e.weight = w;
            edges[i] = e;
        }
        int max_degree = 0;
        int root = -1;
        for (int i = 0; i < N; i++) {
            if (max_degree < graph[i].size()) {
                max_degree = graph[i].size();
                root = i;
            }
        }
        int[] colors = new int[N];
        Arrays.fill(colors, -1);
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        colors[root] = 0;
        while(!queue.isEmpty()) {
            int node = queue.poll();
            int color = colors[node];
            visited[node] = true;
            for (int edge_id : graph[node]) {
                Edge e = edges[edge_id];
                int next = e.from == node ? e.to : e.from;
                if (visited[next]) {
                    continue;
                }
                if (e.weight % 2 == 1) {
                    colors[next] = (color + 1) % 2;
                } else {
                    colors[next] = color;
                }
                queue.add(next);
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(colors[i]);
        }
    }
    class Edge {
        int id;
        int from;
        int to;
        int weight;
    }
}

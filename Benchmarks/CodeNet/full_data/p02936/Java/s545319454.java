import java.util.*;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static void dfs(int at, int prev) {
        if (visited[at]) return;
        visited[at] = true;
        if (prev != -1) counter[at] += counter[prev];

        List<Edge> edges = graph.get(at);
        for (Edge edge : edges) {
            if (visited[edge.to]) continue;
            dfs(edge.to, at);
        }
    }

    static int N;
    static int Q;
    static List<List<Edge>> graph;
    static long[] counter;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next()); 
        Q = Integer.parseInt(sc.next());
        visited = new boolean[N];
        Arrays.fill(visited, false);
        counter = new long[N];
        Arrays.fill(counter, 0);
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < N-1; ++i) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            graph.get(a).add((new Edge(a, b)));
            graph.get(b).add((new Edge(b, a)));
        }

        for (int i = 0; i < Q; ++i) {
            int id = Integer.parseInt(sc.next()) - 1;
            long x = Integer.parseInt(sc.next());
            counter[id] += x;
        }

        dfs(0, -1);

        for (int i = 0; i < N; ++i)
            System.out.print(counter[i] + " ");
        System.out.println();
    }
}
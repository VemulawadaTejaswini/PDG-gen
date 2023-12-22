import java.util.*;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static void dfs(int at, int x) {
        if (visited[at]) return;
        List<Edge> edges = graph.get(at);
        visited[at] = true;
        counter[at] += x;

        for (Edge edge : edges) {
            if (visited[edge.to]) continue;
            dfs(edge.to, x);
        }
    }

    static int N;
    static int Q;
    static List<List<Edge>> graph;
    static int[] counter;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        counter = new int[N];
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < N-1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add((new Edge(a, b)));
        }

        for (int i = 0; i < Q; ++i) {
            int node = sc.nextInt() - 1;
            int x = sc.nextInt();
            visited = new boolean[N];
            dfs(node, x);
        }

        for (int i = 0; i < N; ++i) {
            System.out.print(counter[i]);
            if (i != N-1)
                System.out.print(" ");
        }
    }
}
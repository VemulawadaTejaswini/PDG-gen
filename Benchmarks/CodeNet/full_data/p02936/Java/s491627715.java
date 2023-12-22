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
        N = sc.nextInt();
        Q = sc.nextInt();
        visited = new boolean[N];
        counter = new long[N];
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < N-1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add((new Edge(a, b)));
            graph.get(b).add((new Edge(b, a)));
        }

        for (int i = 0; i < Q; ++i) {
            int id = sc.nextInt() - 1;
            long x = sc.nextLong();
            counter[id] += x;
        }

        dfs(0, -1);

        for (int i = 0; i < N; ++i) {
            System.out.print(counter[i]);
            if (i != N-1)
                System.out.print(" ");
        }
        System.out.println();
    }
}
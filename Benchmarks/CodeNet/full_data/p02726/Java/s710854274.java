import java.util.*;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static void bfs(int at) {
        visited = new boolean[N];
        visited[at] = true;

        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(at);

        while (!deq.isEmpty()) {
            int node = deq.poll();
            List<Edge> edges = graph.get(node);

            for (Edge e : edges) {
                if (visited[e.to]) continue;

                dist[at][e.to] = dist[at][node] + 1;
                visited[e.to] = true;
                deq.offer(e.to);
            }
        }
    }

    static int N;
    static List<List<Edge>> graph;
    static int[][] dist;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next()) - 1;
        int Y = Integer.parseInt(sc.next()) - 1;
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());
        dist = new int[N][N];
        for (int i = 0; i < N; ++i) Arrays.fill(dist[i], 0);

        for (int i = 0; i < N-1; ++i) {
            graph.get(i).add(new Edge(i, i+1));
            graph.get(i+1).add(new Edge(i+1, i));
        }
        graph.get(X).add(new Edge(X, Y));
        graph.get(Y).add(new Edge(Y, X));

        for (int i = 0; i < N; ++i) {
            bfs(i);
        }

        int[] res = new int[N];
        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j < N; ++j) {
                ++res[dist[i][j]];
            }
        }

        for (int k = 1; k <= N-1; ++k)
            System.out.println(res[k]);
    }
}
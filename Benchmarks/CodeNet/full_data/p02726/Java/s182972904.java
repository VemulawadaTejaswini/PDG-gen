import java.util.*;

public class Main {

    static class Edge {
        int from, to;
        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static void bfs(int start) {
        visited = new boolean[n];
        visited[start] = true;

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(start);

        while (!deque.isEmpty()) {
            Integer node = deque.poll();
            List<Edge> edges = graph.get(node);

            for (Edge edge : edges) {
                if (visited[edge.to]) continue;
                dist[start][edge.to] = dist[start][node] + 1;
                visited[edge.to] = true;
                deque.offer(edge.to);
            }
        }
    }

    static void createGraph() {
        graph = new ArrayList<>();
        for (int i = 0; i < n; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < n - 1; ++i) {
            graph.get(i).add(new Edge(i, i + 1));
            graph.get(i + 1).add(new Edge(i + 1, i));
        }
    }

    static int n;
    static int x;
    static int y;
    static int[][] dist;
    static boolean[] visited;
    static List<List<Edge>> graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
        createGraph();
        graph.get(x).add(new Edge(x, y));
        graph.get(y).add(new Edge(y, x));
        dist = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                dist[i][j] = 0;
            }
        }

        for (int i = 0; i < n; ++i) {
            bfs(i);
        }

        int[] arr = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                arr[dist[i][j]]++;
            }
        }

        for (int i = 1; i < n; ++i) {
            System.out.println(arr[i]);
        }
    }
}
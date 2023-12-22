import java.util.*;

public class Main {

    static class Edge {
        int from, to, id;

        public Edge(int from, int to, int id) {
            this.from = from;
            this.to = to;
            this.id = id;
        }
    }

    static class Pair {
        int nodeId, prevColor;

        public Pair(int nodeId, int prevColor) {
            this.nodeId = nodeId;
            this.prevColor = prevColor;
        }
    }

    static void bfs(int start) {
    }

    static void createEmptyGraph() {
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i)
            graph.add(new ArrayList<>());
    }

    static List<List<Edge>> graph;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        createEmptyGraph();
        for (int i = 0; i < N-1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(new Edge(a, b, i));
            graph.get(b).add(new Edge(b, a, i));
        }
        int maxColor = 0;
        for (int i = 0; i < N; ++i) maxColor = Math.max(maxColor, graph.get(i).size());

        int[] res = new int[N-1];
        Arrays.fill(res, -1);

        int[] dist = new int[N];
        Arrays.fill(dist, -1);
        Deque<Pair> deque = new ArrayDeque<>();
        deque.offer(new Pair(0, -1));
        dist[0] = 0;

        while (!deque.isEmpty()) {
            Pair p = deque.poll();
            int color = 1;
            if (color == p.prevColor) ++color;
            List<Edge> edges = graph.get(p.nodeId);
            for (Edge edge : edges) {
                if (dist[edge.to] != -1) continue;
                dist[edge.to] = dist[edge.to] + 1;
                deque.offer(new Pair(edge.to, color));
                res[edge.id] = color;
                ++color;
                if (color == p.prevColor) ++color;
            }
        }

        System.out.println(maxColor);
        for (int i = 0; i < res.length; ++i)
            System.out.println(res[i]);
    }
}
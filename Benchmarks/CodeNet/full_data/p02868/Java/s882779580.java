import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Counting of Trees
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<Edge>[] edges = initDijkstra(N);

            for (int i = 0; i < M; i++) {
                int L = sc.nextInt() - 1;
                int R = sc.nextInt() - 1;
                long C = sc.nextLong();

                for (int s = L; s < R; s++) {
                    for (int t = s + 1; t <= R; t++) {
                        edges[s].add(new Edge(t, C));
                        edges[t].add(new Edge(s, C));
                    }
                }
            }

            long[] distances = execDijkstra(edges, 0);

            System.out.println(distances[N - 1]);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Edge>[] initDijkstra(int N) {
        List<Edge>[] edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }

        return edges;
    }

    public static long[] execDijkstra(List<Edge>[] edges, int start) {
        long[] distances = new long[edges.length];
        for (int i = 0; i < edges.length; i++) {
            distances[i] = -1;
        }

        PriorityQueue<Vertex> queue = new PriorityQueue<>(new Comparator<Vertex>() {
            @Override
            public int compare(Vertex o1, Vertex o2) {
                return Long.compare(o1.distance, o2.distance);
            }
        });

        queue.add(new Vertex(start, 0));

        while (queue.size() > 0) {
            Vertex vertex = queue.poll();

            if (distances[vertex.n] != -1) {
                continue;
            }

            distances[vertex.n] = vertex.distance;

            for (Edge edge : edges[vertex.n]) {
                if (distances[edge.to] == -1) {
                    queue.add(new Vertex(edge.to, vertex.distance + edge.distance));
                }
            }
        }

        return distances;
    }

    public static class Edge {

        public int to;

        public long distance;

        public Edge(int to, long distance) {
            this.to = to;
            this.distance = distance;
        }

    }

    public static class Vertex {

        public int n;

        public long distance;

        public Vertex(int n, long distance) {
            this.n = n;
            this.distance = distance;
        }

    }

}

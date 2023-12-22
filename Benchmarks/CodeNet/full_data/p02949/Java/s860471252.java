import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int INF = Integer.MAX_VALUE;

    static class Edge {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            edges.add(new Edge(sc.nextInt() - 1, sc.nextInt() - 1, -sc.nextInt() + P));
        }

        int[] dist = new int[N];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        boolean possible = true;
        boolean[] reachableFrom = new boolean[N];
        reachableFrom[N - 1] = true;

        for (int i = 0; i < N - 1; i++) {
            for (Edge e : edges) {
                if (reachableFrom[e.to]) reachableFrom[e.from] = true;
                if (dist[e.from] == INF) continue;
                dist[e.to] = Math.min(dist[e.to], dist[e.from] + e.cost);
            }
        }

        for (Edge e : edges) {
            if (!reachableFrom[e.from] || dist[e.from] == INF) continue;
            if (dist[e.to] > dist[e.from] + e.cost) possible = false;
        }

        if (!possible) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(-dist[N - 1], 0));
        }
    }
}

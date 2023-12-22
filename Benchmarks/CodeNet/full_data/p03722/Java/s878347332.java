import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Edge[] edges = new Edge[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            long c = -1 * sc.nextLong();
            edges[i] = new Edge(a, b, c);
        }

        long[] distances = new long[n];
        long INF = 1 << 50;
        for (int i = 0; i < n; i++) {
            distances[i] = INF;
        }
        distances[0] = 0;

        boolean update = false;
        for (int i = 0; i < n; i++) {
            update = false;
            for (Edge e : edges) {
                if (distances[e.from] != INF && distances[e.to] > distances[e.from] + e.cost) {
                    distances[e.to] = distances[e.from] + e.cost;
                    update = true;
                }
            }
        }

        if (update) {
            System.out.println("inf");
        } else {
            System.out.println(-1 * distances[n - 1]);
        }
    }
}

class Edge {
    int from;
    int to;
    long cost;

    Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}
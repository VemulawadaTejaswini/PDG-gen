import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static Edge[] edges;
    static long[] d;
    static long INF = Long.MAX_VALUE;
    static boolean[] negative;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        negative = new boolean[N];
        Arrays.fill(negative, false);

        edges = new Edge[M];
        for(int i = 0; i < M; i++) {
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;
            long cost = -scanner.nextLong();
            Edge e = new Edge(from, to, cost);
            edges[i] = e;
        }

        d = new long[N];
        Arrays.fill(d, INF);

        scanner.close();
    }

    private static void bellmanFord(int s) {
        d[s] = 0;
        for(int i = 0; i < N; i++) {
            boolean update = false;
            for(int j = 0; j < M; j++) {
                Edge e = edges[j];
                if(d[e.from] != INF && d[e.from] + e.cost < d[e.to]) {
                    d[e.to] = d[e.from] + e.cost;
                    update = true;
                }

            }
            if(!update) break;
        }

        for(int i = 0; i < N; i++) {
            boolean update = false;
            for(int j = 0; j < M; j++) {
                Edge e = edges[j];
                if(d[e.from] != INF && d[e.from] + e.cost < d[e.to]) {
                    d[e.to] = d[e.from] + e.cost;
                    update = true;
                    negative[e.to] = true;
                }
                if(negative[e.from]) {
                    negative[e.to] = true;
                }
            }
            if(!update) break;
        }
    }

    public static void main(String args[]) {
        init();
        bellmanFord(0);
        long ans = -d[N - 1];

        if(!negative[N - 1]) {
            System.out.println(ans);
        } else {
            System.out.println("inf");
        }
    }
}

class Edge {
    int from;
    int to;
    long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}
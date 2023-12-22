import java.util.*;
public class Main {
    static long INF = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int cost = -1 * sc.nextInt();
            edges.add(new Edge(from, to, cost));
        }
        if (negativeLoop(edges, 1, n, m)) {
            System.out.println("inf");
            return;
        }
        bellmanFord(edges, 1, n, m);
        // System.out.println(Arrays.toString(d));
        System.out.println(-d[n]);
    }

    static long[] d = new long[100000];
    public static void bellmanFord(List<Edge> es, int s, int vn, int en) {
        for (int i = 0; i <= vn; i++) {
            d[i] = INF;
        }
        d[s] = 0;
        while (true) {
            boolean update = false;
            for (int i = 0; i < en; i++) {
                Edge e = es.get(i);
                // System.out.println(e);
                // System.out.printf(
                //    "d[%d] = %d d[%d] = %d e.cost = %d%n", e.to, d[e.to], e.from,
                //    d[e.from],e.cost);
                if (d[e.from] != INF && d[e.to] > d[e.from] + e.cost) {
                    d[e.to] = d[e.from] + e.cost;
                    //   System.out.printf("d[%d] = %d %n", e.to, d[e.to]);
                    update = true;
                }
            }
            if (!update) {
                break;
            }
        }
    }

    public static boolean negativeLoop(List<Edge> es, int s, int vn, int en) {
        for (int i = 0; i <= vn; i++) {
            d[i] = 0;
        }
        for (int i = 0; i < vn; i++) {
            for (int j = 0; j < en; j++) {
                Edge e = es.get(j);
                // System.out.println(e);
                if (d[e.to] > d[e.from] + e.cost) {
                    d[e.to] = d[e.from] + e.cost;
                    if (i == vn - 1) {
                        return true;
                    }
                }
            }
        }
        return false;
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
    public String toString() {
        return String.format("from = %d to = %d cost = %d", this.from, this.to, this.cost);
    }
}

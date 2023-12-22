import java.util.*;
import java.util.stream.*;

public class Main {
    static final int MAX_V = 50;
    static final int MAX_S = MAX_V * 50 + 5;

    @SuppressWarnings("unchecked")
    static List<Edge>[] g = new ArrayList[MAX_V];
    static double[][] dist = new double[MAX_V][MAX_S + 5];

    static {
        for (int i = 0; i < MAX_V; i++) {
            g[i] = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cities = sc.nextInt();
        int lines = sc.nextInt();
        int silvers = sc.nextInt();
        for (int i = 0; i < lines; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int fare = sc.nextInt();
            int minutes = sc.nextInt();
            --u; --v;
            g[u].add(new Edge(v, fare, minutes));
            g[v].add(new Edge(u, fare, minutes));
        }
        List<Integer> c = new ArrayList<>(cities), d = new ArrayList<>(cities);
        for (int i = 0; i < cities; i++) {
            c.add(sc.nextInt());
            d.add(sc.nextInt());
        }
        for (int i = 0; i < cities; i++) {
            for (int j = 0; j < MAX_S + 5; j++) {
                dist[i][j] = Double.POSITIVE_INFINITY;
            }
        }
        silvers = Integer.min(silvers, MAX_S);

        PriorityQueue<Data> q = new PriorityQueue<>((a, b) -> {
            long diff = a.x - b.x;
            if (diff > 0) return 1;
            if (diff < 0) return -1;
            return 0;
        });
        TriConsumer<Integer, Integer, Long> push = (v, s, x) -> {
            if (s < 0) return;
            if (dist[v][s] <= x) return;
            dist[v][s] = x;
            q.add(new Data(v, s, x));
        };
        push.accept(0, silvers, 0L);
        while (!q.isEmpty()) {
            Data top = q.poll();
            int v = top.v, s = top.s;
            long x = top.x;
            if (dist[v][s] != x) continue;
            {
                int ns = Integer.min(s + c.get(v), MAX_S);
                push.accept(v, ns, x + d.get(v));
            }
            for (Edge e : g[v]) {
                push.accept(e.to, s - e.a, x + e.b);
            }
        }
        for (int i = 1; i < cities; i++) {
            double ans = Double.POSITIVE_INFINITY;
            for (int j = 0; j < MAX_S + 5; j++) {
                ans = Double.min(ans, dist[i][j]);
            }
            System.out.println((int) ans);
        }
    }

    private static class Edge {
        int to, a, b;
        Edge(int to, int a, int b) {
            this.to = to;
            this.a = a;
            this.b = b;
        }
    }

    private static class Data {
        int v, s;
        long x;
        Data(int v, int s, long x) {
            this.v = v;
            this.s = s;
            this.x = x;
        }
    }
}

interface TriConsumer<T, U, V> {
    void accept(T t, U u, V v);
}

import java.util.*;

public class Main {
    public static class Edge {
        int from, to;
        long cost;

        Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int a, b;
        long c;

        n = sc.nextInt();
        m = sc.nextInt();

        long[] d = new long[n+1];
        Edge[] es = new Edge[m];

        for (int i = 0; i <= n; i++) {
            d[i] = Long.MIN_VALUE;
        }
        d[1] = 0;

        for (int i = 0; i < m; i++) {
            es[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextLong());
        }

        int i = 0;
        while (true) {
            boolean update = false;
            for (int j = 0; j < m; j++) {
                Edge e = es[j];
                if (d[e.to] < d[e.from] + e.cost) {
                    d[e.to] = d[e.from] + e.cost;
                    update = true;
                }
            }
            if (!update) {
                System.out.println(d[n]);
                return;
            }
            if (i > n) {
                System.out.println("inf");
                return;
            }
            i++;
        }

    }
}

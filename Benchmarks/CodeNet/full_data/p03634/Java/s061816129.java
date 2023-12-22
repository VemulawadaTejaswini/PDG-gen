import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static long dist[];

    private static Map<Integer, List<Edge>> map;

    private static class Edge {
        int from;
        int to;
        long cost;

        private Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    public static void dfs(int v, int p, long d) {
        dist[v] = d;
        for (Edge edge : map.get(v)) {
            if (edge.to == p) {
                continue;
            }
            dfs(edge.to, v, d + edge.cost);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        long[] c = new long[n - 1];
        dist = new long[n + 1];
        map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
            List<Edge> l1 = map.get(a[i]);
            l1.add(new Edge(a[i], b[i], c[i]));
            map.put(a[i], l1);
            List<Edge> l2 = map.get(b[i]);
            l2.add(new Edge(b[i], a[i], c[i]));
            map.put(b[i], l2);
        }
        int q = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        dfs(k, -1, 0);
        for (int i = 0; i < q; i++) {
            System.out.println(dist[x[i]] + dist[y[i]]);
        }
    }

}

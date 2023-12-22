
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int s;
    static int t;
    static long arigane = (long) 1e15;
//    static int[][] grapht;
//    static int[][] graphf;
    static long[] tmemo;
    static long[] fmemo;
    static PriorityQueue<Path> paths;
    static long min = Long.MAX_VALUE;
    static List<Long> ret = new ArrayList<>();
    static Map<Integer, List<Edge>> graph = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt() - 1;
        t = sc.nextInt() - 1;
//        grapht = new int[n][n];
//        graphf = new int[n][n];
        tmemo = new long[n];
        fmemo = new long[n];

        for (int i = 0; i < n; i++) {
            tmemo[i] = -1;
            fmemo[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            Edge e1 = new Edge(v, a, b);
            Edge e2 = new Edge(u, a, b);
            graph.get(u).add(e1);
            graph.get(v).add(e2);

//            grapht[u][v] = a;
//            grapht[v][u] = a;
//            graphf[u][v] = b;
//            graphf[v][u] = b;
        }

        paths = new PriorityQueue<>(Comparator.comparingLong(x -> x.score));
        paths.add(new Path(s, 0));
        while(!paths.isEmpty()) {
            Path c = paths.poll();
            if(tmemo[c.current] != -1) continue;
            tmemo[c.current] = c.score;
//            for (int i = 0; i < n; i++) {
//                if(grapht[c.current][i] > 0 && tmemo[i] == -1) {
//                    Path tmp = new Path(i, c.score + grapht[c.current][i]);
//                    paths.add(tmp);
//                }
//            }
            for (Edge e: graph.get(c.current)) {
                if(tmemo[e.to] == -1) {
                    Path tmp = new Path(e.to, c.score + e.a);
                    paths.add(tmp);
                }
            }
        }

            paths.add(new Path(t, 0));
            while (!paths.isEmpty()) {
                Path c = paths.poll();
                if (fmemo[c.current] != -1) continue;
                fmemo[c.current] = c.score;
//                for (int i = 0; i < n; i++) {
//                    if (graphf[c.current][i] > 0 && fmemo[i] == -1) {
//                        Path tmp = new Path(i, c.score + graphf[c.current][i]);
//                        paths.add(tmp);
//                    }
//                }
                for (Edge e: graph.get(c.current)) {
                    if(tmemo[e.to] == -1) {
                        Path tmp = new Path(e.to, c.score + e.b);
                        paths.add(tmp);
                    }
                }
            }

        for (int i = 0; i < n; i++) {
            min = Math.min(min, tmemo[n - 1 - i] + fmemo[n - 1 - i]);
            ret.add(arigane - min);
        }

            for (int i = 0; i < n; i++) {
            System.out.println(ret.get(n - 1 - i));
        }

    }

    static class Path {
        int current;
        long score;

        Path(int current, long score) {
            this.current = current;
            this.score = score;
        }
    }

    static class Edge {
        int to;
        int a;
        int b;

        public Edge(int to, int a, int b) {
            this.to = to;
            this.a = a;
            this.b = b;
        }
    }

}

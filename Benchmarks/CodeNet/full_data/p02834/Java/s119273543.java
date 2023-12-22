import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPlayingTagOnTree solver = new FPlayingTagOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPlayingTagOnTree {
        public void solve(int testNumber, Scanner in, PrintWriter out) {


            // 閉路がないので,高橋は青木より早く到達できる最も遠い点にいることになる
            // その後、青木くんに追いつかれることになる
            // これなんかでやった気がする
            int n = in.nextInt();
            int u = in.nextInt();
            int v = in.nextInt();
            Graph g = new Graph(n);
            for (int i = 0; i < n - 1; i++) {
                g.addUnDirectedEdge(new Edge(in.nextInt() - 1, in.nextInt() - 1, 1));
            }

            long[] distFromTakahashi = g.dijkstra(u - 1);
            long[] distFromAoki = g.dijkstra(v - 1);
            long cost = -1;
            for (int i = 0; i < n; i++) {
                if (distFromAoki[i] >= distFromTakahashi[i]) {
                    cost = Math.max(distFromAoki[i] - 1, cost);
                }
            }
            out.println(cost);

        }

    }

    static class Edge {
        int from;
        int to;
        long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public Edge inv() {
            return new Edge(to, from, cost);
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }

    static class Graph {
        int n;
        ArrayList<Edge>[] adj;
        long[] vertexCost;

        public Graph(int size) {
            n = size;
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            vertexCost = new long[n];
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
        }

        public void addUnDirectedEdge(Edge e) {
            addEdge(e);
            addEdge(e.inv());
        }

        public long[] dijkstra(int from) {
            long[] d = new long[n];
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(e -> d[e]));
            for (int i = 0; i < n; i++) {
                d[i] = (i == from) ? 0 : (long) 1e18;
                pq.add(i);
            }
            // System.out.println(Arrays.toString(pq.toArray()));
            while (!pq.isEmpty()) {
                int search = pq.poll();
                // System.out.println("now: " + search);
                ArrayList<Edge> edges = adj[search];
                for (Edge e : edges) {
                    // System.out.println(e.toString());
                    long cmp = d[search] + e.cost;
                    if (d[e.to] > d[search] + e.cost) {
                        // 更新が入る
                        // 処理を入れたい場合はここに入れる
                        d[e.to] = d[search] + e.cost;
                        pq.add(e.to);
                    }
                }
                //  System.out.println(Arrays.toString(pq.toArray()));
            }
            return d;
        }

    }
}


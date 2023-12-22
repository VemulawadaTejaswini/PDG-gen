import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
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
        DCandidatesOfNoShortestPaths solver = new DCandidatesOfNoShortestPaths();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCandidatesOfNoShortestPaths {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            /* warshall froyd で全点間の最短距離を求める */
            int n = in.nextInt();
            int m = in.nextInt();
            Graph g = new Graph(n);
            ArrayList<Edge> ale = new ArrayList<>();
            int res = 0;
            for (int i = 0; i < m; i++) {
                Edge e = new Edge(in.nextInt() - 1, in.nextInt() - 1, in.nextInt());
                ale.add(e);
                g.addUnDirectedEdge(e);
            }
            long[][] dist = g.warshallFloyd();
            for (Edge e : ale) {
                if (e.cost > dist[e.from][e.to]) res++;
            }
            out.println(res);
        }

    }

    static class Graph {
        public int size;
        public ArrayList<Edge>[] adj;
        public int[] inDeg;

        public Graph(int size) {
            this.size = size;
            adj = new ArrayList[size];
            inDeg = new int[size];
            for (int i = 0; i < size; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
            inDeg[e.to]++;
        }

        public void addUnDirectedEdge(Edge e) {
            addEdge(e);
            addEdge(e.inv());
        }

        public long[][] warshallFloyd() {
            long[][] dist = new long[size][size];
            for (int i = 0; i < size; i++) {
                Arrays.fill(dist[i], Long.MAX_VALUE / 3);
                dist[i][i] = 0;
            }

            for (ArrayList<Edge> ale : adj) {
                for (Edge e : ale) {
                    dist[e.from][e.to] = Math.min(e.cost, dist[e.from][e.to]);
                }
            }

            for (int k = 0; k < size; k++) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        dist[i][j] = Math.min(dist[i][k] + dist[k][j], dist[i][j]);
                    }
                }
            }

            return dist;
        }

    }

    static class Edge {
        public int from;
        public int to;
        public long cost;

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
}


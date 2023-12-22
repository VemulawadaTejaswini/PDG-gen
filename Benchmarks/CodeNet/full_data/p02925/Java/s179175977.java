import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            Graph g = new Graph(n * n + 1);
            int[][] match = new int[n][n - 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    int oponent = in.nextInt();
                    int min = Math.min(i + 1, oponent);
                    int max = Math.max(i + 1, oponent);
                    match[i][j] = min * n + max;
                }
            }

            // 0からほかのやつに辺を伸ばせばいい
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (j == 0) {
                        g.addEdge(new Edge(0, match[i][j], -1));
                    } else {
                        g.addEdge(new Edge(match[i][j - 1], match[i][j], -1));
                    }
                }
            }

            long[] dist = g.bellmanFord(0);
            if (g.HasNegativeLoop()) {
                out.println(-1);
            } else {
                long min = 1;
                for (int i = 0; i < dist.length; i++) {
                    min = Math.min(min, dist[i]);
                }
                out.println(-min);
            }


        }

    }

    static class Graph {
        int n;
        ArrayList<Edge>[] adj;
        long[] vertexCost;
        boolean hasNegativeLoop = false;

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

        public long[] bellmanFord(int from) {
            hasNegativeLoop = false;
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = i == from ? 0 : (long) 1e30;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (Edge e : adj[j]) {
                        int f = j;
                        int t = e.to;
                        if (res[t] > res[f] + e.cost) {
                            res[t] = res[f] + e.cost;
                            if (i == n - 1) {
                                hasNegativeLoop = true;
                                break;
                            }
                        }
                    }
                }
            }
            return res;
        }

        public boolean HasNegativeLoop() {
            return this.hasNegativeLoop;
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

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }
}


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayDeque;
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
        ADarkerAndDarker solver = new ADarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADarkerAndDarker {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            char[][] c = new char[h][w];
            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
            }
            int[][] man = new int[h + 1][w + 1];
            boolean[][] used = new boolean[h + 1][w + 1];

            for (int i = 0; i <= h; i++) {
                Arrays.fill(man[i], -1);
                Arrays.fill(used[i], false);
            }

            GridGraph gg = new GridGraph(h, w);
            gg.connect4();
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    // 多点bfs
                    if (c[i][j] == '#') gg.addUnDirectedEdge(new Edge(h * w, i * w + j, 0));
                }
            }

            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.push(h * w);
            man[h][w] = 0;
            used[h][w] = true;
            while (!q.isEmpty()) {
                //out.println("q:" + q.peek());
                int now = q.pollFirst();
                for (Edge e : gg.adj[now]) {
                    // 使っていなかったら追加する
                    if (used[e.to / w][e.to % w]) continue;
                    // out.println(e.toString());
                    used[e.to / w][e.to % w] = true;
                    man[e.to / w][e.to % w] = man[e.from / w][e.from % w] + 1;
                    q.addLast(e.to);
                }
            }

            int max = -1;
            for (int i = 0; i < h; i++) {
                // out.println(Arrays.toString(man[i]));
                for (int j = 0; j < w; j++) {
                    if (c[i][j] == '.') max = Math.max(max, man[i][j]);
                }
            }

            out.println(max);

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

    static class GridGraph extends Graph {
        public int h;
        public int w;

        public GridGraph(int h, int w) {
            super(h * w + 5);
            this.h = h;
            this.w = w;
        }

        public void connect4() {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i > 0) this.addUnDirectedEdge(new Edge(i * w + j, (i - 1) * w + j, 0));
                    if (i < h - 1) this.addUnDirectedEdge(new Edge(i * w + j, (i + 1) * w + j, 0));
                    if (j > 0) this.addUnDirectedEdge(new Edge(i * w + j, i * w + (j - 1), 0));
                    if (j < w - 1) this.addUnDirectedEdge(new Edge(i * w + j, i * w + (j + 1), 0));
                }
            }
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

    }
}


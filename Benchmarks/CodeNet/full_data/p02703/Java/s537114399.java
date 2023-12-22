import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ETwoCurrencies solver = new ETwoCurrencies();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETwoCurrencies {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int k = 2500;
            int n = s.nextInt(), m = s.nextInt(), coins = Math.min(s.nextInt(), k - 1);
            ArrayList<Integer>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            Edge[] edge = new Edge[m];
            for (int i = 0; i < m; i++) {
                edge[i] = new Edge(s.nextInt() - 1, s.nextInt() - 1, s.nextInt(), s.nextInt());
                adj[edge[i].u].add(i);
                adj[edge[i].v].add(i);
            }
            int[] c = new int[n];
            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = s.nextInt();
                d[i] = s.nextInt();
            }
            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {

                public int compare(Pair p1, Pair p2) {
                    if (p1.t < p2.t)
                        return -1;
                    if (p1.t > p2.t)
                        return 1;
                    return 0;
                }
            });
            pq.add(new Pair(0, coins, 0L));
            int[][] vis = new int[n][k];
            long[][] dist = new long[n][k];
            for (int i = 0; i < n; i++)
                Arrays.fill(dist[i], Long.MAX_VALUE);
            dist[0][coins] = 0;
            while (!pq.isEmpty()) {
                Pair p = pq.poll();
                if (vis[p.i][p.c] == 1)
                    continue;
                vis[p.i][p.c] = 1;
                if (p.c + 1 < k) {
                    int next = Math.min(k - 1, p.c + c[p.i]);
                    if (dist[p.i][next] > dist[p.i][p.c] + d[p.i]) {
                        dist[p.i][next] = dist[p.i][p.c] + d[p.i];
                        pq.add(new Pair(p.i, next, dist[p.i][next]));
                    }
                }
                for (int e : adj[p.i]) {
                    int u = p.i;
                    int v = edge[e].other(u);
                    if (p.c >= edge[e].c && dist[v][p.c - edge[e].c] > dist[u][p.c] + edge[e].t) {
                        dist[v][p.c - edge[e].c] = dist[u][p.c] + edge[e].t;
                        pq.add(new Pair(v, p.c - edge[e].c, dist[v][p.c - edge[e].c]));
                    }
                }
            }
            long[] res = new long[n];
            Arrays.fill(res, Long.MAX_VALUE);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++)
                    res[i] = Math.min(dist[i][j], res[i]);
            }
            for (int i = 1; i < n; i++)
                w.println(res[i]);
        }

        class Pair {
            int i;
            int c;
            long t;

            Pair(int i, int c, long t) {
                this.i = i;
                this.c = c;
                this.t = t;
            }

        }

        class Edge {
            int u;
            int v;
            int c;
            int t;

            Edge(int u, int v, int c, int t) {
                this.u = u;
                this.v = v;
                this.c = c;
                this.t = t;
            }

            int other(int x) {
                return (x == u) ? v : u;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


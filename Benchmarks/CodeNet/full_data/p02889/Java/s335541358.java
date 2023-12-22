import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aman Kumar Singh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ETravelByCar solver = new ETravelByCar();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETravelByCar {
        long INF = (long) 1e18 + 1;
        PrintWriter out;
        InputReader in;
        long[][] d = new long[305][];
        long[][] dist = new long[305][];
        ArrayList<Edge>[] graph = new ArrayList[305];
        final Comparator<Tuple> com = new Comparator<Tuple>() {
            public int compare(Tuple t1, Tuple t2) {
                if (t1.dist != t2.dist)
                    return Long.compare(t1.dist, t2.dist);
                else
                    return Long.compare(t1.cnts, t2.cnts);
            }
        };

        void dijsktra(int s, long L, int n) {
            int i = 0;
            d[s] = new long[n];
            dist[s] = new long[n];
            Arrays.fill(d[s], INF);
            Arrays.fill(dist[s], INF);
            PriorityQueue<Tuple> pq = new PriorityQueue<>(com);
            pq.add(new Tuple(s, 0l, 0l, L));
            d[s][s] = 0;
            dist[s][s] = 0;
            while (!pq.isEmpty()) {
                Tuple curr = pq.poll();
                if (curr.dist > d[s][curr.x])
                    continue;
                for (Edge e : graph[curr.x]) {
                    int neighbour = e.other(curr.x);
                    if (d[s][curr.x] + e.wt < d[s][neighbour]) {
                        d[s][neighbour] = d[s][curr.x] + e.wt;
                        if (curr.litres - e.wt >= 0) {
                            dist[s][neighbour] = dist[s][curr.x];
                            pq.add(new Tuple(neighbour, d[s][neighbour], dist[s][neighbour], curr.litres - e.wt));
                        } else {
                            dist[s][neighbour] = dist[s][curr.x] + 1;
                            pq.add(new Tuple(neighbour, d[s][neighbour], dist[s][neighbour], L - e.wt));
                        }
                    }
                }
            }
            //pn(s +" "+Arrays.toString(dist[s]) +" "+Arrays.toString(d[s]));
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            int m = ni();
            long L = nl();
            int i = 0, j = 0;
            for (i = 0; i < n; i++) {
                //Arrays.fill(d[i], INF);
                // Arrays.fill(dist[i], INF);
                graph[i] = new ArrayList<>();
            }
            for (i = 0; i < m; i++) {
                int u = ni() - 1;
                int v = ni() - 1;
                long l = nl();
                Edge e = new Edge(u, v, l);
                graph[u].add(e);
                graph[v].add(e);
            }
            for (i = 0; i < n; i++)
                dijsktra(i, L, n);
            int q = ni();
            while (q-- > 0) {
                int s = ni() - 1;
                int t = ni() - 1;
                if (dist[s][t] == INF)
                    pn(-1);
                else
                    pn(dist[s][t]);
            }

        }

        int ni() {
            return in.nextInt();
        }

        long nl() {
            return in.nextLong();
        }

        void pn(long zx) {
            out.println(zx);
        }

        class Tuple {
            int x;
            long dist;
            long cnts;
            long litres;

            Tuple(int a, long b, long c, long d) {
                x = a;
                dist = b;
                cnts = c;
                litres = d;
            }

        }

        class Edge {
            int u;
            int v;
            long wt;

            Edge(int a, int b, long w) {
                u = a;
                v = b;
                wt = w;
            }

            int other(int a) {
                return u ^ v ^ a;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}


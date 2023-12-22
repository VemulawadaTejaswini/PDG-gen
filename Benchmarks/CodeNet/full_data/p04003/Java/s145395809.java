import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
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
        ESnukesSubwayTrip solver = new ESnukesSubwayTrip();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESnukesSubwayTrip {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            ArrayList<Integer>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            Edge[] edge = new Edge[m];
            for (int i = 0; i < m; i++) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1, c = s.nextInt() - 1;
                edge[i] = new Edge(u, v, c);
                adj[u].add(i);
                adj[v].add(i);
            }
            HashSet<Integer>[] vis = new HashSet[n];
            HashMap<Integer, Integer>[] level = new HashMap[n];
            for (int i = 0; i < n; i++) {
                vis[i] = new HashSet<>();
                level[i] = new HashMap<>();
            }
            level[0].put(-1, 0);
            Queue<Pair> q0 = new LinkedList<>();
            q0.add(new Pair(0, -1));
            while (!q0.isEmpty()) {
                Queue<Pair> q1 = new LinkedList<>();
                while (!q0.isEmpty()) {
                    Pair p = q0.poll();
                    int x = p.i;
                    int xw = p.w;
                    if (vis[x].contains(xw))
                        continue;
                    vis[x].add(xw);
                    for (int i : adj[x]) {
                        int y = edge[i].other(x);
                        int yw = edge[i].w;
                        int d = (int) 1e6;
                        if (level[y].containsKey(yw))
                            d = level[y].get(yw);
                        if (xw == yw) {
                            if (d > level[x].get(xw)) {
                                q0.add(new Pair(y, yw));
                                level[y].put(yw, level[x].get(xw));
                            }
                        } else {
                            if (d > level[x].get(xw) + 1) {
                                q1.add(new Pair(y, yw));
                                level[y].put(yw, level[x].get(xw) + 1);
                            }
                        }
                    }
                }
                q0 = q1;
            }
            int res = (int) 1e6;
            for (int x : level[n - 1].values()) {
                res = Math.min(x, res);
            }

            if (res != (int) 1e6)
                w.println(res);
            else
                w.println(-1);
        }

        class Edge {
            int u;
            int v;
            int w;

            Edge(int u, int v, int w) {
                this.u = u;
                this.v = v;
                this.w = w;
            }

            int other(int x) {
                if (x == u)
                    return v;
                return u;
            }

        }

        class Pair {
            int i;
            int w;

            Pair(int i, int w) {
                this.i = i;
                this.w = w;
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


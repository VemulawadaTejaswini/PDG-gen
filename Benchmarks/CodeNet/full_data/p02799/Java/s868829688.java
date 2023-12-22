import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        EBichromization solver = new EBichromization();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBichromization {
        private static final int INF = 1_000_000_000;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints();
            int[] d = in.ints(n);
            EBichromization.Node[] nodes = new EBichromization.Node[n];
            EBichromization.Edge[] edges = new EBichromization.Edge[m];
            for (int i = 0; i < n; i++) nodes[i] = new EBichromization.Node(i, d[i]);

            for (int i = 0; i < m; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                EBichromization.Edge e = new EBichromization.Edge(nodes[x], nodes[y]);
                edges[i] = e;
                nodes[x].adj.add(e);
                nodes[y].adj.add(e);
            }

            List<EBichromization.Node> origin = new ArrayList<>();
            outer:
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                for (EBichromization.Edge e : nodes[i].adj) {
                    EBichromization.Node dest = e.other(nodes[i]);
                    if (d[i] > dest.v) continue outer;
                    else if (d[i] == dest.v) cnt++;
                }
                if (cnt == 0) {
                    out.ans(-1).ln();
                    return;
                }
                origin.add(nodes[i]);
            }

            for (EBichromization.Node start : origin) {
                if (start.c >= 0) continue;
                start.c = 0;
                start.dfs();
            }

            for (int i = 0; i < n; i++) {
                if (nodes[i].c == -1) throw new RuntimeException("node " + i + " not vis");
                out.print(nodes[i].c == 0 ? 'B' : 'W');
            }
            out.ln();
            for (int i = 0; i < m; i++) {
                out.ans(edges[i].cost).ln();
            }
        }

        private static class Node {
            int index;
            int v;
            int c = -1;
            List<EBichromization.Edge> adj = new ArrayList<>();

            public Node(int index, int v) {
                this.index = index;
                this.v = v;
            }

            void dfs() {
                //System.out.println("Visited node " + index);
                for (EBichromization.Edge e : adj) {
                    if (e.visited) continue;

                    EBichromization.Node dest = e.other(this);
                    if (dest.v == this.v) {
                        if (dest.c < 0) {
                            dest.c = 1 - this.c;
                            e.cost = this.v;
                            e.visited = true;
                            dest.dfs();
                        } else {
                            e.cost = INF;
                            e.visited = true;
                        }
                    } else if (dest.v > this.v) {
                        if (dest.c < 0) {
                            dest.c = this.c;
                            e.cost = dest.v - this.v;
                            e.visited = true;
                            dest.dfs();
                        } else {
                            e.cost = INF;
                            e.visited = true;
                        }
                    }
                }
            }

            public String toString() {
                return "Node{" +
                        "index=" + index +
                        ", v=" + v +
                        '}';
            }

        }

        private static class Edge {
            EBichromization.Node x;
            EBichromization.Node y;
            int cost = INF;
            boolean visited;

            public Edge(EBichromization.Node x, EBichromization.Node y) {
                this.x = x;
                this.y = y;
            }

            private EBichromization.Node other(EBichromization.Node node) {
                if (this.x == node) return this.y;
                else return this.x;
            }

            public String toString() {
                return x.index + " <=> " + y.index;
            }

        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }
}


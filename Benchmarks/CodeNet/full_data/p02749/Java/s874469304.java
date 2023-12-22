import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        CThREE solver = new CThREE();
        solver.solve(1, in, out);
        out.close();
    }

    static class CThREE {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            int[] c = new int[3];
            for (int i = 1; i <= n; i++) c[i % 3]++;

            CThREE.Node[] nodes = new CThREE.Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new CThREE.Node();
            }
            for (int i = 1; i < n; i++) {
                int a = in.ints() - 1, b = in.ints() - 1;
                nodes[a].adj.add(nodes[b]);
                nodes[b].adj.add(nodes[a]);
            }
            nodes[0].dfs(null);
            Queue<CThREE.Node> p1 = new ArrayDeque<>(), p2 = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (nodes[i].depth % 2 == 0) p1.offer(nodes[i]);
                else p2.offer(nodes[i]);
            }


            if (p1.size() < p2.size()) {
                Queue<CThREE.Node> t = p1;
                p1 = p2;
                p2 = t;
            }
            //System.out.println(p1.size() + ", "+p2.size());

            if (p1.size() >= c[1] + c[2]) {
                for (int i = 1; i <= n; i++) {
                    if (i % 3 == 0) continue;
                    p1.poll().value = i;
                }
                for (int i = 3; i <= n; i += 3) {
                    if (p1.isEmpty()) p2.poll().value = i;
                    else p1.poll().value = i;
                }
            } else {
                for (int i = 1; i <= n; i += 3) p1.poll().value = i;
                for (int i = 2; i <= n; i += 3) p2.poll().value = i;
                for (int i = 3; i <= n; i += 3) {
                    if (p1.isEmpty()) p2.poll().value = i;
                    else p1.poll().value = i;
                }
            }
            for (int i = 0; i < n; i++) {
                out.ans(nodes[i].value);
            }
            out.ln();
        }

        static class Node {
            int depth = -1;
            int value;
            List<CThREE.Node> adj = new ArrayList<>();

            void dfs(CThREE.Node parent) {
                depth = parent == null ? 0 : parent.depth + 1;
                for (CThREE.Node n : adj) {
                    if (n == parent) continue;
                    n.dfs(this);
                }
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
}


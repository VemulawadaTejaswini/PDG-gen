import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        FPlayingTagOnTree solver = new FPlayingTagOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPlayingTagOnTree {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), u = in.ints() - 1, v = in.ints() - 1;
            FPlayingTagOnTree.Node[] nodes = new FPlayingTagOnTree.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new FPlayingTagOnTree.Node();
            for (int i = 1; i < n; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                nodes[x].adj.add(nodes[y]);
                nodes[y].adj.add(nodes[x]);
            }
            nodes[v].dfs(null);
            nodes[v].visited = true;
            nodes[u].visit();
            nodes[v].visited = false;
            int ans = nodes[u].depth / 2;
            for (FPlayingTagOnTree.Node node : nodes) {
                if (!node.visited || 2 * node.depth <= nodes[u].depth) continue;
                ans = Math.max(ans, node.maxDepth + nodes[u].depth - 2 * node.depth);
            }
            out.ans(ans).ln();
        }

        private static class Node {
            List<FPlayingTagOnTree.Node> adj = new ArrayList<>();
            int depth;
            int maxDepth;
            boolean visited;

            void dfs(FPlayingTagOnTree.Node from) {
                this.depth = this.maxDepth = from == null ? 0 : from.depth + 1;
                for (FPlayingTagOnTree.Node child : adj) {
                    if (child == from) continue;
                    child.dfs(this);
                    maxDepth = Math.max(maxDepth, child.maxDepth);
                }
            }

            void visit() {
                this.visited = true;
                for (FPlayingTagOnTree.Node child : adj) {
                    if (child.visited) continue;
                    child.visit();
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
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.PriorityQueue;
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
import java.util.Comparator;
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
        F01OnTree solver = new F01OnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class F01OnTree {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            F01OnTree.Node[] nodes = new F01OnTree.Node[n];
            nodes[0] = new F01OnTree.Node(0);
            for (int i = 1; i < n; i++) {
                nodes[i] = new F01OnTree.Node(i);
                nodes[in.ints() - 1].children.add(nodes[i]);
            }
            for (int i = 0; i < n; i++) nodes[i].v = in.ints();
            nodes[0].dfs();
            Queue<F01OnTree.Node> zeros = new ArrayDeque<>(), ones = new PriorityQueue<>(Comparator.comparing(node -> node.count[1] - node.count[0]));
            long count = 0, ans = 0;
            (nodes[0].v == 0 ? zeros : ones).add(nodes[0]);
            for (int i = 0; i < n; i++) {
                F01OnTree.Node node;
                if (!zeros.isEmpty()) {
                    node = zeros.poll();
                    ans += count;
                } else {
                    node = ones.poll();
                    count++;
                }
                for (F01OnTree.Node next : node.children) {
                    if (next.v == 0) zeros.add(next);
                    else ones.add(next);
                }
            }
            out.ans(ans).ln();
        }

        private static class Node {
            final List<F01OnTree.Node> children = new ArrayList<>();
            final int index;
            int v;
            final int[] count = new int[2];

            Node(int index) {
                this.index = index;
            }

            void dfs() {
                for (F01OnTree.Node next : children) {
                    next.dfs();
                    for (int i = 0; i < 2; i++) count[i] += next.count[i];
                }
                count[v]++;
            }

        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
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

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
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


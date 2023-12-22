import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
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
        PrintWriter out = new PrintWriter(outputStream);
        DPeopleOnALine solver = new DPeopleOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPeopleOnALine {
        private static final String YES = "Yes";
        private static final String NO = "No";
        private static final int ORIGIN = 5 * 100_000_000;

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), m = in.ints();
            DPeopleOnALine.Node[] nodes = IntStream.range(0, n).mapToObj(i -> new DPeopleOnALine.Node(i + 1)).toArray(DPeopleOnALine.Node[]::new);
            for (int i = 0; i < m; i++) {
                int l = in.ints() - 1, r = in.ints() - 1, d = in.ints();
                nodes[l].edges.put(nodes[r], d);
                nodes[r].edges.put(nodes[l], -d);
            }
            try {
                for (int i = 0; i < n; i++) {
                    dfs(nodes[i]);
                }
                out.println(YES);
            } catch (IllegalStateException ex) {
                out.println(NO);
            }
        }

        private static void dfs(DPeopleOnALine.Node node) {
            if (node.pos == null) {
                node.pos = ORIGIN;
            }
            for (Map.Entry<DPeopleOnALine.Node, Integer> e : node.edges.entrySet()) {
                if (e.getKey().pos == null) {
                    e.getKey().pos = node.pos + e.getValue();
                    dfs(e.getKey());
                } else if (e.getKey().pos != node.pos + e.getValue()) {
                    throw new IllegalStateException("Unsatisfiable");
                }
            }
        }

        private static class Node {
            private final int index;
            private Integer pos;
            private final Map<DPeopleOnALine.Node, Integer> edges = new HashMap<>();

            public Node(int index) {
                this.index = index;
            }

            public String toString() {
                return index + "@" + pos;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DPeopleOnALine.Node node = (DPeopleOnALine.Node) o;
                return index == node.index;
            }

            public int hashCode() {
                return index;
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
}


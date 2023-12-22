import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private Vertex[] g;
        private int n;
        private boolean[] used;
        private long[] values;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            int q = in.nextInt();
            g = new Vertex[n];
            used = new boolean[n];
            values = new long[n];
            for (int i = 0; i < n; i++)
                g[i] = new Vertex(0);
            for (int i = 1; i < n; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                g[a].s.add(b);
                g[b].s.add(a);
            }
            for (; q > 0; q--) {
                int p = in.nextInt() - 1;
                long inc = in.nextInt();
                g[p].val += inc;
            }
            dfs(0, 0);
            for (long v : values)
                out.print(v + " ");
        }

        private void dfs(int v, long inc) {
            used[v] = true;
            values[v] = g[v].val + inc;
            for (int to : g[v].s) {
                if (!used[to]) {
                    inc += g[v].val;
                    dfs(to, inc);
                    inc -= g[v].val;
                }
            }
        }

        private class Vertex {
            private ArrayList<Integer> s;
            private long val;

            public Vertex(long val) {
                s = new ArrayList<>();
                this.val = val;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


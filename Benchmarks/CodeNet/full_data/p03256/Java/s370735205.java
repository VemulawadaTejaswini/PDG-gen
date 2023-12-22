import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            String s = in.next();
            TaskC.Vertex[] vs = new TaskC.Vertex[n];
            for (int i = 0; i < n; ++i) vs[i] = new TaskC.Vertex(s.charAt(i) - 'A');
            for (int i = 0; i < m; ++i) {
                TaskC.Vertex a = vs[in.nextInt() - 1];
                TaskC.Vertex b = vs[in.nextInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
                ++a.numAdj[b.kind];
                ++b.numAdj[a.kind];
            }
            ArrayDeque<TaskC.Vertex> bad = new ArrayDeque<>();
            for (TaskC.Vertex v : vs)
                if (v.numAdj[0] == 0 || v.numAdj[1] == 0) {
                    v.good = false;
                    bad.add(v);
                }
            while (!bad.isEmpty()) {
                TaskC.Vertex v = bad.pollFirst();
                for (TaskC.Vertex u : v.adj) {
                    if (u.good) {
                        --u.numAdj[v.kind];
                        if (u.numAdj[v.kind] == 0) {
                            u.good = false;
                            bad.add(u);
                        }
                    }
                }
            }
            for (TaskC.Vertex v : vs)
                if (v.good) {
                    out.println("Yes");
                    return;
                }
            out.println("No");
        }

        static class Vertex {
            boolean good = true;
            int kind;
            int[] numAdj = new int[2];
            List<TaskC.Vertex> adj = new ArrayList<>();

            public Vertex(int kind) {
                this.kind = kind;
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


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            TaskB.Vertex[] vs = new TaskB.Vertex[n];
            for (int i = 0; i < n; ++i) vs[i] = new TaskB.Vertex(i + 1);
            for (int i = 0; i < m; ++i) {
                TaskB.Vertex a = vs[in.nextInt() - 1];
                TaskB.Vertex b = vs[in.nextInt() - 1];
                addEdge(a, b);
            }
            vs[0].dfs(null);
            if (vs[0].sofar == 0) {
                for (TaskB.Vertex v : vs) {
                    for (TaskB.Edge e : v.outgo) {
                        if (e.direction == 1) {
                            out.println(v.id + " " + e.dest.id);
                        }
                    }
                }
            } else {
                out.println(-1);
            }
        }

        private void addEdge(TaskB.Vertex a, TaskB.Vertex b) {
            TaskB.Edge ab = new TaskB.Edge();
            TaskB.Edge ba = new TaskB.Edge();
            ab.rev = ba;
            ab.dest = b;
            ba.rev = ab;
            ba.dest = a;
            a.outgo.add(ab);
            b.outgo.add(ba);
        }

        static class Edge {
            TaskB.Vertex dest;
            TaskB.Edge rev;
            int direction = -1;

        }

        static class Vertex {
            int id;
            List<TaskB.Edge> outgo = new ArrayList<>();
            int sofar = 0;
            boolean visited = false;

            public Vertex(int id) {
                this.id = id;
            }

            public void dfs(TaskB.Edge toParent) {
                visited = true;
                for (TaskB.Edge e : outgo)
                    if (e != toParent) {
                        if (!e.dest.visited) {
                            e.dest.dfs(e.rev);
                        } else if (e.direction < 0) {
                            e.direction = 0;
                            e.rev.direction = 1;
                        }
                        sofar ^= e.direction;
                    }
                if (toParent != null) {
                    toParent.direction = sofar;
                    toParent.rev.direction = 1 - sofar;
                    sofar = 0;
                }
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


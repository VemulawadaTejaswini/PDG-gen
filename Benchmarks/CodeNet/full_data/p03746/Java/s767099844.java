import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
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
            for (int i = 0; i < n; ++i) {
                vs[i] = new TaskB.Vertex();
                vs[i].index = i + 1;
            }
            for (int i = 0; i < m; ++i) {
                TaskB.Vertex a = vs[in.nextInt() - 1];
                TaskB.Vertex b = vs[in.nextInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
            }
            TaskB.Vertex start = vs[0];
            start.available = false;
            List<TaskB.Vertex> p1 = buildPath(start);
            List<TaskB.Vertex> p2 = buildPath(start);
            Collections.reverse(p2);
            out.println(p1.size() + p2.size() + 1);
            for (TaskB.Vertex v : p2) {
                out.print(v.index);
                out.print(" ");
            }
            out.print(start.index);
            for (TaskB.Vertex v : p1) {
                out.print(" ");
                out.print(v.index);
            }
            out.println();
        }

        private List<TaskB.Vertex> buildPath(TaskB.Vertex at) {
            List<TaskB.Vertex> res = new ArrayList<>();
            outer:
            while (true) {
                for (TaskB.Vertex v : at.adj)
                    if (v.available) {
                        res.add(v);
                        at = v;
                        v.available = false;
                        continue outer;
                    }
                break;
            }
            return res;
        }

        static class Vertex {
            int index;
            boolean available = true;
            List<TaskB.Vertex> adj = new ArrayList<>();

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


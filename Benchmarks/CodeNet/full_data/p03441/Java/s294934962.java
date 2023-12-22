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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskE.Vertex[] vs = new TaskE.Vertex[n];
            for (int i = 0; i < n; ++i) vs[i] = new TaskE.Vertex();
            for (int i = 0; i < (n - 1); ++i) {
                TaskE.Vertex a = vs[in.nextInt()];
                TaskE.Vertex b = vs[in.nextInt()];
                a.adj.add(b);
                b.adj.add(a);
            }
            for (TaskE.Vertex v : vs)
                if (v.adj.size() == 1) {
                    out.println(Math.max(1, v.solve(null)[1]));
                    break;
                }
        }

        static class Vertex {
            List<TaskE.Vertex> adj = new ArrayList<>();

            public int[] solve(TaskE.Vertex parent) {
                int[] resIfPut = new int[]{1, 1};
                int[] resIfNot = new int[]{0, 0};
                int[] zerosIfPut = new int[]{0, 0};
                int[] zerosIfNot = new int[]{0, 0};
                for (TaskE.Vertex v : adj) {
                    if (v == parent) continue;
                    int[] cur = v.solve(this);
                    resIfNot[0] += cur[0];
                    if (cur[0] == 0) ++zerosIfNot[0];
                    resIfNot[1] += cur[1];
                    if (cur[1] == 0) ++zerosIfNot[1];
                    resIfPut[0] += cur[0];
                    if (cur[0] == 0) ++zerosIfPut[0];
                    resIfPut[1] += cur[0];
                    if (cur[0] == 0) ++zerosIfPut[1];
                }
                resIfPut[0] += Math.max(zerosIfPut[0] - 1, 0);
                resIfPut[1] += zerosIfPut[1];
                resIfNot[0] += Math.max(zerosIfNot[0] - 1, 0);
                resIfNot[1] += zerosIfNot[1];
                return new int[]{Math.min(resIfPut[0], resIfNot[0]), Math.min(resIfPut[1], resIfNot[1])};
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


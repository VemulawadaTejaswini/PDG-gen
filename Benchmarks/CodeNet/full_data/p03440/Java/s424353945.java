import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            TaskD.Vertex[] v = new TaskD.Vertex[n];
            for (int i = 0; i < n; ++i) {
                v[i] = new TaskD.Vertex();
                v[i].a = in.nextInt();
            }
            for (int i = 0; i < m; ++i) {
                TaskD.Vertex a = v[in.nextInt()];
                TaskD.Vertex b = v[in.nextInt()];
                a.adj.add(b);
                b.adj.add(a);
            }
            int comps = 0;
            for (TaskD.Vertex vv : v) {
                if (vv.comp < 0) {
                    vv.dfs(comps++);
                }
            }
            int need = 2 * (comps - 1);
            Arrays.sort(v, new Comparator<TaskD.Vertex>() {

                public int compare(TaskD.Vertex o1, TaskD.Vertex o2) {
                    return Long.compare(o1.a, o2.a);
                }
            });
            int[] rem = new int[comps];
            Arrays.fill(rem, comps - 1);
            long res = 0;
            for (TaskD.Vertex vv : v) {
                if (need == 0) break;
                if (rem[vv.comp] == 0) continue;
                --rem[vv.comp];
                --need;
                res += vv.a;
            }
            if (need == 0) out.println(res);
            else out.println("Impossible");
        }

        static class Vertex {
            int comp = -1;
            long a;
            List<TaskD.Vertex> adj = new ArrayList<>();

            public void dfs(int c) {
                comp = c;
                for (TaskD.Vertex v : adj) if (v.comp < 0) v.dfs(c);
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


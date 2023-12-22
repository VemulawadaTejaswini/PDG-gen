import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HossamDoma
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

            Vertex[] ls = new Vertex[n + 1];

            for (int i = 1; i <= n; ++i)
                ls[i] = new Vertex(i);

            for (int i = 0; i < n - 1; ++i) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();

                ls[a].adj.add(new Edge(ls[b], c));
                ls[b].adj.add(new Edge(ls[a], c));
            }

            int q = in.nextInt();
            int k = in.nextInt();

            Queue<Vertex> qq = new LinkedList<>();
            qq.add(ls[k]);

            long[] bst = new long[n + 1];
            Arrays.fill(bst, Long.MAX_VALUE);

            bst[k] = 0;

            while (!qq.isEmpty()) {
                Vertex top = qq.poll();

                for (Edge e : top.adj) {
                    if (bst[top.id] + e.cost < bst[e.to.id]) {
                        bst[e.to.id] = bst[top.id] + e.cost;
                        qq.add(e.to);
                    }
                }
            }

            for (int i = 0; i < q; ++i) {
                int a = in.nextInt();
                int b = in.nextInt();
                out.println(bst[a] + bst[b]);
            }
        }

    }

    static class Vertex {
        int id;
        List<Edge> adj;

        Vertex(int id) {
            this.id = id;
            adj = new ArrayList<>();
        }

    }

    static class Edge {
        Vertex to;
        long cost;

        public Edge(Vertex to, long cost) {
            this.to = to;
            this.cost = cost;
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


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
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
            ArrayList<TaskD.Edge>[] g = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt();
                g[a].add(new TaskD.Edge(b, c));
                g[b].add(new TaskD.Edge(a, c));
            }

            int Q = in.nextInt();
            int k = in.nextInt() - 1;

            Queue<Integer> q = new LinkedList<>();
            q.add(k);
            long[] dist = new long[n];
            Arrays.fill(dist, Long.MAX_VALUE);
            dist[k] = 0;

            while (!q.isEmpty()) {
                int from = q.poll();
                for (TaskD.Edge e : g[from]) {
                    if (dist[e.to] == Long.MAX_VALUE)
                        q.add(e.to);

                    dist[e.to] = Math.min(dist[from] + e.w, dist[e.to]);
                }
            }

            for (int i = 0; i < Q; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                out.println(dist[x] + dist[y]);
            }
        }

        static class Edge {
            int to;
            int w;

            public Edge(int to, int w) {
                this.w = w;
                this.to = to;
            }

        }

    }

    static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream is) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            this.br = br;
        }

        public String next() {
            if (st == null || !st.hasMoreTokens()) {
                String nextLine = null;
                try {
                    nextLine = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (nextLine == null)
                    return null;
                st = new StringTokenizer(nextLine);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
 
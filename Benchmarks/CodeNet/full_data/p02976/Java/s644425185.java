import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B_EvenDegrees solver = new B_EvenDegrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_EvenDegrees {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (m % 2 != 0) {
                out.println(-1);
                return;
            }
            List<Edge>[] edges = new List[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                Edge e = new Edge();
                e.a = in.nextInt() - 1;
                e.b = in.nextInt() - 1;
                edges[e.a].add(e);
                edges[e.b].add(e);
            }
            int[] q = new int[n];
            int qh = 0;
            int qt = 1;
            Edge[] p = new Edge[n];
            while (qh < qt) {
                int v = q[qh++];
                for (Edge e : edges[v]) {
                    int u = e.otherEnd(v);
                    if (u != 0 && p[u] == null) {
                        e.inTree = true;
                        p[u] = e;
                        q[qt++] = u;
                    }
                }
            }
            List<Edge>[] ans = new List[n];
            for (int i = 0; i < n; i++) {
                ans[i] = new ArrayList<>();
            }
            int[] deg = new int[n];
            for (int i = 0; i < n; i++) {
                for (Edge e : edges[i]) {
                    if (!e.inTree && e.a == i) {
                        ++deg[e.a];
                        ans[e.a].add(e);
                    }
                }
            }
            for (int i = n - 1; i > 0; i--) {
                int v = q[i];
                Edge e = p[v];
                if (deg[v] % 2 == 0) {
                    v = e.otherEnd(v);
                }
                ++deg[v];
                ans[v].add(e);
                if (e.a != v) {
                    e.swapEnds();
                }
            }
            for (int i = 0; i < n; i++) {
                for (Edge e : ans[i]) {
                    out.println((e.a + 1) + " " + (e.b + 1));
                }
            }
        }

        class Edge {
            int a;
            int b;
            boolean inTree;

            void swapEnds() {
                int t = a;
                a = b;
                b = t;
            }

            int otherEnd(int v) {
                return a ^ b ^ v;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


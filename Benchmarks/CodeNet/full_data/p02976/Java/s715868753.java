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
            List<Edge>[] adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            Edge[] edges = new Edge[m];
            for (int i = 0; i < m; i++) {
                Edge e = new Edge();
                e.a = in.nextInt() - 1;
                e.b = in.nextInt() - 1;
                adj[e.a].add(e);
                adj[e.b].add(e);
                edges[i] = e;
            }
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<Edge> unused = new ArrayList<>();
                for (Edge e : adj[i]) {
                    if (!e.used) {
                        unused.add(e);
                    }
                }
                for (int j = 0; j + 1 < unused.size(); j += 2) {
                    Edge e1 = unused.get(j);
                    Edge e2 = unused.get(j + 1);
                    ans.add(e1.toString(i));
                    ans.add(e2.toString(i));
                    e1.used = true;
                    e2.used = true;
                }
            }
            for (Edge e : edges) {
                if (!e.used) {
                    out.println(-1);
                    return;
                }
            }
            for (String s : ans) {
                out.println(s);
            }
        }

        class Edge {
            int a;
            int b;
            boolean used;

            String toString(int from) {
                return (from + 1) + " " + ((from ^ a ^ b) + 1);
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


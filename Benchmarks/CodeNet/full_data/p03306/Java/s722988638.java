import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        static class Edge {
            int v, w;
            Edge(int v, int w) {
                this.v = v;
                this.w = w;
            }
        }

        int n, m;
        List<Edge>[] adj;

        int[] h;
        long[] a;

        boolean DFS(int u) {
            for (Edge e: adj[u]) {
                int v = e.v;
                int w = e.w;
                if (h[v] == -1) {
                    h[v] = h[u] ^ 1;
                    a[v] = w - a[u];
                    if (DFS(v) == false) {
                        return false;
                    }
                } else {
                    if (h[v] != h[u] && a[v] != w - a[u]) {
                        return false;
                    }
                }
            }
            return true;
        }

        private void Solve() {
            n = inp.nextInt();
            m = inp.nextInt();
            adj = new ArrayList[n];
            for (int i = 0; i < n; ++i) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; ++i) {
                int u = inp.nextInt() - 1;
                int v = inp.nextInt() - 1;
                int w = inp.nextInt();
                adj[u].add(new Edge(v, w));
                adj[v].add(new Edge(u, w));
            }

            h = new int[n];
            a = new long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = -1;
                h[i] = -1;
            }

            h[0] = 0;
            a[0] = 0;
            if (DFS(0) == false) {
                out.println(0);
                return;
            }

            long delta = -1;
            boolean fixed = false;
            for (int u = 0; u < n; ++u) {
                for (Edge e: adj[u]) {
                    int v = e.v;
                    int w = e.w;
                    if (h[v] != h[u]) {
                        continue;
                    }
                    if ((w + a[u] + a[v]) % 2 == 1) {
                        out.println(0);
                        return;
                    }
                    long required = (w - (a[u] + a[v])) / 2 * (h[u] == 1 ? -1 : 1);
                    if (!fixed) {
                        delta = required;
                    } else {
                        if (delta != required) {
                            out.println(0);
                            return;
                        }
                    }
                    fixed = true;
                }
            }
            if (fixed) {
                boolean ok = true;
                for (int i = 0; i < n; ++i) {
                    a[i] += delta * (h[i] == 0 ? 1 : -1);
                    if (a[i] <= 0) {
                        ok = false;
                        break;
                    }
                }
                out.println(ok ? "1" : "0");
                return;
            }

            long[] f = {0, (long) 1e18};
            for (int i = 0; i < n; ++i) {
                if (h[i] == 0) {
                    f[0] = Math.max(f[0], 1 - a[i]);
                } else {
                    f[1] = Math.min(f[1], a[i] - 1);
                }
            }
            out.println(Math.max(0, f[1] - f[0] + 1));
        }
        static InputReader inp;
        static PrintWriter out;
    }

    private static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        private InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }
        private long nextLong() {
            return Long.parseLong(next());
        }
        private int[] nextArrayInt(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = nextInt();
            }
            return a;
        }
    }
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Solver.inp = new InputReader(inputStream);
        Solver.out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.Solve();
        Solver.out.close();
    }
}
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    class Edge {
        int to, id;
        boolean used = false;
        Edge rev;

        Edge(int to, int id) {
            this.to = to;
            this.id = id;
        }
    }

    int[] imos;
    boolean[] vis;
    List<Edge>[] g;
    void dfs(int u, int par) {
        vis[u] = true;
        for (Edge e: g[u]) {
            if (vis[e.to]) {
                if (e.used || e.to == par) continue;
                imos[e.to]--;
                imos[u]++;
                e.used = e.rev.used = true;
            } else {
                dfs(e.to, u);
            }
        }
    }

    int dfs2(int u) {
        vis[u] = true;
        int res = imos[u];
        for (Edge e : g[u]) {
            if (vis[e.to]) continue;
            res += dfs2(e.to);
        }
        return res;
    }

    void run() {
        int N = in.nextInt(), M = in.nextInt();
        g = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            Edge e1 = new Edge(b, i);
            Edge e2 = new Edge(a, i);
            e1.rev = e2; e2.rev = e1;
            g[a].add(e1);
            g[b].add(e2);
        }
        vis = new boolean[N];
        imos = new int[N];
        dfs(0, -1);
        // System.out.println(Arrays.toString(imos));
        Arrays.fill(vis, false);
        dfs2(0);
        // System.out.println(Arrays.toString(imos));

        int res = 0;
        for (int i = 0; i < N; i++) {
            if (imos[i] == 0) res++;
        }
        System.out.println(res - 1);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            //stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            return nextIntArray(n, 0);
        }

        int[] nextIntArray(int n, int margin) {
            int[] array = new int[n + margin];
            for (int i = 0; i < n; i++)
                array[i + margin] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            return nextLongArray(n, 0);
        }

        long[] nextLongArray(int n, int margin) {
            long[] array = new long[n + margin];
            for (int i = 0; i < n; i++)
                array[i + margin] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            return nextDoubleArray(n, 0);
        }

        double[] nextDoubleArray(int n, int margin) {
            double[] array = new double[n + margin];
            for (int i = 0; i < n; i++)
                array[i + margin] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}

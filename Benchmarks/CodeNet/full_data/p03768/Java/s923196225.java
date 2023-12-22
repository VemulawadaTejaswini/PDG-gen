import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        int[][] color = new int[n][11];
        int[][] time = new int[n][11];
        int q = in.nextInt();
        int[] v = new int[q];
        int[] d = new int[q];
        int[] c = new int[q];
        for (int i = 0; i < q; i++) {
            v[i] = in.nextInt() - 1;
            d[i] = in.nextInt();
            c[i] = in.nextInt();
            color[v[i]][d[i]] = c[i];
            time[v[i]][d[i]] = i + 1;
        }
        PriorityQueue<Point> queue = new PriorityQueue<>(Comparator.comparing(pair -> -time[pair.x][pair.y]));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 11; j++) {
                queue.add(new Point(i, j));
            }
        }
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int u : edges.get(p.x)) {
                if (1 <= p.y && time[u][p.y - 1] < time[p.x][p.y]) {
                    color[u][p.y - 1] = color[p.x][p.y];
                    time[u][p.y - 1] = time[p.x][p.y];
                    queue.add(new Point(u, p.y - 1));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int ac = 0, at = 0;
            for (int j = 0; j < 11; j++) {
                if (at < time[i][j]) {
                    at = time[i][j];
                    ac = color[i][j];
                }
            }
            out.println(ac);
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private static PrintWriter out = new PrintWriter(System.out);

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
    }

    void flush() {
        out.flush();
    }
}

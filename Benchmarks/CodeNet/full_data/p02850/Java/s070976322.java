import java.awt.Point;
import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static int inf = 0x7ffffff;

    void solve() {
        int n = scanner.nextInt();
        List<Map<Integer, Integer>> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new HashMap<>());
        }
        int[][] edges1 = new int[n - 1][2];
        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges1[i - 1] = new int[] {a, b};
            edges.get(a).put(b, -1);
            edges.get(b).put(a, -1);
        }
        Deque<Point> deque = new ArrayDeque<>();
        deque.add(new Point(0, -1));
        int cc = 0;
        while (!deque.isEmpty()) {
            Point v = deque.poll();
            int pcolor = v.y == -1 ? -1 : edges.get(v.y).get(v.x);
            int color = 1;
            for (Map.Entry<Integer, Integer> u : edges.get(v.x).entrySet()) {
                if (v.y != u.getKey()) {
                    if (color == pcolor) {
                        color++;
                    }
                    cc = Math.max(cc, color);
                    u.setValue(color++);
                    deque.add(new Point(u.getKey(), v.x));
                }
            }
        }
        System.out.println(cc);
        for (int i = 0; i < n - 1; i++) {
            System.out.println(edges.get(edges1[i][0]).get(edges1[i][1]) == -1 ? edges.get(edges1[i][1]).get(edges1[i][0]) : edges.get(edges1[i][0]).get(edges1[i][1]));
        }
    }

    public static void main(String[]$) throws Exception {
        new Main().solve();
        System.out.flush();
    }
}

class System {
    static PrintWriter out = new PrintWriter(java.lang.System.out);

    static void exit() {
        java.lang.System.exit(0);
    }
}

class Scanner {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 0x10000);
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

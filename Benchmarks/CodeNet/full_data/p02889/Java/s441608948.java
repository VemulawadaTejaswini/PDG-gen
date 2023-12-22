import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;
    static long inf = 1L << 60;

    static int n, m, l;
    public static void main(String[]$) throws Exception {
        n = scanner.nextInt();
        m = scanner.nextInt();
        l = scanner.nextInt();
        List<List<Grid>> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            long c = scanner.nextLong();
            if (c <= l) {
                edges.get(a).add(new Grid(b, c));
                edges.get(b).add(new Grid(a, c));
            }
        }
        long[][] dist = new long[n][n];
        for (int i = 0; i < n; i++) {
            dist[i] = dijkstra(edges, i);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int s = scanner.nextInt() - 1;
            int t = scanner.nextInt() - 1;
            if (dist[s][t] >= inf) {
                System.out.println(-1);
            } else {
                System.out.println((dist[s][t] - 1) / l);
            }
        }
    }

    static long[] dijkstra(List<List<Grid>> edges, int start) {
        long[] cost = new long[edges.size()];
        Arrays.fill(cost, inf);
        cost[start] = 0;

        Queue<Grid> queue = new PriorityQueue<>();
        queue.add(new Grid(start, 0));

        while (!queue.isEmpty()) {
            Grid grid = queue.poll();
            if (cost[grid.to] >= grid.cost) {
                for (Grid g : edges.get(grid.to)) {
                    long c;
                    long mod = cost[grid.to] % l;
                    if (mod + g.cost > l) {
                        c = cost[grid.to] - mod + l + g.cost;
                    } else {
                        c = cost[grid.to] + g.cost;
                    }
                    if (cost[g.to] > c) {
                        cost[g.to] = c;
                        queue.add(new Grid(g.to, cost[g.to]));
                    }
                }
            }
        }
        return cost;
    }

    static class Grid implements Comparable<Grid> {
        int to;
        long cost;

        Grid(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Grid o) {
            return Long.compare(this.cost, o.cost);
        }

        @Override
        public String toString() {
            return String.format("[%s, %s]", to, cost);
        }
    }

    static class System {
        static PrintWriter out = new PrintWriter(java.lang.System.out);

        static {
            Runtime.getRuntime().addShutdownHook(new Thread(System.out::flush));
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 1 << 15);
        StringTokenizer tokenizer;

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

        int[] nextIntArray(int n, java.util.function.IntUnaryOperator op) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsInt(nextInt());
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

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        long[] nextLongArray(int n, java.util.function.LongUnaryOperator op) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsLong(nextLong());
            }
            return a;
        }
    }
}

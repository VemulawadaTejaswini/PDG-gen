import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static class Edge {
        int to;
        int cost;
        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    private List<List<Edge>> tree;
    private long[] depth;
    private void solve(Scanner sc) {
        int N = sc.nextInt();
        tree = new ArrayList<>();
        depth = new long[N];
        for (int i = 0; i < N; ++i) {
            tree.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            tree.get(a).add(new Edge(b, c));
            tree.get(b).add(new Edge(a, c));
        }

        int Q = sc.nextInt();
        int K = sc.nextInt() - 1;

        dfs(K, -1, 0);

        for (int i = 0; i < Q; ++i) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            _out.println((depth[x] + depth[y]));
        }
    }
    private void dfs(int v, int p, long d) {
        depth[v] = d;
        for (Edge e : tree.get(v)) {
            if (e.to == p) {
                continue;
            }
            dfs(e.to, v, d + e.cost);
        }
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}
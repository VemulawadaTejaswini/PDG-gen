import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        int N = sc.nextInt();

        List<List<Path>> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= N - 1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list.get(a).add(new Path(a, b, 1));
            list.get(b).add(new Path(b, a, 1));
        }

        long[] dist = dist(N, list);
        long ct1 = 0;
        long ct2 = 0;
        for (int i = 1; i < N - 1; ++i) {
            if (dist[i] < dist[N - 1]) {
                ++ct1;
            }
            if (dist[i] > dist[N - 1]) {
                ++ct2;
            }
        }
//_err.println(Arrays.toString(dist));
//_err.println(ct1 + " / " + ct2);

        if (ct1 >= ct2) {
            _out.println("Fennec");
        } else {
            _out.println("Snuke");
        }
    }
    private long[] dist(int N, List<List<Path>> edges) {
        long[] dist = new long[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        Queue<Path> q = new PriorityQueue<>();
        for (int i = 0; i < edges.size(); ++i) {
            for (Path edge : edges.get(i)) {
                q.offer(edge);
            }
        }

        while (!q.isEmpty()) {
            Path edge = q.poll();
            int u = edge.to;
            for (Path p : edges.get(u)) {
                long tmp = dist[u] + p.cost;
                if (dist[p.to] > tmp) {
                    dist[p.to] = tmp;
                    Path newPath = new Path(0, p.to, tmp);
                    q.offer(newPath);
                }
            }
        }

        return dist;
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
    private static class Path implements Comparable<Path> {
        int from;
        int to;
        long cost;
        public Path(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        @Override
        public int compareTo(Path that) {
            if (that.cost > this.cost) {
                return -1;
            } else if (that.cost < this.cost) {
                return 1;
            }
            if (that.from != this.from) {
                return this.from - that.from;
            }
            if (that.to != this.to) {
                return this.to - that.to;
            }
            return 0;
        }
        @Override
        public String toString() {
            return "[" + from + ", " + to + ", " + cost + "]";
        }
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
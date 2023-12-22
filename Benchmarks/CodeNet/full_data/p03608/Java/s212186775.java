import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static class Road {
        int to;
        int cost;
        public Road(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    private List<List<Road>> roads = new ArrayList<>();
    private List<Integer> r = new ArrayList<>();

    private int ans = Integer.MAX_VALUE;

    private void solve(Scanner sc) {
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            roads.add(new ArrayList<>());
        }
        int M = sc.nextInt();
        int R = sc.nextInt();
        for (int i = 0; i < R; ++i) {
            r.add(sc.nextInt() - 1);
        }
        for (int i = 0; i < M; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            roads.get(a).add(new Road(b, c));
            roads.get(b).add(new Road(a, c));
        }

        for (int i : r) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            search(list, new HashSet<>(), -1, i, 0);
        }

        _out.println(ans);
    }
    private Set<String> memo = new HashSet<>();
    private void search(List<Integer> list, Set<Integer> set, int p, int t, int d) {
        String key = list.toString() + "-" + set + "-" + p + "-" + t + "-" + d;
        if (memo.contains(key)) {
            return;
        }
        memo.add(key);

        if (r.contains(t)) {
            set.add(t);
        }
        try {
            if (set.size() >= r.size()) {
                if (d < ans) {
                    ans = d;
                }
                return;
            }

            for (Road road : roads.get(t)) {
                if (list.contains(road.to)) {
                    continue;
                }
                list.add(road.to);
                search(list, set, t, road.to, d + road.cost);
                list.remove(list.size() - 1);
            }
        } finally {
            if (r.contains(t)) {
                set.remove(t);
            }
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
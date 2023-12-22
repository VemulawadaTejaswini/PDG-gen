import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private int N;
    private Map<Integer, List<Pair<Integer>>> map = new HashMap<>();

    private void solve(Scanner sc) {
        N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i < M; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            List<Pair<Integer>> list = map.get(a);
            if (list == null) {
                list = new ArrayList<>();
                map.put(a, list);
            }
            list.add(new Pair<>(b, c));
        }

        long ans = search(new ArrayList<>(), 0, 0);
        _out.println((ans == Long.MAX_VALUE ? "inf" : String.valueOf(ans)));
    }
    private long search(List<Integer> route, int node, long score) {
        // ループの判定
        if (route.contains(node)) {
            long tmp = 0;
            int idx = route.indexOf(node);
            for (int i = idx; i < route.size(); ++i) {
                List<Pair<Integer>> l = map.get(route.get(i));
                int next = (i < route.size() - 1 ? route.get(i + 1) : node);
                for (Pair<Integer> p : l) {
                    if (p.a == next) {
                        tmp += p.b;
                        break;
                    }
                }
            }
            if (tmp > 0) {
                return Long.MAX_VALUE;
            } else {
                return Long.MIN_VALUE;
            }
        }
        // ゲーム終了の判定
        if (node == N - 1) {
            if (!map.containsKey(node)) {
                return score;
            }
        }

        // たどれるルートを全探索
        route.add(node);
        List<Pair<Integer>> l = map.get(route.get(node));
        if (l != null) {
            long max = Long.MIN_VALUE;
            for (Pair<Integer> p : l) {
                max = Math.max(max, search(route, p.a, score + p.b));
            }
            route.remove(route.size() - 1);
            return max;
        } else {
            return score;
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
    private static class Pair<T extends Comparable<T>> implements Comparable<Pair<T>> {
        T a;
        T b;
        public Pair(T a, T b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Pair<T> that) {
            if (this == that) {
                return 0;
            }
            if (this.a != null && that.a == null) {
                return 1;
            } else if (this.a == null && that.a != null) {
                return -1;
            }
            if (this.b != null && that.b == null) {
                return 1;
            } else if (this.b == null && that.b != null) {
                return -1;
            }
            int r = 0;
            if (this.a != null && that.a != null) {
                r = this.a.compareTo(that.a);
                if (r != 0) {
                    return r;
                }
            }
            if (this.b != null && that.b != null) {
                r = this.b.compareTo(that.b);
                if (r != 0) {
                    return r;
                }
            }
            return r;
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof Pair) {
                Pair that = (Pair)o;
                boolean res = (this.a == null && this.a == that.a || this.a != null && this.a.equals(that.a));
                res = res && (this.b == null && this.b == that.b || this.b != null && this.b.equals(that.b));
                return res;
            }
            return false;
        }
        @Override
        public int hashCode() {
            int hashCode = 17;
            hashCode = hashCode * 31 + (a != null ? a.hashCode() : 0);
            hashCode = hashCode * 31 + (b != null ? b.hashCode() : 0);
            return hashCode;
        }
        @Override
        public String toString() {
            return "[" + a + ", " + b + "]";
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
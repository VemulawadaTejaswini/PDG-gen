import java.io.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private int N;
    private int M;

    private Map<Integer, List<Triple<Integer>>> map = new HashMap<>();
    private Set<Integer> edge = new HashSet<>();

    private int min;
    private List<Triple<Integer>> minRoute;

    private void solve(Scanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        int[] c = new int[M];
        for (int i = 0; i < N; ++i) {
            map.put(i + 1, new ArrayList<>());
        }
        for (int i = 0; i < M; ++i) {
            edge.add(i + 1);

            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();

            map.get(a[i]).add(new Triple<>(b[i], c[i], i + 1));
            map.get(b[i]).add(new Triple<>(a[i], c[i], i + 1));
        }

        for (int i = 1; i <= N; ++i) {
            for (int j = i + 1; j <= N; ++j) {
                search(i, j);
            }
        }

        _out.println(edge.size());
    }
    private void search(int a, int b) {
        min = Integer.MAX_VALUE;
        minRoute = null;
        subSearch(a, b, 0, new ArrayList<>());
        for (Triple<Integer> t : minRoute) {
            edge.remove(t.c);
        }
    }
    private void subSearch(int a, int b, int dist, List<Triple<Integer>> route) {
        if (a == b) {
            if (dist < min) {
                min = dist;
                minRoute = new ArrayList<>(route);
            }
            return;
        }

        if (dist > min) {
            return;
        }
 
        List<Triple<Integer>> list = map.get(a);
        for (Triple<Integer> t : list) {
            if (!route.contains(t)) {
                route.add(t);
                subSearch(t.a, b, dist + t.b, route);
                route.remove(route.size() - 1);
            }
        }
    }
    private long C(long n, long r) {
        long res = 1;
        for (long i = n; i > n - r; --i) {
            res *= i;
        }
        for (long i = r; i > 1; --i) {
            res /= i;
        }
        return res;
    }
    private long P(long n, long r) {
        long res = 1;
        for (long i = n; i > n - r; --i) {
            res *= i;
        }
        return res;
    }
    private static class Triple<T extends Comparable<T>> implements Comparable<Triple<T>> {
        T a;
        T b;
        T c;
        public Triple(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        @Override
        public int compareTo(Triple<T> that) {
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
            if (this.c != null && that.c == null) {
                return 1;
            } else if (this.c == null && that.c != null) {
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
            if (this.c != null && that.c != null) {
                r = this.c.compareTo(that.c);
                if (r != 0) {
                    return r;
                }
            }
            return r;
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof Triple) {
                Triple that = (Triple)o;
                boolean res = (this.a == null && this.a == that.a || this.a != null && this.a.equals(that.a));
                res = res && (this.b == null && this.b == that.b || this.b != null && this.b.equals(that.b));
                res = res && (this.c == null && this.c == that.c || this.c != null && this.c.equals(that.c));
                return res;
            }
            return false;
        }
        @Override
        public int hashCode() {
            int hashCode = 17;
            hashCode = hashCode * 31 + (a != null ? a.hashCode() : 0);
            hashCode = hashCode * 31 + (b != null ? b.hashCode() : 0);
            hashCode = hashCode * 31 + (c != null ? c.hashCode() : 0);
            return hashCode;
        }
        @Override
        public String toString() {
            return "[" + a + ", " + b + ", " + c + "]";
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
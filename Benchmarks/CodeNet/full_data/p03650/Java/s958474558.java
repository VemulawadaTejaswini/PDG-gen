import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] P;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        P = sc.nextIntArray(N, -1);

        System.out.println(solve());
    }

    static String solve() {
        int[] U = new int[N];
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            int p = P[i];
            // i -> p
            // 逆に見なしたほうがうれしい
            U[i] = i;
            V[i] = p;
        }

        int[][] G = adjD(N, U, V);
        int[][] F = adjD(N, V, U);

        // cyrcleの部分以外に数を割り当てる
        int[] A = reliefCircle(G, F);

        int start = -1;
        for (int i = 0; i < N; i++) {
            if( A[i] == -1 ) {
                start = i;
                break;
            }
        }

        boolean ok = check(start, grundy(start, A, F), Arrays.copyOf(A, N), G, F);
        if( ok ) return "POSSIBLE";

        ok = check(start, nextGrundy(start, A, F), A, G, F);
        return ok ? "POSSIBLE" : "IMPOSSIBLE";
    }

    static boolean check(int start, int a_start, int[] A, int[][] G, int[][] F) {
        A[start] = a_start;

        int curr = start;
        while(true) {
            int next = G[curr][0];
            int a = grundy(next, A, F);
            if( next == start ) {
                return a == a_start;

            } else {
                A[next] = a;
                curr = next;
            }
        }
    }

    static int[] reliefCircle(int[][] G, int[][] F) {
        int[] deg = new int[N];
        for (int[] tos : G) {
            for (int to : tos) {
                deg[to]++;
            }
        }

        int[] A = new int[N];
        Arrays.fill(A, -1);
        int[] q = new int[N];
        int s = 0, t = 0;
        for (int v = 0; v < N; v++) {
            if( deg[v] == 0 ) {
                q[t++] = v;
                A[v] = 0;
            }
        }

        int idx = 0;
        while( s != t ) {
            int v = q[s++];
            for (int to : G[v]) {
                deg[to]--;
                if( deg[to] == 0 ) {
                    A[to] = grundy(to, A, F);
                    q[t++] = to;
                }
            }
        }

        return A;
    }

    // mexだっけ？
    static int grundy(int v, int[] A, int[][] F) {
        Set<Integer> num = new HashSet<>();
        for (int from : F[v]) {
            num.add(A[from]);
        }
        for (int i = 0; i < N; i++) {
            if( !num.contains(i) ) {
                return i;
            }
        }
        throw new IllegalArgumentException("wtf");
    }

    static int nextGrundy(int v, int[] A, int[][] F) {
        Set<Integer> num = new HashSet<>();
        num.add(grundy(v, A, F));
        for (int from : F[v]) {
            num.add(A[from]);
        }
        for (int i = 0; i < N; i++) {
            if( !num.contains(i) ) {
                return i;
            }
        }
        throw new IllegalArgumentException("wtf");
    }

    static int[][] adjD(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
        }
        return adj;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}

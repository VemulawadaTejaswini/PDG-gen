import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        A = new int[M];
        B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }

        PrintWriter pw = new PrintWriter(System.out);
        int[] vs = solve();
        if( vs != null ) {
            pw.println(vs.length);
            for (int v : vs) {
                pw.println(v+1);
            }
        } else {
            pw.println(-1);
        }
        pw.flush();
    }

    static int[] solve() {
        // サイクルがあればそれ以下の中にpureなサイクルがありそうな気がする
        int[][] G = adjD(N, A, B);
        int[] deg = khan(N, G);
        if( deg == null ) return null; // no cycle

        Set<Integer> vs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if( deg[i] > 0 ) {
                vs.add(i);
            }
        }

        while(true) {
            Set<Integer> reduced = calc(vs, G);
            if( reduced == null ) {
                return vs.stream().mapToInt(i -> i).toArray();
            } else {
                vs = reduced;
                // continue
            }
        }
    }

    static Set<Integer> calc(Set<Integer> vs, int[][] G) {
        int start = vs.iterator().next();
        ArrayDeque<Integer> path = new ArrayDeque<>();
        path.add(start);
        Set<Integer> pathSet = new HashSet<>();
        pathSet.add(start);
        return dfs(start, vs, path, pathSet, G);
    }

    static Set<Integer> dfs(int a, Set<Integer> vs, ArrayDeque<Integer> path, Set<Integer> pathSet, int[][] G) {
        for (int b : G[a]) {
            if( !vs.contains(b) ) continue;

            if( pathSet.contains(b) ) {
                if( path.size() != vs.size() ) {
                    return subCycle(path, b);

                } else {
                    // 同じサイクルっぽいので無視
                }

            } else {
                path.add(b);
                pathSet.add(b);

                Set<Integer> ret = dfs(b, vs, path, pathSet, G);
                if( ret != null ) return ret;

                pathSet.remove(b);
                path.pollLast();
            }
        }
        return null;
    }

    static Set<Integer> subCycle(ArrayDeque<Integer> path, int dupe) {
        Set<Integer> sub = new HashSet<>();
        sub.add(dupe);
        while(true) {
            int a = path.pollLast();
            if( a != dupe ) {
                sub.add(a);
            } else {
                return sub;
            }
        }
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

    static class Edge {
        int a, b;

        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }


    static int[] khan(int V, int[][] G) {
        int[] deg = new int[V];
        for (int[] tos : G) {
            for (int to : tos) {
                deg[to]++;
            }
        }

        int[] q = new int[V];
        int a = 0, b = 0;
        for (int v = 0; v < V; v++) {
            if( deg[v] == 0 ) q[b++] = v;
        }

        int[] ret = new int[V];
        int idx = 0;
        while( a != b ) {
            int v = q[a++];
            ret[idx++] = v;
            for (int to : G[v]) {
                deg[to]--;
                if( deg[to] == 0 ) {
                    q[b++] = to;
                }
            }
        }

        for (int v = 0; v < V; v++) {
            if( deg[v] != 0 ) return deg;
        }
        return null;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

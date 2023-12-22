import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static String S, T;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();
        T = sc.next();

        System.out.println(solve());
    }

    static int solve() {
        if( S.length() < T.length() ) {
            StringBuilder b = new StringBuilder();
            b.append(S);
            while( b.length() < T.length() ) {
                b.append(S);
            }
            S = b.toString();
        }

        int N = S.length();

        int[] table = createTable(T);
        boolean[] match = new boolean[N];
        {
            int i = 0;
            int j = 0;
            while(i < N+T.length()) {
                if( S.charAt(i%N) == T.charAt(j) ) {
                    i++;
                    j++;

                    if( j == T.length() ) {
                        //　終了条件がかっこ悪い気が...
                        int idx = i-T.length();
                        if( idx >= N ) break;
                        match[idx] = true;
                        j = table[j];
                    }

                } else {
                    if( j != 0 ) {
                        j = table[j];

                    } else {
                        i++;
                    }
                }
            }
        }

        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < N; i++) {
            if( match[i] ) {
                int j = (i + T.length()) % N;
                uf.unite(i, j);
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, uf.count(i));
        }
        if( max == N ) return -1; // loop
        return max - 1;
    }

    static class UnionFind {

        private final int[] parent;
        private final int[] count;

        public UnionFind(int n) {
            parent = new int[n];
            count = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                count[i] = 1;
            }
        }

        public int root(int i) {
            if (parent[i] == i) {
                return i;
            } else {
                return parent[i] = root(parent[i]);
            }
        }

        public int unite(int i, int j) {
            int ri = root(i);
            int rj = root(j);
            if (ri == rj) return ri;


            int big = count[ri] < count[rj] ? rj : ri;
            int small = big == ri ? rj : ri;
            parent[small] = big;
            count[big] += count[small];
            return big;
        }

        public int count(int a) {
            return count[root(a)];
        }

        public boolean isSame(int a, int b) {
            return root(a) == root(b);
        }
    }

    public static int[] createTable(String S) {
        int n = S.length();
        int[] kmp = new int[n+1];
        kmp[0] = -1;
        for (int i = 0; i < n; i++) {
            int t = kmp[i];
            while( t != -1 && S.charAt(i) != S.charAt(t) ) {
                t = kmp[t];
            }
            kmp[i+1] = t+1;
        }
        return kmp;
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

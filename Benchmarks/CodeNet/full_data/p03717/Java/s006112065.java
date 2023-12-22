import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, M;
    static int[][] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        C = new int[M][3];
        for (int i = 0; i < M; i++) {
            C[i][0] = sc.nextInt();
            C[i][1] = sc.nextInt();
            C[i][2] = sc.nextInt();
        }

        System.out.println(solve());
    }

    static int MOD = 1_000_000_007;

    static int solve() {
        List<int[]>[] map = new List[N+1];
        for (int i = 1; i <= N; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int[] c = C[i];
            int r = c[1];
            map[r].add(c);
        }

        if( !isOk(map[1], 1, 0, 0) ) {
            // いきなりダメなので終了
            return 0;
        }

        // 二色目、三色目が出現する場所, 1-origin
        int[][] curr = new int[N+1][N+1];
        int[][] next = new int[N+1][N+1];

        curr[0][0] = 3;

        for (int fst = 1; fst < N; fst++) {
            for (int[] row : next) Arrays.fill(row, 0);

            for (int snd = 0; snd < fst; snd++) {
                for (int thd = 0; thd <= snd; thd++) {
                    if( curr[snd][thd] == 0 ) continue;

                    // fst
                    next[snd][thd] = add(next[snd][thd], curr[snd][thd]);

                    // snd
                    next[fst][thd] = add(next[fst][thd], curr[snd][thd]);

                    // thd
                    next[fst][snd] = add(next[fst][snd], curr[snd][thd]);
                }
            }

            // check
            List<int[]> checks = map[fst+1];
            for (int snd = 0; snd < fst + 1; snd++) {
                for (int thd = 0; thd <= snd; thd++) {
                    boolean ok = isOk(checks, fst+1, snd, thd);
                    if( !ok ) next[snd][thd] = 0;
                }
            }

            int[][] t = curr;
            curr = next;
            next = t;
        }

        int ans = 0;
        for (int snd = 0; snd < N; snd++) {
            for (int thd = 0; thd <= snd; thd++) {
                ans = add(ans, curr[snd][thd]);
            }
        }
        return ans;
    }

    static boolean isOk(List<int[]> cs, int fst, int snd, int thd) {
        // foreach構文使うとiteratorが発生するので使わない
        for (int i = 0; i < cs.size(); i++) {
            int[] c = cs.get(i);

            int l = c[0];
            int r = c[1];
            int x = c[2];

            int cnt = 0;
            if( l <= fst && fst <= r ) cnt++;
            if( l <= snd && snd <= r ) cnt++;
            if( l <= thd && thd <= r ) cnt++;
            if( cnt != x ) return false;
        }
        return true;
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) c %= MOD;
        return c;
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

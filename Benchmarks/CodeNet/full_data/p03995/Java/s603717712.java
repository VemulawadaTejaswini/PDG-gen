import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int H, W, N;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        N = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
        }

        System.out.println(solve() ? "Yes" : "No");
    }

    static class Cord {
        int r, c, a;

        public Cord(int r, int c, int a) {
            this.r = r;
            this.c = c;
            this.a = a;
        }
    }

    static boolean solve() {
        Arrays.sort(C, Comparator.<Cord>comparingInt(c -> c.r).thenComparingInt(c -> c.c));
        boolean b = check();
        if( !b ) return false;

        for (int i = 0; i < N; i++) {
            // (0, 0) -> (N-1, N-1)
            Cord c = C[i];
            c.r = H - c.r - 1;
            c.c = W - c.c - 1;
        }
        for (int i = 0; i < N/2; i++) {
            Cord t = C[i];
            C[i] = C[N-i-1];
            C[N-i-1] = t;
        }

        return check();
    }

    static boolean check() {
        long UNDEF = Long.MIN_VALUE;
        Map<Integer, Long> base = new HashMap<>();
        long baseDiff = 0;
        long min = Long.MAX_VALUE; // baseの中の最小値

        int idx = 0;
        while(C[idx].r == 0) {
            base.put(C[idx].c, (long)C[idx].a);
            min = Math.min(min, C[idx].a);
            idx++;
        }

        for (int r = 1; r < H; r++) {
            long diff = UNDEF;
            int idx2 = idx;
            while(idx2 < N && C[idx2].r == r) {
                Cord cord = C[idx2];
                if( base.containsKey(cord.c) ) {
                    long d = cord.a - (base.get(cord.c) + baseDiff);
                    if( diff == UNDEF ) {
                        diff = d;
                    } else if( diff != d ) {
                        return false;
                    }
                }
                idx2++;
            }

            if( diff == UNDEF ) {
                // reset
                base.clear();
                baseDiff = 0;
                min = Long.MAX_VALUE;
                while(idx < N && C[idx].r == r) {
                    base.put(C[idx].c, (long)C[idx].a);
                    min = Math.min(min, C[idx].a);
                    idx++;
                }

            } else {
                baseDiff += diff;
                min += diff;
                if( min < 0 ) return false;

                while(idx < N && C[idx].r == r) {
                    base.put(C[idx].c, (long)C[idx].a - baseDiff); // baseに変換して格納
                    min = Math.min(min, C[idx].a); // minは現在値で更新
                    idx++;
                }
            }
        }
        return true;
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

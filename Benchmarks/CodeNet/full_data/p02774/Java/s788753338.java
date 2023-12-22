import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Main {

    static int N;
    static long K;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextLong();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long solve() {
        Arrays.sort(A);

        long LO = 1_000_000_000L * 1_000_000_000L * -1;
        long HI = 1_000_000_000L * 1_000_000_000L;
        return minimizeL(LO, HI, x -> {
            // x以下になるものがK個以上あるか
            long cnt = 0;
            for (int i = 0; i < N; i++) {
                long value = A[i];

                if( value > 0 ) {
                    int j = maximize(A, a -> value * a <= x);
                    // iに対して[0, j]の範囲が達成 -> [i+1, j] の範囲
                    int add = j - i;
                    if( add > 0 ) {
                        cnt += add;
                    }
                } else if( value < 0 ) {
                    // valueが負なので数字が大きいほど達成しやすい
                    int j = minimize(A, a -> value * a <= x);
                    // iに対して [j, N)の範囲が達成 -> [max(i+1, j), N)
                    int add = N - Math.max(i+1, j);
                    // debug(value, add);
                    if( add >= 0 ) {
                        cnt += add;
                    }

                } else {
                    // valueが0なので何をどうしても0
                    if( x >= 0 ) {
                        int add = N-i-1;
                        cnt += add;
                    }
                }
            }
            return cnt >= K;
        });
    }

    static long minimizeL(long lo, long hi, LongPredicate p) {
        while(lo < hi) {
            long x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                hi = x;
            } else {
                lo = x + 1;
            }
        }
        return lo;
    }

    static int maximize(int[] array, IntPredicate p) {
        int lo = 0, hi = array.length;
        while(lo < hi) {
            int mid = ((hi - lo) >>> 1) + lo;
            if( p.test(array[mid]) ) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo - 1;
    }

    static int minimize(int[] array, IntPredicate p) {
        int lo = 0, hi = array.length;
        while(lo < hi) {
            int mid = ((hi - lo) >>> 1) + lo;
            if( p.test(array[mid]) ) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
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

    static int upperBound(int[] array, IntPredicate p) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if ( p.test(array[mid]) ) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

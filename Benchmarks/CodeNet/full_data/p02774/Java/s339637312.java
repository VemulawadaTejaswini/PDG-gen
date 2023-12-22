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
        int p = 0, m = 0, zero = 0;
        for (int i = 0; i < N; i++) {
            if ( A[i] > 0 ) p++;
            else if( A[i] < 0 ) m++;
            else zero++;
        }
        int[] plus = new int[p];
        int[] minus = new int[m];
        int pi = 0, mi = 0;
        for (int i = 0; i < N; i++) {
            if( A[i] > 0 ) {
                plus[pi++] = A[i];
            } else if( A[i] < 0 ) {
                minus[mi++] = A[i];
            }
        }

        long underZero = (long)p * m;
        if( underZero >= K ) return solveUnderZero(p, plus, m, minus);
        if( underZero + countZero(zero) >= K ) return 0;
        return solveOverZero(p, plus, m, minus, underZero + countZero(zero));
    }

    static long LO = 1_000_000_000L * 1_000_000_000L * -1;
    static long HI = 1_000_000_000L * 1_000_000_000L;

    static long solveUnderZero(int P, int[] PLUS, int M, int[] MINUS) {
        // [1, 2, 3]
        // [-3, -2, -1]
        Arrays.sort(PLUS);
        Arrays.sort(MINUS);
        return minimizeL(LO, 0, x -> {
            long cnt = 0;
            // plus * minusが対象
            int pi = 0;
            for (int mi = 0; mi < M; mi++) {
                while( pi < P && (long)PLUS[pi] * MINUS[mi] > x ) {
                    pi++;
                }
                // [pi, P)
                cnt += P-pi;
            }
            return cnt >= K;
        });
    }

    static long solveOverZero(int P, int[] PLUS, int M, int[] MINUS, long MZ) {
        // [3, 2, 1]
        Arrays.sort(PLUS);
        reverse(PLUS);
        Arrays.sort(MINUS);
        for (int i = 0; i < M; i++) {
            MINUS[i] *= -1;
        }

        K = K - MZ;
        return minimizeL(1, HI+1, x -> {
            // debug("x", x);
            long cnt = 0;
            // plus*plus, minus*minusが対象
            int j = P-1;
            for (int i = 0; i < P; i++) {
                while(j >= 0 && i < j && (long)PLUS[i] * PLUS[j] <= x ) {
                    j--;
                }
                // [j+1, P) or [i+1, P)
                cnt += P - Math.max(i+1, j+1);
                // debug(PLUS[i], j, P - Math.max(i+1, j+1));
            }

            j = M-1;
            for (int i = 0; i < M; i++) {
                while(j >= 0 && i < j && (long)MINUS[i] * MINUS[j] <= x ) {
                    j--;
                }
                cnt += M - Math.max(i+1, j+1);
            }

            // debug("cnt", cnt);
            return cnt >= K;
        });
    }

    private static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = t;
        }
    }


    static long countZero(long zero) {
        // N-1 + N-2 + N-3...
        return zero * N - zero * (zero+1) /2;
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

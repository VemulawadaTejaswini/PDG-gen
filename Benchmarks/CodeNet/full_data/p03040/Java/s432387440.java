import java.io.*;
import java.util.*;
import java.util.function.Function;

public class MainF {

    static int N;
    static int[][] Q;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        Q = new int[N][3];

        for (int i = 0; i < N; i++) {
            Q[i][0] = sc.nextInt();
            if( Q[i][0] == 1 ) {
                Q[i][1] = sc.nextInt();
                Q[i][2] = sc.nextInt();
            }
        }

        solve(new PrintWriter(System.out));
    }

    static void solve(PrintWriter pw) {
        int mid = Q[0][1];
        long bs = Q[0][2];
        int cnt = 1;
        long d = 0;

        PriorityQueue<Integer> lo = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> hi = new PriorityQueue<>(Comparator.naturalOrder());
        for (int i = 1; i < N; i++) {
            if( Q[i][0] == 1 ) {
                // debug(bs, d);

                int a = Q[i][1];
                int b = Q[i][2];

                if (cnt % 2 == 1) {
                    if( a < mid ) {
                        lo.add(a);
                        hi.add(mid);
                    } else {
                        lo.add(mid);
                        hi.add(a);
                    }
                    d += Math.abs(a-mid);
                    mid = Integer.MAX_VALUE/2;
                    bs += b;
                    cnt++;

                } else {
                    int m1 = lo.peek();
                    int m2 = hi.peek();

                    if( a < m1 ) {
                        lo.add(a);
                        mid = m1;
                        lo.poll();
                        d += Math.abs(a - m1);

                    } else if( m1 <= a && a < m2 ) {
                        mid = a;

                    } else {
                        hi.add(a);
                        mid = m2;
                        hi.poll();
                        d += Math.abs(a - m2);
                    }
                    bs += b;
                    cnt++;
                }

            } else {
                int m;
                if( cnt % 2 == 1 ) {
                    m = mid;
                } else {
                    m = lo.peek();
                }
                pw.println(m + " " + (bs + d));
            }
        }

        pw.flush();
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

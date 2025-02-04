import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        int[][] dp1 = new int[N][16];
        for (int i = N-2; i >= 0; i--) {
            int d = delta(A[i], A[i+1]);
            for (int j = 0; j <= 15; j++) {
                int j2 = Math.max(j+d, 0);
                if( j2 > 15 ) {
                    dp1[i][j] = j2 + dp1[i+1][15] + (j2 - 15) * (N-i-1);

                } else {
                    dp1[i][j] = j2 + dp1[i+1][j2];
                }
            }
        }
        int[][] dp2 = new int[N][16];
        for (int i = 1; i < N; i++) {
            int d = delta(A[i], A[i-1]);
            for (int j = 0; j <= 15; j++) {
                int j2 = Math.max(j+d, 0);
                if( j2 > 15 ) {
                    dp2[i][j] = j2 + dp2[i-1][15] + (j2 - 15) * i;

                } else {
                    dp2[i][j] = j2 + dp2[i-1][j2];
                }
            }
        }

        int ans = Math.min(dp1[0][0]*2, dp2[N-1][0]*2 + N);
        for (int i = 0; i < N-1; i++) {
            ans = Math.min(dp2[i][0]*2 + (i+1) + dp1[i+1][0]*2, ans);
        }
        return ans;
    }

    // 昇順にするのに必要な数 or 吸収できる数
    // *4 = 1
    static int delta(long a, long b) {
        if( a <= b ) {
            // a = 3, b = 18
            int time = 0;
            while( a * 4 <= b ) {
                time++;
                a *= 4;
            }
            return -time;

        } else {
            int time = 0;
            while( a > b ) {
                b *= 4;
                time++;
            }
            return time;
        }
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

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        // a + b + c = b'
        // なので必ず前後より大きいのでそういうやつから処理していけばよい、はず

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int idx = 0; idx < N; idx++) {
            if( isTarget(idx) ) {
                q.add(idx);
            }
        }

        int cnt = 0;
        while(!q.isEmpty()) {
            int idx = q.poll();
            int b = B[idx];

            // B[idx] = B[idx] + n(B[idx-1] + B[idx+1])
            int idx0 = (idx-1+N)%N;
            int idx2 = (idx+1)%N;
            int b0 = B[idx0];
            int b2 = B[idx2];
            // aより小さくならないところまで引く
            int d = (b-A[idx]) / (b0+b2);
            int b1 = b - d * (b0 + b2);

            B[idx] = b1;
            cnt += d;

            // 前後も対象になった可能性があるので調べる
            if( isTarget(idx) ) {
                q.add(idx);
            }
            if( isTarget(idx0) ) {
                q.add(idx0);
            }
            if( isTarget(idx2) ) {
                q.add(idx2);
            }
        }

        // 最後にcheck
        for (int i = 0; i < N; i++) {
            if( A[i] != B[i] ) return -1;
        }

        return cnt;
    }

    static boolean isTarget(int idx) {
        int b = B[idx];
        int b0 = B[(idx-1+N)%N];
        int b2 = B[(idx+1)%N];

        if( b <= b0 || b <= b2 ) return false;

        int b1 = b - b0 - b2;

        if( b1 < A[idx] ) return false;
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

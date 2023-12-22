import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, X;
    static int[] B, L, U;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();
        B = new int[N];
        L = new int[N];
        U = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
            L[i] = sc.nextInt();
            U[i] = sc.nextInt();
        }

        System.out.println(solve());
    }

    static long solve() {
        long BP = 0;
        long[][] C = new long[N][2];
        for (int i = 0; i < N; i++) {
            C[i][0] = i;
            long lo = (long)B[i] * L[i];
            long hi = (long)(X - B[i]) * U[i];
            C[i][1] = lo + hi;
            BP += lo;
        }
        Arrays.sort(C, Comparator.comparingLong(c -> -c[1]));

        long AP = 0;
        int K = 0; // k個Xにする
        for (int i = 0; i < N; i++) {
            if( BP - (AP + C[i][1]) > 0 ) {
                AP += C[i][1];
                K++;
            } else {
                break;
            }
        }
        debug(AP, BP, K);

        long ans = Long.MAX_VALUE;
        // kに入らなった分
        for (int idx = K; idx < N; idx++) {
            int i = (int)C[idx][0];
            ans = Math.min(ans, calc(K, i, AP, BP));
        }

        // Kに入ってた分
        for (int idx = 0; idx < K; idx++) {
            int i = (int)C[idx][0];
            // 自分のを引いて次点を入れる
            // これだと足りない場合がありそうだが、その場合はこの選択肢が悪いということで
            long ap = AP - C[idx][1] + C[K][1];

            ans = Math.min(ans, calc(K, i, ap, BP));
        }

        return ans;
    }

    static long calc(int K, int i, long AP, long BP) {
        long lo = (long)B[i] * L[i];
        long hi = (long)(X - B[i]) * U[i];
        // debug(i, lo, hi, AP, BP);
        if( BP - (AP + lo) <= 0 ) {
            long loNum = ((BP - AP + L[i] - 1)) / L[i];
            return loNum + X * K;

        } else if( BP - (AP + lo + hi) <= 0 ) {
            long loNum = B[i];
            long hiNum = (BP - (AP + lo) + U[i]-1 ) / U[i];
            return loNum + hiNum + X * K;

        } else {
            return Long.MAX_VALUE;
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

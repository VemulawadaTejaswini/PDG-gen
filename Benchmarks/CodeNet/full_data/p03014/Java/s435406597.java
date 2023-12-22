import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int H, W;
    static char[][] S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        S = new char[H][];
        for (int i = 0; i < H; i++) {
            S[i] = sc.next().toCharArray();
        }

        System.out.println(solve());
    }

    static int solve() {
        int[][] U = new int[H][W];
        int[][] D = new int[H][W];
        for (int w = 0; w < W; w++) {
            for (int h = H-1; h > 0; h--) {
                if( S[h][w] == '.' ) {
                    U[h-1][w] = U[h][w] + 1;
                }
            }

            for (int h = 0; h < H-1; h++) {
                if( S[h][w] == '.' ) {
                    D[h+1][w] = D[h][w] + 1;
                }
            }
        }
        int[][] R = new int[H][W];
        int[][] L = new int[H][W];
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W-1; w++) {
                if( S[h][w] == '.' ) {
                    L[h][w+1] = L[h][w] + 1;
                }
            }

            for (int w = W-1; w > 0; w--) {
                if( S[h][w] == '.' ) {
                    R[h][w-1] = R[h][w] + 1;
                }
            }
        }

        int ans = 0;
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if( S[h][w] == '.' ) {
                    ans = Math.max(ans, U[h][w] + D[h][w] + L[h][w] + R[h][w] + 1);
                }
            }
        }
        return ans;
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

import java.io.*;
import java.util.*;

public class Main {

    static int X, Y, Z;
    static int[][] T;
    static int N;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        Z = sc.nextInt();
        N = X + Y + Z;
        T = new int[N][3];

        for (int i = 0; i < N; i++) {
            T[i][0] = sc.nextInt();
            T[i][1] = sc.nextInt();
            T[i][2] = sc.nextInt();
        }

        System.out.println(solve());
    }

    static long solve() {
        // B-AでソートしてAのほうが嬉しい <-> Bのほうが嬉しい順に並べる
        Arrays.sort(T, Comparator.comparingInt(t -> t[1] - t[0]));

        long total_a = 0;
        PriorityQueue<int[]> as = new PriorityQueue<>(Comparator.comparingInt(t -> t[0] - t[2]));
        for (int i = 0; i < X; i++) {
            as.add(T[i]);
            total_a += T[i][0];
        }
        long[] CA = new long[N];
        CA[X] = total_a;

        long total_c = 0;
        for (int i = X+1; i <= X+Z; i++) {
            int[] at = as.peek();
            int[] t = T[i-1];
            long kaizen = (t[0] - at[0]) + (at[2] - t[2]);
            if( kaizen > 0 ) {
                as.poll();
                as.add(t);

                total_a -= at[0];
                total_a += t[0];
                total_c += at[2];

            } else {
                total_c += t[2];
            }
            CA[i] = total_a + total_c;
        }

        long total_b = 0;
        PriorityQueue<int[]> bs = new PriorityQueue<>(Comparator.comparingInt(t -> t[1] - t[2]));
        for (int i = N-1; i >= X+Z; i--) {
            bs.add(T[i]);
            total_b += T[i][1];
        }
        long[] CB = new long[N];
        CB[X+Z] = total_b;

        total_c = 0;
        for (int i = X+Z-1; i >= X; i--) {
            int[] bt = bs.peek();
            int[] t = T[i];

            long kaizen = (t[1] - bt[1]) + (bt[2] - t[2]);
            if( kaizen > 0 ) {
                bs.poll();
                bs.add(t);

                total_b -= bt[1];
                total_b += t[1];
                total_c += bt[2];

            } else {
                total_c += t[2];
            }
            CB[i] = total_b + total_c;
        }

        long ans = 0;
        for (int i = X; i <= X+Z; i++) {
            ans = Math.max(ans, CA[i] + CB[i]);
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
}

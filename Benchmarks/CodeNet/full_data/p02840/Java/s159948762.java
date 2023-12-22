import java.io.*;
import java.util.*;

public class Main {

    static int N, X, D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();
        D = sc.nextInt();

        System.out.println(solve());
    }

    static int P;

    static long solve() {
        if( D == 0 ) {
            if( X == 0 ) {
                return 1;
            } else {
                return N;
            }
        }

        // Dの二倍ずつ動く
        P = Math.abs(D)*2;

        Map<Integer, List<Range>> RS = new HashMap<>();

        for (int tak = 0; tak <= N; tak++) {
            int aok = N-tak;

            // N個のうち高橋君がtak個取る
            // 最小(の取り方)から最大までDの間隔で並ぶ
            // X * (tak-aok) も考慮する
            long x = (long)(tak-aok) * X;
            long from = (calcTakeMin(tak)-calcTakeMax(aok)) * D + x;
            long to = (calcTakeMax(tak)-calcTakeMin(aok)) * D + x;
            Range r = new Range(Math.min(from, to), Math.max(from, to));

            int d = (int)(r.from % P);
            if( d < 0 ) d += P;
            if( !RS.containsKey(d) ) {
                RS.put(d, new ArrayList<>());
            }
            RS.get(d).add(r);
        }

        long ans = 0;
        for (List<Range> R : RS.values()) {
            ans += count(R);
        }
        return ans;
    }

    static long count(List<Range> R) {
        R.sort(Comparator.comparingLong(r -> r.from));

        long ret = 0;
        Range prev = null;
        for (Range curr : R) {
            if( prev == null ) {
                prev = curr;

            } else {
                if( prev.to < curr.from ) {
                    // [1, 5] [6, 10] のようなケース
                    ret += (prev.to - prev.from)/P + 1;
                    prev = curr;

                } else {
                    // [1, 5] [3, 7] => [1, 7] みたいなケース
                    prev = new Range(prev.from, Math.max(prev.to, curr.to));
                }
            }
        }
        if( prev != null ) {
            ret += (prev.to - prev.from)/P + 1;
        }
        return ret;
    }

    static long calcTakeMin(int n) {
        if( n == 0 ) return 0;
        // (0, N]の中から小さいほうを取った場合の和
        return (long)n * (n-1) / 2;
    }

    static long calcTakeMax(int n) {
        if( n == 0 ) return 0;

        // (0, N]の中から大きいほうを取った場合の和
        return calcTakeMin(N) - calcTakeMin(N-n);
    }

    // [from, to]
    static class Range {
        long from;
        long to;

        public Range(long from, long to) {
            this.from = from;
            this.to = to;
        }

        public String toString() {
            return "[" + from + "," + to + "]";
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, X, Y;
    static int[] x, y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();
        x = sc.nextIntArray(N);
        y = sc.nextIntArray(M);

        System.out.println(solve() ? "War" : "No War");
    }

    static boolean solve() {
        List<Integer> xs = new ArrayList<>();
        for (int i : x) {
            xs.add(i);
        }
        xs.add(X);
        xs.sort(Comparator.naturalOrder());

        List<Integer> ys = new ArrayList<>();
        for (int i : y) {
            ys.add(i);
        }
        ys.add(Y);
        ys.sort(Comparator.naturalOrder());

        return xs.get(xs.size()-1) >= ys.get(0);
    }

    static class Range {

        private long from;
        private long to;

        Range(long from, long to) {
            this.from = from;
            this.to = to;
        }

        boolean contains(long n) {
            return from <= n && n < to;
        }

        boolean intersects(Range r) {
            if( r.from < from ) {
                return r.from < to;

            } else {
                return from < r.to;
            }
        }

        Range intersect(Range r) {
            if( r.from < from ) {
                if( from < r.to ) {
                    return new Range(from, Math.min(to, r.to));
                } else {
                    return null;
                }

            } else {
                if( r.from < to ) {
                    return new Range(r.from, Math.min(to, r.to));
                } else {
                    return null;
                }
            }
        }

        Range mul(int n) {
            return new Range(from * n, to * n);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Range range = (Range) o;
            return from == range.from &&
                    to == range.to;
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }

        public String toString() {
            return "[" + from + "," + to + ")";
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

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int K;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve() );
    }

    private static long solve() {
        return Math.max(xbase(), ybase());
    }

    private static long ybase() {
        Arrays.sort(C, Comparator.comparingInt(c -> c.x));

        long min = Long.MAX_VALUE;
        for (int i = 0; i <= N-K; i++) {

            int ymin = C[i].y;
            int ymax = C[i+K-1].y;

            int xmin = Integer.MAX_VALUE;
            int xmax = Integer.MIN_VALUE;
            for (int j = 0; j < K; j++) {
                xmin = Math.min(C[i+j].x, xmin);
                xmax = Math.max(C[i+j].x, xmax);
            }

            if( ymin == ymax || xmin == xmax ) continue;

            min = Math.min(min, Math.abs((long)xmax-xmin) * Math.abs((long)ymax-ymin));
        }
        return min;
    }

    private static long xbase() {
        Arrays.sort(C, Comparator.comparingInt(c -> c.x));

        long min = Long.MAX_VALUE;
        for (int i = 0; i <= N-K; i++) {

            int xmin = C[i].x;
            int xmax = C[i+K-1].x;

            int ymin = Integer.MAX_VALUE;
            int ymax = Integer.MIN_VALUE;
            for (int j = 0; j < K; j++) {
                ymin = Math.min(C[i+j].y, ymin);
                ymax = Math.max(C[i+j].y, ymax);
            }

            if( ymin == ymax || xmin == xmax ) continue;

            min = Math.min(min, Math.abs((long)xmax-xmin) * Math.abs((long)ymax-ymin));
        }
        return min;
    }

    static class Cord {
        final int x;
        final int y;

        public Cord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

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

        double nextDouble() {
            return Double.parseDouble(next());
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

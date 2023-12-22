import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static long C;
    static Sushi[] S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        C = sc.nextLong();
        S = new Sushi[N];
        for (int i = 0; i < N; i++) {
            S[i] = new Sushi(sc.nextLong(), sc.nextInt());
        }

        System.out.println( solve() );
    }

    private static long solve() {
        Point[] R = new Point[N]; // 時計まわり
        Point[] L = new Point[N];

        long max_R = 0;
        {
            long cal = 0;
            long dist = 0;
            for (int i = 0; i < N; i++) {
                long d = S[i].x - dist;
                long c = S[i].v - d;
                cal += c;
                dist = S[i].x;
                max_R = Math.max(cal, max_R);
                R[i] = new Point(cal, S[i].x, max_R);
            }
        }

        long max_L = 0;
        {
            long cal = 0;
            long dist = 0;
            for (int pi = 0, si = N-1; pi < N; si--, pi++) {
                long d = (C-S[si].x) - dist;
                long c = S[si].v - d;

                cal += c;
                dist = (C - S[si].x);
                max_L = Math.max(cal, max_L);
                L[pi] = new Point(cal, C - S[si].x, max_L);
            }
        }

        long max_LR = 0;
        {
            for (int i = 0; i < N; i++) {
                int last = N-i-1;
                long cal = L[i].cal - L[i].dist + (last > 0 ? R[last-1].max : 0);
                max_LR = Math.max(cal, max_LR);
            }
        }

        long max_RL = 0;
        {
            for (int i = 0; i < N; i++) {
                int last = N-i-1;
                long cal = R[i].cal - R[i].dist + (last > 0 ? L[last-1].max : 0);
                max_RL = Math.max(cal, max_RL);
            }
        }

        return Math.max(Math.max(max_L, max_R), Math.max(max_LR, max_RL));
    }

    static class Point {
        long cal;
        long dist;
        long max;

        public Point(long cal, long dist, long max) {
            this.cal = cal;
            this.dist = dist;
            this.max = max;
        }
    }

    static class Sushi {
        private long x;
        private int v;

        public Sushi(long x, int v) {
            this.x = x;
            this.v = v;
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

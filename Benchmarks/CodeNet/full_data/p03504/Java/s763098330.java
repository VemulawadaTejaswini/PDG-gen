import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int C;
    static Bangumi[] B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        C = sc.nextInt();
        B = new Bangumi[N];
        for (int i = 0; i < N; i++) {
            B[i] = new Bangumi(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve() );
    }

    static class Bangumi {
        int s;
        int t;
        int c;

        public Bangumi(int s, int t, int c) {
            this.s = s;
            this.t = t;
            this.c = c;
        }
    }

    private static int solve() {
        int[] imos = new int[10001];
        for (Bangumi b : B) {
            imos[b.s-1]++;
            imos[b.t]--;
        }
        int max = 0;
        int m = 0;
        for (int i = 0; i < 10001; i++) {
            m += imos[i];
            max = Math.max(m, max);
        }
        return max;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static long[] X;
    static long[] Y;

    static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextLongArray(N);
        Y = sc.nextLongArray(M);

        System.out.println( solve() );
    }

    private static long solve() {
        long x_sum = 0;
        for (int i = 0; i < N-1; i++) {
            int times = pascally(N-1, i+1);
            long x = (X[i+1] - X[i]) * times % MOD;
            x_sum = (x_sum + x) % MOD;
        }
        long y_sum = 0;
        for (int i = 0; i < M-1; i++) {
            int times = pascally(M-1, i+1);
            long y = (Y[i+1] - Y[i]) * times % MOD;
            y_sum = (y_sum + y) % MOD;
        }

        return x_sum * y_sum % MOD;
    }

    static int pascally(int n, int a) {

        int x = n - a + 1;
        int y = n + 1 - x;

        return (int)((long)x * y % MOD);
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


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int A;
    static int B;
    static int C;
    static int X;
    static int Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        System.out.println( solve() );
    }

    static int solve() {
        int ans = Integer.MAX_VALUE;
        for (int ab = 0; ab <= Math.max(X, Y)*2; ab+=2) {
            int buy_ab = ab * C;

            int rx = X - ab/2;
            int buy_a;
            if( rx > 0 ) {
                buy_a = rx * A;
            } else {
                buy_a = 0;
            }

            int ry = Y - ab/2;
            int buy_b = Y - ab/2;
            if( ry > 0 ) {
                buy_b = ry * B;
            } else {
                buy_b = 0;
            }

            ans = Math.min(buy_a + buy_b + buy_ab, ans);
        }
        return ans;
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

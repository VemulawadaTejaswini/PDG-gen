import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        System.out.println( solve() );
    }

    private static String solve() {
        Arrays.sort(A);
        int a = A[N-1];
        if( a % 2 == 0 ) {
            int r =  a/2; // risou
            int g = -1; // genjitsu
            for (int i = 0; i < N-1; i++) {
                if( Math.abs(r - A[i]) < Math.abs(r - g) ) {
                    g = A[i];

                    if( r == g ) {
                        return a + " " + g;
                    }
                }
            }
            return a + " " + g;

        } else {
            int r1 = a/2; // risou 1
            int r2 = r1 + 1; // risou 2

            int g = -1; // genjitsu
            for (int i = 0; i < N-1; i++) {
                if( Math.abs(r1 - A[i]) < Math.abs(r1 - g) || Math.abs(r2 - A[i]) < Math.abs(r2 - g)) {
                    g = A[i];

                    if( r1 == g || r2 == g ) {
                        return a + " " + g;
                    }
                }
            }
            return a + " " + g;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static int MOD = 1_000_000_007;

    static int N;
    static int[] T;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        T = sc.nextIntArray(N);
        A = sc.nextIntArray(N);

        System.out.println( solve() );
    }

    static long solve() {
        boolean[] TB = new boolean[N];
        TB[0] = true;
        for (int i = 1; i < N; i++) {
            if( T[i] > T[i-1] ) {
                TB[i] = true;

            } else if(T[i] == 1) {
                TB[i] = true;

            } else {
                TB[i] = false;
            }
        }

        boolean[] AB = new boolean[N];
        AB[N-1] = true;
        for (int i = N-2; i >= 0 ; i--) {
            if( A[i] > A[i+1] ) {
                AB[i] = true;

            } else if( A[i] == 1 ) {
                AB[i] = true;

            } else {
                AB[i] = false;
            }
        }

        long ans = 1;
        for (int i = 0; i < N; i++) {
            int t = T[i];
            int a = A[i];

            if( TB[i] && AB[i] ) {
                if( t != a ) {
                    return 0;
                }

            } else if( TB[i] ) {
                if( t > a ) {
                    return 0;
                }

            } else if( AB[i] ) {
                if( a > t ) {
                    return 0;
                }

            } else {
                ans = ans * Math.min(t, a) % MOD;
            }
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


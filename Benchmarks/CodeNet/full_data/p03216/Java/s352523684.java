import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static String S;
    static int Q;
    static int[] K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        Q = sc.nextInt();
        K = sc.nextIntArray(Q);

        long[] ans = solve();
        PrintWriter pw = new PrintWriter(System.out);
        for (long i : ans) {
            pw.println(i);
        }
        pw.flush();
    }

    static long[] solve() {
        int[] M = new int[N];
        int[] C = new int[N];
        long[] CM = new long[N];
        for (int i = 0; i < N; i++) {
            if( i != 0 ) {
                M[i] = M[i-1];
                C[i] = C[i-1];
                CM[i] = CM[i-1];
            }

            if( S.charAt(i) == 'M' ) {
                M[i]++;

            } else if ( S.charAt(i) == 'C' ) {
                CM[i] += M[i];
                C[i]++;
            }
        }

        long[] ans = new long[Q];
        for (int i = 0; i < N; i++) {
            if( S.charAt(i) == 'D' ) {
                for (int ki = 0; ki < Q; ki++) {
                    int k = K[ki];
                    int j = Math.min(N-1, i+k-1);
                    ans[ki] += (CM[j] - CM[i]) - (C[j] - C[i]) * (long)M[i];
                }
            }
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

import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] A;
    static int[] B;

    static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(N);

        System.out.println( solve() );
    }

    static long solve() {
        long[] F = new long[N+1];
        long curr = 1;
        F[1] = 1;
        for (int i = 2; i <= N; i++) {
            curr = curr * i % MOD;
            F[i] = curr;
        }

        List<Integer> P = new ArrayList<>();

        Arrays.sort(A);
        Arrays.sort(B);
        int ai = 0;
        int bi = 0;
        int ab = 0;
        int prev = 0;
        while(ai != N && bi != N) {
            int a = A[ai];
            int b = B[bi];

            if( a < b ) {
                ab++;
                ai++;
            } else {
                ab--;
                bi++;
            }

            if( ab == 0 ) {
                P.add(ai - prev);
                prev = ai;
            }
        }
        P.add(N - prev);

        long ans = F[P.get(0)];
        for (int i = 1; i < P.size(); i++) {
            ans = ans * F[P.get(i)] % MOD;
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


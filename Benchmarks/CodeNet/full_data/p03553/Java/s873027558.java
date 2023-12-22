import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int INF = 1_000_000_007;

    static long solve() {
        int[] b2 = {INF, 2, 4, 8, 16, 32, 64};
        int[] b3 = {INF, 3, 9, 27, 81};
        int[] b5 = {INF, 5, 25};
        int[] b7 = {INF, 7, 49};

        int[] p = {11, 13, 17, 19, 21, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        boolean[] isp = new boolean[101];
        for (int pp : p) {
            isp[pp] = true;
        }

        long sump = calcSumP(p);
        long ans = 0;
        for (int i2 : b2) {
            for (int j3 : b3) {
                for (int k5 : b5) {
                    for (int l7 : b7) {
                        int sum = 0;
                        for (int m = 1; m <= N; m++) {
                            if( isp[m] ) continue;

                            if (m % i2 != 0 && m % j3 != 0 && m % k5 != 0 && m % l7 != 0 ) {
                                sum += A[m-1];
                            }
                        }
                        ans = Math.max(sump + sum, ans);
                    }
                }
            }
        }
        return ans;
    }

    static long calcSumP(int[] P) {
        long sum = 0;
        for (int p : P) {
            if( p <= N ) {
                int a = A[p-1];
                if( a > 0 ) {
                    sum += a;
                }
            }
        }
        return sum;
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

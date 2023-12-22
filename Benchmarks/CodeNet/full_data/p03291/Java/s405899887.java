import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();

        System.out.println(solve());
    }

    static int MOD = 1_000_000_007;

    static long solve() {
        int [] A = new int[S.length()];
        int [] B = new int[S.length()];
        int [] C = new int[S.length()];
        int [] Q = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if( i != 0 ) {
                A[i] = A[i-1];
                B[i] = B[i-1];
                C[i] = C[i-1];
                Q[i] = Q[i-1];
            }

            char c = S.charAt(i);
            if( c == 'A' ) {
                A[i]++;
            } else if( c == 'B' ) {
                B[i]++;
            } else if( c == 'C' ) {
                C[i]++;
            } else {
                Q[i]++;
            }
        }

        int maxq = Q[Q.length-1];
        FQ = new int[maxq + 1];
        Arrays.fill(FQ, -1);
        POW3 = new int[maxq + 1];
        POW3[0] = 1;

        for (int i = 1; i <= maxq; i++) {
            fq(i);
            POW3[i] = mul(POW3[i-1], 3);
        }

        long ans = 0;

        // 一般式を出さないで漸化式のメモ化で実装した版
        for (int j = 1; j < S.length()-1; j++) {
            if( S.charAt(j) == 'B' || S.charAt(j) == '?' ) {
                int a = A[j-1];
                int q1 = Q[j-1];
                long prev = f(a, q1);

                int c = C[S.length()-1] - C[j];
                int q2 = Q[S.length()-1] - Q[j];
                long post = f(c, q2);

                ans += prev * post % MOD;
                ans %= MOD;
            }
        }

        return ans;
    }

    static int[] FQ;
    static int[] POW3;

    static int fq(int q) {
        if( FQ[q] != -1 ) return FQ[q];

        int ret;
        if( q == 0 ) {
            ret = 0;
        } else if( q == 1 ) {
            ret = 1;
        } else {
            ret = add(f(1, q-1), mul(2, f(0, q-1)));
        }
        FQ[q] = ret;
        return ret;
    }

    static int f(int a, int q) {
        // (a * 3 ^ q) + fq(q)
        return add(mul(a, pow3(q)), fq(q));
    }

    static int pow3(int n) {
        return POW3[n];
    }

    static int mul(int a, int b) {
        return (int)((long)a * b % MOD);
    }

    static int add(int a, int b) {
        return (int)((long)a + b % MOD);
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

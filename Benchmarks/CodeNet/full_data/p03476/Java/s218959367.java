import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int Q;
    static int[] L;
    static int[] R;
    static int MAX = 100000;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        Q = sc.nextInt();

        L = new int[Q];
        R = new int[Q];
        for (int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        for (int ans : solve()) {
            System.out.println( ans );
        }
    }

    private static int[] solve() {
        boolean[] prime = new boolean[MAX+1];
        Arrays.fill(prime, true);

        int root = (int)Math.sqrt(MAX);
        for (int n = 2; n <= root; n++) {
            if( prime[n] ) {
                int last = MAX / n;
                for (int i = 2; i <= last ; i++) {
                    prime[n*i]=false;
                }
            }
        }
        boolean[] target = new boolean[MAX+1];
        for (int n = 2; n <= MAX; n++) {
            if( !prime[n] ) continue;
            if( (n+1) % 2 != 0 ) continue;
            if( !prime[(n+1)/2] ) continue;
            target[n] = true;
        }

        int[] rui = new int[MAX+1];

        for (int i = 2; i <= MAX; i++) {
            if( target[i] ) {
                rui[i] = rui[i-1] + 1;
            } else {
                rui[i] = rui[i-1];
            }
        }

        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            ans[i] = rui[R[i]] - rui[L[i]-1];
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

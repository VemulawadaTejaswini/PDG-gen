import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int W;
    static Obj[] O;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        O = new Obj[N];
        for (int i = 0; i < N; i++) {
            O[i] = new Obj(sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve() );
    }

    private static long solve() {
        int w1 = O[0].weight;
        for (int i = 0; i < N; i++) {
            O[i].weight -= w1;
        }

        int dp[][] = new int[N+1][N*3 + 1];
        for (int i = 0; i < N + 1; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 0;

        for (int i = 0; i < N; i++) {
            Obj o = O[i];

            for (int n = N; n >= 1; n--) {
                for (int w = n*3; w >= 0; w--) {
                    int prev;
                    if( w - o.weight >= 0 ) {
                        prev = dp[n-1][w - o.weight];
                    } else {
                        prev = -1;
                    }
                    if( prev != -1 ) {
                        dp[n][w] = Math.max(dp[n][w], prev + o.value);
                    }
                }
            }
        }

        int max = 0;
        for (int n = 1; n <= N; n++) {
            for (int w = 0; w <= n*3; w++) {
                int rw = n*w1 + w;
                if( rw > W ) continue;

                max = Math.max(max, dp[n][w]);
            }
        }
        return max;
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int i : array) {
            j.add("" + i);
        }
        System.err.println( j.toString() );
    }

    private static class Obj {
        private int weight; // 0 to 3
        private final int value;

        public Obj(int weight, int value) {
            this.weight = weight;
            this.value = value;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int H, W, K;
    static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        H = fc.nextInt();
        W = fc.nextInt();
        K = fc.nextInt();
        System.out.println(solve());
    }

    static int solve() {
        if( W == 1 ) return 1;

        long[][] dp = new long[H+1][W];
        dp[0][0] = 1;
        // System.out.println( Arrays.toString(dp[0]) );

        for (int h = 1; h <= H; h++) {
            for (int s = 0; s < 1 << (W-1); s++) {
                if( !isValid(s) ) continue;

                for (int w = 0; w < W; w++) {
                    // w = 1 なら b1=0, b2=1
                    int b1 = w-1;
                    int b2 = w;
                    if( (s & 1 << b1) > 0 ) {
                        dp[h][w] = (dp[h-1][w-1] + dp[h][w]) % MOD;

                    } else if( (s & 1 << b2) > 0 ) {
                        dp[h][w] = (dp[h-1][w+1] + dp[h][w]) % MOD;

                    } else {
                        dp[h][w] = (dp[h-1][w] + dp[h][w]) % MOD;
                    }
                }
            }
            // System.out.println( Arrays.toString(dp[h]) );
        }
        return (int)dp[H][K-1];
    }

    static boolean isValid(int s) {
        // 立ってるbitが隣接したらダメ
        return (s & s << 1) == 0;
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

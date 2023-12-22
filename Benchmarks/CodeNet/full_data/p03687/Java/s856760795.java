import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static char[] S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next().toCharArray();
        System.out.println(solve());
    }

    static int solve() {
        boolean[] prev = new boolean[S.length];
        boolean[] dp = new boolean[S.length];

        int min = 100*100;
        ch: for (char a = 'a'; a <= 'z'; a++) {
            Arrays.fill(prev, false);
            for (int i = 0; i < S.length; i++) {
                dp[i] = (a == S[i]);
            }

            boolean isAll = true;
            for (int i = 0; i < S.length; i++) {
                if( !dp[i] ) {
                    isAll = false;
                    break;
                }
            }
            if( isAll ) return 0;

            time: for (int times = 1; times < S.length; times++) {
                boolean[] temp = prev;
                prev = dp;
                dp = temp;
                Arrays.fill(dp, false);

                for (int i = 0; i < S.length - times; i++) {
                    dp[i] = prev[i] | prev[i+1];
                }

                for (int i = 0; i < S.length - times; i++) {
                    if( !dp[i] ) {
                        continue time;
                    }
                }
                min = Math.min(times, min);
                continue ch;
            }
            min = Math.min(S.length-1, min);
        }
        return min;
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

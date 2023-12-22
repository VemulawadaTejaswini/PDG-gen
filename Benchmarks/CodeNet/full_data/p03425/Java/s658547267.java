import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static String[] S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        System.out.println( solve() );
    }

    static long solve() {
        int[] cnt = new int[5];
        for (int i = 0; i < N; i++) {
            String s = S[i];
            switch (s.charAt(0)) {
                case 'M':
                    cnt[0]++;
                    continue;
                case 'A':
                    cnt[1]++;
                    continue;
                case 'R':
                    cnt[2]++;
                    continue;
                case 'C':
                    cnt[3]++;
                    continue;
                case 'H':
                    cnt[4]++;
                    continue;
            }
        }

        return cmb(cnt, 0, 1, 2) + cmb(cnt, 0, 1, 3) + cmb(cnt, 0, 1, 4)
                + cmb(cnt, 0, 2, 3) + cmb(cnt, 0, 2, 4) + cmb(cnt, 0, 3, 4)
                + cmb(cnt, 1, 2, 3) + cmb(cnt, 1, 2, 4) + cmb(cnt, 1, 3, 4)
                + cmb(cnt, 2, 3, 4);
    }

    static long cmb(int[] cnt, int a, int b, int c) {
        return (long)cnt[a] * cnt[b] * cnt[c];
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


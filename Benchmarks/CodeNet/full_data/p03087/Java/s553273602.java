import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        C();
    }

    public static void C() throws Exception {
        FastScanner scanner = new FastScanner( System.in );
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        String S = scanner.next();
        boolean[] S1 = transform(S);
        int[] res = new int[Q];
        for (int i = 0; i < Q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            res[i] = findAC( S1, l, r );
        }
        for (int i : res) System.out.println(i);
    }

    private static boolean[] transform(String s) {
        boolean[] bs = new boolean[s.length()];
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt( i ) == 'A' && s.charAt( i + 1 ) == 'C') {
                bs[i] = true;
                i++;
            }
        }
        return bs;
    }

    private static int findAC(boolean[] s, int l, int r) {
        int count = 0;
        for (int i = l - 1; i < r - 1; i++) {
            if (s[i]) count++;
        }
        return count;
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

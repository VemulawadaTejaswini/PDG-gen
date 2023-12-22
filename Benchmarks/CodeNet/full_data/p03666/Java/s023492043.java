import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int A;
    static int B;
    static int C;
    static int D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println( solve() ? "YES" : "NO" );
    }

    static boolean solve() {
        // GはgoalのG
        int G = Math.abs(A-B);
        int times = N - 1;

        // C*q D*q G という状態まで詰める
        int q = G / D;
        int r = G % D;
        times -= q;

        // 回数切れで届かない
        if( times < 0 ) return false;

        if( times % 2 == 0 ) {
            // +D -Cとすることで D-Cずつ距離を詰めることができる
            return r <= (times / 2) * (D-C);

        } else {
            int C1 = C * (q+1);
            int D1 = D * (q+1);
            times -= 1;

            // C1 <= G <= D1 の場合はそれで終了(0で足踏みすればよい)
            if( C1 <= G && G <= D1 ) return true;

            // G D1 C1 という状態なので D1からGに向かって詰めることができたらOK
            int r1 = D1 - G;
            return r1 <= (times /2) * (D-C);
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


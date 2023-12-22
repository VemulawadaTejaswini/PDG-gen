import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N;
    private static int A[][];

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve());
    }

    static long solve() {

        boolean[][] indirect = new boolean[N][N];

        for (int i = 0; i < N-1 ; i++) {
            for (int j = i+1; j < N ; j++) {
                for (int k = 0; k < N; k++) {
                    if( k == i || k == j ) continue;
                    int ikj = A[i][k] + A[k][j];
                    int ij = A[i][j];
                    if( ikj < ij ) {
                        return -1;
                    } else if( ikj == ij ) {
                        indirect[i][j] = true;
                    }
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < N-1 ; i++) {
            for (int j = i+1; j < N ; j++) {
                if( !indirect[i][j] ) {
                    ans += A[i][j];
                }
            }
        }

        return ans;
    }

    static class FastScanner {

        private final BufferedReader reader;
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
    }
}

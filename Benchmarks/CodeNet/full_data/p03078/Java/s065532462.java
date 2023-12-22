import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        static int X, Y, Z, K;
        static long[] A, B, C;

        void solve(InputReader in, PrintWriter out) {
            X = in.nextInt();
            Y = in.nextInt();
            Z = in.nextInt();
            K = in.nextInt();
            
            A = in.nextLongArray(X);
            B = in.nextLongArray(Y);
            C = in.nextLongArray(Z);

            long[] ab = new long[X*Y];
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    ab[i*Y + j] = A[i] + B[j];
                }
            }
            Arrays.sort(ab);

            long[] ans = new long[Math.max(K, X*Y)*Z];
            for (int i = ab.length - 1; ab.length - i <= Math.min(K, X*Y); --i) {
                for (int j = 0; j < Z; j++) {
                    ans[i*Z + j] = ab[i] + C[j];
                }
            }
            Arrays.sort(ans);

            for (int i = ans.length - 1; ans.length - i <= K; i--) {
                out.println(ans[i]);
            }
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        long[] nextLongArray(int n) {
        	long[] arr = new long[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextLong();
        	}
        	return arr;
        }
    }
}

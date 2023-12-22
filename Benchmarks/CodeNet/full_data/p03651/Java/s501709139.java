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
        int N, K, gcdOfAll;
        int[] A;
        boolean possible = false;

        int gcd(int a, int b) {
            if (a < b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            K = in.nextInt();
            A = in.nextIntArray(N);

            gcdOfAll = A[0];
            for (int a : A) gcdOfAll = gcd(gcdOfAll, a);
            for (int a : A) possible |= a >= K && (a - K) % gcdOfAll == 0;

            out.println(possible ? "POSSIBLE" : "IMPOSSIBLE");
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

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}

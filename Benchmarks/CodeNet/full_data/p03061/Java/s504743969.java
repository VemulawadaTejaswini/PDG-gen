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
            int N = in.nextInt();
            int[] A = in.nextIntArray(N);

            int[] preGcd = new int[N];
            int[] postGcd = new int[N];

            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    preGcd[i] = A[i];
                } else {
                    preGcd[i] = gcd(preGcd[i - 1], A[i]);
                }
            }

            for (int i = N - 1; i >= 0; --i) {
                if (i == N - 1) {
                    postGcd[i] = A[i];
                } else {
                    postGcd[i] = gcd(postGcd[i + 1], A[i]);
                }
            }

            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    ans = Math.max(ans, postGcd[i + 1]);
                } else if (i == N - 1) {
                    ans = Math.max(ans, preGcd[i - 1]);
                } else {
                    ans = Math.max(ans, gcd(preGcd[i - 1], postGcd[i + 1]));
                }
            }
            out.println(ans);
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

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }
    }
}

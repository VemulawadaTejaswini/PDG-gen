import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ColorfulSlimes solver = new ColorfulSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class ColorfulSlimes {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int X = in.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = in.nextInt();

            long B[][] = new long[N][N + 1];

            long sum[] = new long[N];
            for (int k = 0; k <= N - 1; k++) {
                for (int i = 0; i < N; i++) {
                    if (k == 0) {
                        B[k][i] = A[i];
                    } else {
                        B[k][i] = Math.min(B[k - 1][i], A[(N + i - k) % N]);
                    }
                    sum[k] += B[k][i];
                }
            }

            long ans = Long.MAX_VALUE;

            for (int k = 0; k <= N - 1; k++) {
                ans = Math.min(ans, k * X + sum[k]);
            }

            out.println(ans);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

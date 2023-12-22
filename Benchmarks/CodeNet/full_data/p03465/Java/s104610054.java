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
        MedianSum solver = new MedianSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class MedianSum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int[] A = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                sum += A[i];
            }

            int MAX = N * 2000 + 1;
            boolean[][] F = new boolean[N + 1][MAX];

            F[0][0] = true;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < MAX; j++) {
                    for (int k = i; k < N; k++) {
                        if (j + A[k] < MAX) F[k + 1][j + A[k]] |= F[i][j];
                    }
                }
            }

            for (int s = sum / 2; s < MAX; s++) {
                if (F[N][s]) {
                    out.println(s);
                    return;
                }
            }
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


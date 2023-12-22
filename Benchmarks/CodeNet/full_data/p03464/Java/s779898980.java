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
        IceRinkGame solver = new IceRinkGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class IceRinkGame {
        long maxN;
        long minN;
        long[] A;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int K = in.nextInt();
            A = new long[K];
            for (int i = 0; i < K; i++) {
                A[i] = in.nextInt();
            }
            minN = Long.MAX_VALUE;
            maxN = Long.MIN_VALUE;

            if (A[K - 1] != 2) {
                out.println(-1);
                return;
            }

            find(K - 1, A[K - 1]);

            if (minN == Long.MAX_VALUE) {
                out.println(-1);
            } else {
                out.println(minN + " " + maxN);
            }
        }

        private void find(int idx, long N) {
            if (idx == 0) {
                maxN = Math.max(maxN, N + A[idx] - 1);
                minN = Math.min(minN, N);
            } else {
//            long start = N - (N % A[idx - 1]);
                long start = ((N + A[idx - 1] - 1) / A[idx - 1]) * A[idx - 1];
                long end = N + A[idx];
                long minV = Long.MAX_VALUE;
                long maxV = Long.MIN_VALUE;
                for (long nn = start; nn < end; nn += A[idx - 1]) {
                    minV = Math.min(minV, nn);
                    maxV = Math.max(maxV, nn);
                }

                if (minV != Long.MAX_VALUE) {
                    find(idx - 1, minV);
                    if (maxV != minV) find(idx - 1, maxV);
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


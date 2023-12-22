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
        int[] A;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int K = in.nextInt();
            A = new int[K + 1];
            for (int i = 1; i <= K; i++) {
                A[i] = in.nextInt();
            }

            if (A[K] != 2) {
                out.println(-1);
                return;
            }

            long[] L = new long[K + 1];
            long[] R = new long[K + 1];

            L[K] = R[K] = 2;

            for (int k = K; k > 0; k--) {
//            if (divs(L[k], R[k], A[k]) < 1) {
//                out.println(-1);
//                return;
//            }
                long X = ((L[k] + A[k] - 1) / A[k]) * A[k];
                long Y = (R[k] / A[k]) * A[k];
                if (X > Y) {
                    out.println(-1);
                    return;
                }
                L[k - 1] = X;
                R[k - 1] = Y + A[k] - 1;
            }

            out.println(L[0] + " " + R[0]);
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


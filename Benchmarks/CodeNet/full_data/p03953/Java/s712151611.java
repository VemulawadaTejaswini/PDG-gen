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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int X[] = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
            }

            int M = in.nextInt();
            long K = in.nextLong();

            int A[] = new int[M];
            for (int i = 0; i < M; i++) A[i] = in.nextInt() - 1;

            double EXP[][] = new double[N][2];

            for (int i = 0; i < N; i++) {
                EXP[i][0] = X[i];
            }
            int cur = 0;
            int steps = 0;
            int MAX = (int) 1e8;
            for (int i = 1; i <= K && steps <= MAX; i++) {
                cur = i % 2;
                int prev = (i + 1) % 2;
                for (int j = 0; j < N; j++) {
                    EXP[j][cur] = EXP[j][prev];
                    steps++;
                }
                for (int j = 0; j < M; j++) {
                    int rabbit = A[j];
                    double left = EXP[rabbit - 1][cur];
                    double right = EXP[rabbit + 1][cur];

                    double symLeft = sym(EXP[rabbit][cur], left);
                    double symRight = sym(EXP[rabbit][cur], right);

                    EXP[rabbit][cur] = 0.5 * symLeft + 0.5 * symRight;
                    steps++;
                }
            }

            for (int i = 0; i < N; i++) {
                out.println(EXP[i][cur]);
            }

        }

        private double sym(double cur, double next) {
            double diff = Math.abs(cur - next);
            if (cur > next) {
                return next - diff;
            }
            return next + diff;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

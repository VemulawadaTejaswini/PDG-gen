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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[] A;
        int N;
        int Z;
        int W;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            N = in.nextInt();
            Z = in.nextInt();
            W = in.nextInt();
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int ans = Math.abs(A[N - 1] - W);

            out.println(Math.max(ans, find_x(0, W, 0)));
        }

        private int find_x(int idx, int Yi, int tmp) {
            if (idx == N) {
                return tmp;
            }
            int max_diff = Integer.MIN_VALUE;
            int max_idx = -1;
            for (int i = idx; i < N; i++) {
                if (Math.abs(A[i] - Yi) > max_diff) {
                    max_diff = Math.abs(A[i] - Yi);
                    max_idx = i;
                }
            }

            return find_y(max_idx + 1, A[max_idx], max_diff);
        }

        private int find_y(int idx, int Xi, int tmp) {
            if (idx == N) {
                return tmp;
            }

            int min_diff = Integer.MAX_VALUE;
            int min_idx = -1;
            for (int i = idx; i < N; i++) {
                if (Math.abs(A[i] - Xi) < min_diff) {
                    min_diff = Math.abs(A[i] - Xi);
                    min_idx = i;
                }
            }
            return find_x(min_idx + 1, A[min_idx], min_diff);
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


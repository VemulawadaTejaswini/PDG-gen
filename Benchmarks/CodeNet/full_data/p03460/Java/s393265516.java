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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();

            int[] X = new int[N];
            int[] Y = new int[N];
            boolean[] black = new boolean[N];

            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
                Y[i] = in.nextInt();
                black[i] = in.next().charAt(0) == 'B';
            }
            int ans = 0;
            for (int sx = 0; sx <= K; sx++) {
                for (int sy = 0; sy <= K; sy++) {
                    ans = Math.max(ans, check(sx, sy, K, X, Y, black));
                }
            }
            out.println(ans);
        }

        private int check(int sx, int sy, int K, int[] X, int[] Y, boolean[] black) {
            int ans = 0;

            int N = X.length;
            for (int i = 0; i < N; i++) {
                int mx = div(X[i] + sx, K);
                int my = div(Y[i] + sy, K);

                boolean shouldBlack = shouldBlack(mx, my);

                if (shouldBlack == black[i]) ans++;
            }
            return ans;
        }

        private int div(int n, int k) {
            return n / k;
        }

        private boolean shouldBlack(int mx, int my) {
            if (mx % 2 == 0 && my % 2 == 0) {
                return false;
            }

            if (mx % 2 != 0 && my % 2 == 0) {
                return true;
            }

            if (mx % 2 != 0 && my % 2 != 0) {
                return false;
            }

            if (mx % 2 == 0 && my % 2 != 0) {
                return true;
            }

            throw new RuntimeException();
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


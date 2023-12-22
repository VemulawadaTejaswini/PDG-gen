import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int d = in.nextInt();

            int[] y = new int[h * w];
            int[] x = new int[h * w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int tmp = in.nextInt() - 1;
                    y[tmp] = i;
                    x[tmp] = j;
                }
            }

            long[] sum = new long[h * w];
            for (int i = 0; i < d; i++) {
                for (int j = i; j + d < h * w; j++) {
                    sum[j + d] = sum[j] + Math.abs(y[j + d] - y[j]) + Math.abs(x[j + d] - x[j]);
                }
            }

            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;

                out.println(sum[r] - sum[l]);
            }
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}


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
 *
 * @author amotoma3
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
            int n = in.nextInt();

            int[] t = new int[n];
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = in.nextInt();
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            {
                int d = Math.abs(x[0]) + Math.abs(y[0]);
                if (t[0] < d || t[0] % 2 != d % 2) {
                    out.println("No");
                    return;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                int td = t[i + 1] - t[i];
                int d = Math.abs(x[i] - x[i + 1]) + Math.abs(y[i] - y[i + 1]);

                if (td < d || td % 2 != d % 2) {
                    out.println("No");
                    return;
                }
            }

            out.println("Yes");
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


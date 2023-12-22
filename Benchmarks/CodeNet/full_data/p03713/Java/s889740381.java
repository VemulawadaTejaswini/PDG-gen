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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long h = in.nextInt();
            long w = in.nextInt();

            long ans = Integer.MAX_VALUE;

            for (int i = 1; i < w; i++) {
                ans = Math.min(ans, calc(h, w, i));
            }
            for (int i = 1; i < h; i++) {
                ans = Math.min(ans, calc(w, h, i));
            }

            out.println(ans);
        }

        long calc(long h, long w, int x) {
            long a = h * x;

            long b1 = h * ((w - x) / 2);
            long c1 = h * ((w - x) - (w - x) / 2);

            long ans1 = Math.max(a, Math.max(b1, c1)) - Math.min(a, Math.min(b1, c1));

            long b2 = h / 2 * (w - x);
            long c2 = (h - h / 2) * (w - x);

            long ans2 = Math.max(a, Math.max(b2, c2)) - Math.min(a, Math.min(b2, c2));

            return Math.min(ans1, ans2);
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


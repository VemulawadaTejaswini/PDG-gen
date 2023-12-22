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
            int n = in.nextInt();
            long[] a = in.nextLongArray(n);

            long tmp1 = 0;
            long sum1 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += a[i];
                if (i % 2 == 0) {
                    if (sum1 >= 0) {
                        tmp1 += sum1 + 1;
                        sum1 = -1;
                    }
                } else {
                    if (sum1 <= 0) {
                        tmp1 += -sum1 + 1;
                        sum1 = 1;
                    }
                }
            }

            long tmp2 = 0;
            long sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 += a[i];
                if (i % 2 == 1) {
                    if (sum2 >= 0) {
                        tmp2 += sum2 + 1;
                        sum2 = -1;
                    }
                } else {
                    if (sum2 <= 0) {
                        tmp2 += -sum2 + 1;
                        sum2 = 1;
                    }
                }
            }

            out.println(Math.min(tmp1, tmp2));
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

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}


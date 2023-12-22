import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int n = in.nextInt();
            int m = in.nextInt();

            long[][] x = in.nextLongArrayArray(n, 3);

            long ans = 0;
            for (int i = 0; i < 8; i++) {
                long[] a = new long[n];
                for (int j = 0; j < n; j++) {
                    long sum = 0;
                    for (int k = 0; k < 3; k++) {
                        if ((i >> k & 1) == 1) {
                            sum += x[j][k];
                        } else {
                            sum -= x[j][k];
                        }
                    }
                    a[j] = sum;
                }
                Arrays.sort(a);

                long s = 0;
                for (int j = 0; j < m; j++) {
                    s += a[n - 1 - j];
                }

                ans = Math.max(ans, s);
            }

            out.println(ans);
        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
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

        public long[][] nextLongArrayArray(int n, int m) {
            long[][] res = new long[n][m];
            for (int i = 0; i < n; i++) {
                res[i] = nextLongArray(m);
            }
            return res;
        }

    }
}


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
        long[] allSize;
        long[] pSize;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();

            allSize = new long[n + 1];
            pSize = new long[n + 1];
            allSize[0] = 1;
            pSize[0] = 1;
            for (int i = 0; i < n; i++) {
                allSize[i + 1] = 3 + 2 * allSize[i];
                pSize[i + 1] = 1 + 2 * pSize[i];
            }

            out.println(calc(n, x));
        }

        long calc(int n, long length) {
            if (length == 0) return 0;

            if (n == 0) return 1;

            if (length <= allSize[n - 1] + 1) {
                return calc(n - 1, length - 1);
            }

            if (length < allSize[n]) {
                return calc(n - 1, length - 2 - allSize[n - 1]) + 1 + pSize[n - 1];
            }

            return pSize[n];
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

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

    }
}


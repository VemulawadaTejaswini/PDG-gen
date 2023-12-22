import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long[] a = in.nextLongArray(3);
            long k = in.nextLong();

            if (a[0] == a[1]) {
                out.println(0);
                return;
            }

            if (a[0] == a[2] || a[1] == a[2]) {
                out.println(k % 2 == 0 ? a[0] - a[1] : a[1] - a[0]);
                return;
            }

            if (k > 70) {
                out.println("Unfair");
                return;
            }

            BigInteger[] B = new BigInteger[3];
            B[0] = BigInteger.valueOf(a[0]);
            B[1] = BigInteger.valueOf(a[1]);
            B[2] = BigInteger.valueOf(a[2]);

            for (int i = 0; i < k; i++) {
                BigInteger[] newB = new BigInteger[3];

                newB[0] = B[1].add(B[2]);
                newB[1] = B[2].add(B[0]);
                newB[2] = B[0].add(B[1]);

                B[0] = newB[0];
                B[1] = newB[1];
                B[2] = newB[2];
            }

            BigInteger d = B[0].subtract(B[1]);

            if (d.compareTo(BigInteger.valueOf(1_000_000_000_000_000_000L)) > 0) {
                out.println("Unfair");
                return;
            }

            out.println(d.toString());
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


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            double v[] = new double[n];
            HashMap<Double, Integer> count = new HashMap<>();
            for (int i = 0; i < n; i++) {
                v[i] = in.nextDouble();
                count.put(v[i], count.getOrDefault(v[i], 0) + 1);
            }

            Arrays.sort(v);
            double mean = 0;
            for (int i = n - 1; i >= n - a; i--)
                mean += v[i];
            mean /= a;
            out.println(mean);

            int r = 0;
            for (int i = n - b; i <= n - a; i++) {
                if (v[i] != v[n - b])
                    break;
                r++;
            }
            long sum = 0;
            if (v[n - a] != v[n - 1]) {
                sum = 1;
                for (int cn = 1; cn <= r; cn++) {
                    sum *= count.get(v[n - a]) - cn + 1;
                    sum /= cn;
                }
            } else {
                for (int cr = 1; cr <= r; cr++) {
                    long d = 1;
                    for (int cn = 1; cn < cr; cn++) {
                        d *= count.get(v[n - a]) - cn + 1;
                        d /= cn;
                    }
                    sum += d;
                }
            }
            out.println(sum);
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isPrintableChar(int c) {
            return c >= 33 && c <= 126;
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();

            int b = readByte();
            while (!isPrintableChar(b))
                b = readByte();

            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }

            return sb.toString();
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}


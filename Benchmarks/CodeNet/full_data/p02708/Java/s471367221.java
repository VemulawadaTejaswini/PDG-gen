import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSumOfLargeNumbers solver = new DSumOfLargeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfLargeNumbers {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.readLong();
            long k = in.readLong();
            int m = (int) 1e9 + 7;

            long sum = 0;

            // n given .. n+ 1 asked
            // fix
            // AP
            for (long i = k; i < n + 2; i++) {
                long max = (2 * n - i + 1) * i / 2;
                long min = (i - 1) * i / 2;

                sum += max - min + 1;
                sum = (sum + m) % m;
            }

            System.out.println(sum);

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}


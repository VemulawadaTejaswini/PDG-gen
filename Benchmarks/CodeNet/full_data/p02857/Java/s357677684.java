import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EMajorityOfBalls solver = new EMajorityOfBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMajorityOfBalls {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int z = 105;

            int n = s.nextInt();
            int total = 2 * n * z;
            int[] a = new int[2 * n];
            for (int i = 0; i < 2 * n; i++)
                a[i] = z;
            long[] val = new long[2 * n];
            Random r = new Random();
            for (int i = 0; i < 2 * z; i++) {
                int[] chosen = new int[2 * n];
                for (int j = 0; j < n; j++) {
                    int x = r.nextInt(total);
                    int sum = 0;
                    int idx = -1;
                    for (int k = 0; k < 2 * n; k++) {
                        if (sum + a[k] > x) {
                            idx = k;
                            break;
                        }
                        sum += a[k];
                    }
                    if (chosen[idx] == 1)
                        j--;
                    else {
                        chosen[idx] = 1;
                        a[idx]--;
                        total--;
                    }
                }
                w.print("? ");
                for (int j = 0; j < 2 * n; j++)
                    if (chosen[j] == 1)
                        w.print(j + 1 + " ");
                w.println();
                w.flush();
                if (s.next().equals("Red")) {
                    for (int j = 0; j < 2 * n; j++) {
                        if (chosen[j] == 1) {
                            val[j] += n / 2 + 1;
                        }
                    }
                } else {
                    for (int j = 0; j < 2 * n; j++) {
                        if (chosen[j] == 1) {
                            val[j] += n / 2;
                        }
                    }
                }
            }
            for (int i = 0; i < 2 * n; i++)
                w.print(val[i] + " ");
            w.println();
            w.print("! ");
            for (int i = 0; i < 2 * n; i++) {
                if (2 * val[i] > z * n)
                    w.print("R");
                else
                    w.print("B");
            }
            w.println();
            w.flush();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


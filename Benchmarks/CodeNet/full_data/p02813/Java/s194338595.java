import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CCountOrder solver = new CCountOrder();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCountOrder {
        boolean nextPermutation(int[] a, int[] b) {
            boolean check = true;
            for (int i = 0; i < a.length; i++)
                if (a[i] != b[i])
                    check = false;
            if (check)
                return false;
            int p = -1;

            for (int i = a.length - 2; i >= 0; i--) {

                if (a[i] < a[i + 1]) {
                    p = i;
                    break;
                }
            }

            if (p == -1)
                return false;

            int q = -1;

            for (int i = a.length - 1; i > p; i--) {

                if (a[i] > a[p]) {
                    q = i;
                    break;
                }
            }

            int temp = a[p];
            a[p] = a[q];
            a[q] = temp;

            for (int i = 0; i < (a.length - (p + 1)) / 2; i++) {
                temp = a[p + 1 + i];
                a[p + 1 + i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }

            return true;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = s.nextInt();
            int[] q = new int[n];
            for (int i = 0; i < n; i++)
                q[i] = s.nextInt();
            int g = 0;
            for (int i = 0; i < n; i++) {
                if (p[i] > q[i]) {
                    g = 1;
                    break;
                }
                if (p[i] < q[i])
                    break;
            }
            if (g == 1) {
                int[] temp = new int[n];
                for (int i = 0; i < n; i++)
                    temp[i] = p[i];
                for (int i = 0; i < n; i++)
                    p[i] = q[i];
                for (int i = 0; i < n; i++)
                    q[i] = temp[i];
            }
            int res = 0;
            while (nextPermutation(p, q)) {
                res++;
            }
            w.println(res);
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


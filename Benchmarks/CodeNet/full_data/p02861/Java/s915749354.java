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
 * @author Aman Kumar Singh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CAverageLength solver = new CAverageLength();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAverageLength {
        PrintWriter out;
        InputReader in;
        double[][] points;
        double sum = 0;
        double cnt = 0;

        double dis(int i, int j) {
            double dist = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]);
            dist += (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
            return Math.sqrt(dist);
        }

        void heapPermutation(int a[], int size, int n) {
            if (size == 1) {
                for (int i = 1; i < n; i++)
                    sum += dis(a[i - 1], a[i]);
                cnt++;
            }
            for (int i = 0; i < size; i++) {
                heapPermutation(a, size - 1, n);
                if (size % 2 == 1) {
                    int temp = a[0];
                    a[0] = a[size - 1];
                    a[size - 1] = temp;
                } else {
                    int temp = a[i];
                    a[i] = a[size - 1];
                    a[size - 1] = temp;
                }
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            points = new double[n][2];
            int[] a = new int[n];
            int i = 0;
            for (i = 0; i < n; i++) {
                points[i][0] = nd();
                points[i][1] = nd();
                a[i] = i;
            }
            heapPermutation(a, n, n);
            pn(sum / cnt);
        }

        int ni() {
            return in.nextInt();
        }

        double nd() {
            return in.nextDouble();
        }

        void pn(Object o) {
            out.println(o);
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
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, nextInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10, nextInt());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}


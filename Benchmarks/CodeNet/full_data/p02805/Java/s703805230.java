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
        FEncloseAll solver = new FEncloseAll();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEncloseAll {
        boolean collinear(int x1, int y1, int x2, int y2, int x3, int y3) {
            int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
            if (area == 0)
                return true;
            return false;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = s.nextInt();
                y[i] = s.nextInt();
            }
            double ans = 2000;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    double a = (x[i] + x[j]) / 2.0;
                    double b = (y[i] + y[j]) / 2.0;
                    double max = 0;
                    for (int k = 0; k < n; k++) {
                        max = Math.max((a - x[k]) * (a - x[k]) + (b - y[k]) * (b - y[k]), max);
                    }
                    ans = Math.min(Math.sqrt(max), ans);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (collinear(x[i], y[i], x[j], y[j], x[k], y[k]))
                            continue;
                        double A = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
                        double B = Math.sqrt((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]));
                        double C = Math.sqrt((x[k] - x[i]) * (x[k] - x[i]) + (y[k] - y[i]) * (y[k] - y[i]));
                        double a = Math.acos((B * B + C * C - A * A) / (2 * B * C));
                        double b = Math.acos((C * C + A * A - B * B) / (2 * C * A));
                        double c = Math.acos((A * A + B * B - C * C) / (2 * A * B));
                        double X = (x[i] * Math.sin(2 * a) + x[j] * Math.sin(2 * b) + x[k] * Math.sin(2 * c)) / (Math.sin(2 * a) + Math.sin(2 * b) + Math.sin(2 * c));
                        double Y = (y[i] * Math.sin(2 * a) + y[j] * Math.sin(2 * b) + y[k] * Math.sin(2 * c)) / (Math.sin(2 * a) + Math.sin(2 * b) + Math.sin(2 * c));
                        double radius = 0;
                        for (int l = 0; l < n; l++) {
                            radius = Math.max((X - x[l]) * (X - x[l]) + (Y - y[l]) * (Y - y[l]), radius);
                        }
                        ans = Math.min(Math.sqrt(radius), ans);
                    }
                }
            }
            w.println(ans);
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


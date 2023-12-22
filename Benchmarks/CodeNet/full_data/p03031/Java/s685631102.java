import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSwitches solver = new CSwitches();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSwitches {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int m = s.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < (1 << n); i++) {
                String str = Integer.toBinaryString(i);
                while (str.length() != n) {
                    str = "0" + str;
                }
                list.add(str);
            }

            int[][] arr = new int[m][];
            for (int i = 0; i < m; i++) {
                int size = s.nextInt();
                arr[i] = new int[size];
                for (int j = 0; j < size; j++) {
                    arr[i][j] = s.nextInt() - 1;
                }
            }

            int[] p = s.nextIntArray(m);
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                boolean ok = true;
                for (int j = 0; j < m; j++) {
                    int[] lighted = arr[j];
                    int count1 = 0;
                    for (int k = 0; k < lighted.length; k++) {
                        if (str.charAt(lighted[k]) == '1') {
                            count1++;
                        }
                    }

                    if (count1 % 2 != p[j]) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    count++;
                }

            }
            out.println(count);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


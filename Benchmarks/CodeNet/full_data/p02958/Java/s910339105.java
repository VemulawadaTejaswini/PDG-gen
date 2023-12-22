import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        B0Or1Swap solver = new B0Or1Swap();
        solver.solve(1, in, out);
        out.close();
    }

    static class B0Or1Swap {
        PrintWriter out;
        InputReader in;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            int[] ar1 = new int[n];
            int[] ar2 = new int[n];
            int i = 0, j = 0, k = 0;
            for (i = 0; i < n; i++) {
                ar1[i] = ni();
                ar2[i] = ar1[i];
            }
            Arrays.sort(ar2);
            boolean ok = true;
            for (i = 0; i < n; i++) {
                if (ar1[i] != ar2[i])
                    ok = false;
            }
            boolean done = false;
            for (i = 0; i < n; i++) {
                for (j = i + 1; j < n; j++) {
                    int t = ar1[i];
                    ar1[i] = ar1[j];
                    ar1[j] = t;
                    boolean haha = true;
                    for (k = 0; k < n; k++) {
                        if (ar1[k] != ar2[k])
                            haha = false;
                    }
                    t = ar1[i];
                    ar1[i] = ar1[j];
                    ar1[j] = t;
                    if (haha) {
                        done = true;
                        break;
                    }
                }
                if (done)
                    break;
            }
            if (done || ok) {
                pn("YES");
            } else {
                pn("NO");
            }

        }

        int ni() {
            return in.nextInt();
        }

        void pn(String zx) {
            out.println(zx);
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

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}


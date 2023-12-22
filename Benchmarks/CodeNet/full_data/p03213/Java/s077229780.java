import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        D756 solver = new D756();
        solver.solve(1, in, out);
        out.close();
    }

    static class D756 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            Map<Long, Integer> m = new HashMap<>();

            int n = in.nextInt();

            for (int i = 1; i <= n; i++) {
                Map<Long, Integer> cm = primeFactors(i);

                for (long key : cm.keySet()) {
                    m.merge(key, cm.get(key), (x, y) -> x + y);
                }
            }

            List<Integer> l = new ArrayList<>();
            for (long key : m.keySet()) {
                l.add(m.get(key));
            }

            int ans = 0;
            for (int i = 0; i < l.size(); i++) {
                for (int j = i + 1; j < l.size(); j++) {
                    for (int k = 0; k < l.size(); k++) {
                        if (k != i && k != j && l.get(i) >= 4 && l.get(j) >= 4 && l.get(k) >= 2) {
                            ans++;
                        }
                    }
                }
            }

            for (int i = 0; i < l.size(); i++) {
                for (int j = 0; j < l.size(); j++) {
                    if (i != j && l.get(i) >= 24 && l.get(j) >= 2) {
                        ans++;
                    }
                }
            }

            for (int i = 0; i < l.size(); i++) {
                for (int j = 0; j < l.size(); j++) {
                    if (i != j && l.get(i) >= 14 && l.get(j) >= 4) {
                        ans++;
                    }
                }
            }

            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) >= 74) {
                    ans++;
                }
            }

            out.println(ans);
        }

        HashMap<Long, Integer> primeFactors(long n) {
            HashMap<Long, Integer> cm = new HashMap<>();

            long cn = n;
            for (long i = 2; i * i <= cn; i++) {
                if (cn % i == 0) {
                    while (cn % i == 0) {
                        cn /= i;
                        cm.merge(i, 1, (x, y) -> x + y);
                    }
                }
            }

            if (cn > 1) {
                cm.merge(cn, 1, (x, y) -> x + y);
            }

            return cm;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


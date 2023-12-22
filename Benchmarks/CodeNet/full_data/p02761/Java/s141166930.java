import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
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
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGuessTheNumber solver = new CGuessTheNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGuessTheNumber {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int m = s.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            boolean ok = true;
            int[] ans = new int[n];
            for (int i = 0; i < m; i++) {
                int a = s.nextInt();
                int b = s.nextInt();
                if (map.containsKey(a) && map.get(a) != b) {
                    ok = false;
                    break;
                }

                map.put(a, b);
            }

            if (!ok) {
                out.println(-1);
                return;
            }

            int ans1 = -1;

            for (int i = 0; i < 1000; i++) {

                String str = i + "";
                if (str.length() < n) {
                    continue;
                }
                Iterator<Integer> iter = map.keySet().iterator();
                boolean ok1 = true;
                while (iter.hasNext()) {
                    int curr = iter.next();
                    int b = map.get(curr);
                    if (Integer.parseInt(str.charAt(curr - 1) + "") == b) {
                        continue;
                    } else {
                        ok1 = false;
                        break;
                    }
                }

                if (ok1) {
                    ok = true;
                    ans1 = i;
                    break;
                }
            }

            out.println(ans1);
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


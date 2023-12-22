import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            char[] s = in.readString().toCharArray();
            C.Item[] a = new C.Item[1 << n];
            C.Item[] b = new C.Item[1 << n];
            for (int mask = 0; mask < (1 << n); mask++) {
                StringBuilder red = new StringBuilder();
                StringBuilder blue = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        red.append(s[i]);
                    } else {
                        blue.append(s[i]);
                    }
                }
                a[mask] = new C.Item(red.toString(), blue.toString());
            }
            for (int mask = 0; mask < (1 << n); mask++) {
                StringBuilder red = new StringBuilder();
                StringBuilder blue = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        red.append(s[s.length - i - 1]);
                    } else {
                        blue.append(s[s.length - i - 1]);
                    }
                }
                b[mask] = new C.Item(blue.toString(), red.toString());
            }
            long ans = 0;
            Map<C.Item, Integer> mp1 = toCntMap(a);
            Map<C.Item, Integer> mp2 = toCntMap(b);
            for (Map.Entry<C.Item, Integer> e1 : mp1.entrySet()) {
                C.Item key = e1.getKey();
                Integer v2 = mp2.get(key);
                if (v2 != null) {
                    int v1 = e1.getValue();
                    ans += (long) v1 * v2;
                }
            }
            out.printLine(ans);
        }

        private Map<C.Item, Integer> toCntMap(C.Item[] a) {
            Map<C.Item, Integer> mp = new HashMap<>();
            for (C.Item item : a) {
                int cur = mp.getOrDefault(item, 0);
                mp.put(item, cur + 1);
            }
            return mp;
        }

        private static class Item {
            String red;
            String blue;

            Item(String red, String blue) {
                this.red = red;
                this.blue = blue;
            }


            public String toString() {
                return "('" + red + "', '" + blue + "')";
            }


            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                C.Item item = (C.Item) o;

                if (!red.equals(item.red)) return false;
                return blue.equals(item.blue);

            }


            public int hashCode() {
                int result = red.hashCode();
                result = 31 * result + blue.hashCode();
                return result;
            }

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

        public int readInt() {
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

        public String readString() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

        public void printLine(long i) {
            writer.println(i);
        }

    }
}


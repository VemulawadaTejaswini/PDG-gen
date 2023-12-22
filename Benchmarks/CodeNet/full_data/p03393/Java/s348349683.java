import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        AC_GC_22_A solver = new AC_GC_22_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class AC_GC_22_A {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.next();

            int[] h = new int[26];

            int n = s.length();
            for (int i = 0; i < n; i++) {
                h[s.charAt(i) - 'a']++;
            }

            if (n == 26) {
                List<String> ss = new ArrayList<>();
                int[] ch = new int[26];
                for (int i = 0; i < n; i++) {
                    char c = s.charAt(i);

                    for (int j = c - 'a' + 1; j < 26; j++) {
                        if (ch[j] == 0) {
                            String cs = s.substring(0, i);
                            String ncs = new String(cs);
                            ncs += (char) (j + 'a');
                            ss.add(ncs);
                            break;
                        }
                    }
                    ch[c - 'a']++;
                }

                if (ss.isEmpty()) {
                    out.println(-1);
                } else {
                    ss.sort((s1, s2) -> s1.compareTo(s2));
                    out.println(ss.get(0));
                }
                return;
            }

            for (int i = 0; i < 26; i++) {
                if (h[i] == 0) {
                    s += (char) (i + 'a');
                    break;
                }
            }

            out.println(s);
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

        public String next() {
            return nextString();
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}


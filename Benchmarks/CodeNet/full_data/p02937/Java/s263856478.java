import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EStringsOfImpurity solver = new EStringsOfImpurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class EStringsOfImpurity {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.nextString();
            String t = in.nextString();

            ArrayList<ArrayList<Integer>> indexes = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                indexes.add(new ArrayList<>());
            }
            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';
                indexes.get(idx).add(i);
            }
            long ret = s.length();
            int prevIdx = -1;
            for (int i = 0; i < t.length(); i++) {
                int idx = t.charAt(i) - 'a';
                if (indexes.get(idx).size() == 0) {
                    out.println(-1);
                    return;
                }
                if (prevIdx == -1) {
                    prevIdx = indexes.get(idx).get(0);
                } else {
                    ArrayList<Integer> a = indexes.get(idx);
                    int left = -1;
                    int right = a.size();
                    while (left + 1 < right) {
                        int mid = (left + right) / 2;
                        if (a.get(mid) > prevIdx) {
                            right = mid;
                        } else {
                            left = mid;
                        }
                    }
                    if (right == a.size()) {
                        prevIdx = a.get(0);
                        ret += s.length();
                    } else {
                        prevIdx = a.get(right);
                    }
                }
            }
            ret -= s.length() - prevIdx - 1;

            out.println(ret);
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

        public void println(long i) {
            writer.println(i);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


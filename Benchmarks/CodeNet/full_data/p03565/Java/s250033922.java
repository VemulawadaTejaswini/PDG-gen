import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static final String UNRESTORABLE = "UNRESTORABLE";

        public static boolean contains(String str, String ter) {
            boolean flag = true;
            for (int i = 0; i < ter.length() && flag; i++) {
                flag &= str.charAt(i) == '?' || str.charAt(i) == ter.charAt(i);
            }
            return flag;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {

            String str = in.next();
            String ter = in.next();
            boolean flag = false;
            if (ter.length() > str.length()) {
                out.println(UNRESTORABLE);
            } else if (ter.length() == str.length()) {
                if (contains(str, ter)) {
                    out.println(ter);
                } else {
                    out.println(UNRESTORABLE);
                }
            } else {
                String front, sub;
                front = str.substring(0, str.length() - ter.length());
                sub = str.substring(str.length() - ter.length());
                flag = contains(str, ter);
                if (flag) {
                    str = front.replaceAll("\\?", "a") + ter;
                }
                for (int i = str.length(); i >= ter.length() && !flag; i--) {

                    front = str.substring(0, i - ter.length());
                    /**
                     * sub 从后往前找子串;
                     */
                    sub = str.substring(i - ter.length(), i);
                    /**
                     * 前半部分 ;
                     */
                    String substring = str.substring(i);
                    flag = contains(sub, ter);
                    if (flag) {
                        str = front.replaceAll("\\?", "a") + ter + substring.replace("\\?", "a");
                        break;
                    }
                }
                if (flag) {
                    out.println(str);
                } else {
                    out.println(UNRESTORABLE);
                }
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

    }
}


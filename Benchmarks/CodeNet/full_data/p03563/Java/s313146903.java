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
        dusbious solver = new dusbious();
        solver.solve(1, in, out);
        out.close();
    }

    static class dusbious {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.readLine();
            String t = in.readLine();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < s.length(); i++) {
                int ind = t.indexOf(s.charAt(i));
                if (ind != -1) {
                    int k = 0, flag = 0;
                    if (i - ind >= 0) {
                        for (int j = i - ind; j < t.length(); j++) {
                            if (j > s.length() - 1) {
                                flag = 1;
                                break;
                            }
                            if (s.charAt(j) != '?' && s.charAt(j) != t.charAt(k)) {
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0) {
                            sb.replace(i - ind, i - ind + t.length(), t);
                        }
                    }
                }
            }
            String ans = sb.toString();
            if (ans.equals(s)) {
                out.println("UNRESTORABLE");
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                if (ans.charAt(i) == '?') {
                    out.print('a');
                } else {
                    out.print(ans.charAt(i));
                }
            }
            out.println();
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

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
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

        public void println() {
            writer.println();
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void print(char i) {
            writer.print(i);
        }

        public void close() {
            writer.close();
        }

    }
}


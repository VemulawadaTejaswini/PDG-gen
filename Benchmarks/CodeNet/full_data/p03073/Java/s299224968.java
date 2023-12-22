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
 * @author Vishal Burman
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CColoringColorfully solver = new CColoringColorfully();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColoringColorfully {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String str = in.readLine();
            int a[] = new int[str.length()];
            int b[] = new int[str.length()];
            int init = 0;
            for (int i = 0; i < a.length; i++) {
                if (init == 0) {
                    a[i] = init;
                    b[i] = 1;
                    init = 1;
                } else {
                    a[i] = init;
                    b[i] = 0;
                    init = 0;
                }
            }
            int count_1 = 0;
            int count_2 = 0;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.toString(str.charAt(i)).equals(Integer.toString(a[i]))) {
                    count_1++;
                }
                if (!Character.toString(str.charAt(i)).equals(Integer.toString(b[i]))) {
                    count_2++;
                }
            }
            out.println(Math.min(count_1, count_2));
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
}


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
 * @author Sanket Makani
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader sc, PrintWriter w) {

            String str = sc.next();
            String t = sc.next();

            int n = str.length();
            int len = t.length();
            String answer = "";
            for (int i = 0; i <= n; i++)
                answer += "z";

            char c[] = str.toCharArray();
            char t1[] = t.toCharArray();

            for (int i = 0; i <= n - len; i++) {
                if (valid(c, t1, i)) {
                    char ans[] = new char[n];

                    for (int j = 0; j < n; j++) {
                        if (c[j] != '?')
                            ans[j] = c[j];
                        else
                            ans[j] = 'a';
                    }

                    for (int j = 0; j < len; j++)
                        ans[i + j] = t1[j];

                    String tempStr = new String(ans);

                    if (answer.compareTo(tempStr) > 0)
                        answer = tempStr;
                }
            }

            if (answer.length() > n)
                w.println("UNRESTORABLE");
            else
                w.println(answer);
        }

        private boolean valid(char[] c, char[] t1, int i) {

            int temp = t1.length;

            for (int j = 0; j < temp; j++) {
                if (c[i + j] != '?') {
                    if (c[i + j] != t1[j])
                        return false;
                }
            }
            return true;
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
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


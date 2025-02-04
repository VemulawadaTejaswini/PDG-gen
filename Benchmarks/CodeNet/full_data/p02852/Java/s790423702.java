import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Deque;
import java.util.ArrayDeque;
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
        FSugoroku solver = new FSugoroku();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSugoroku {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int m = s.nextInt();
            String str = s.nextString();
            char[] inputS = str.toCharArray(); // len n+1
            boolean[] s1 = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                s1[i] = inputS[i] == '1';
            }

            Deque<Integer> answer = new ArrayDeque<>();

            int cur = n;
            int last = Integer.MAX_VALUE;
            outer:
            while (cur > 0) {
                for (int i = Math.max(0, cur - m); i < cur && i < last - m; i++) {
                    if (!s1[i]) {
                        answer.addFirst(cur - i);
                        last = cur;
                        cur = i;
                        continue outer;
                    }
                }
                out.println(-1);
                return;
            }

            out.println(FSugoroku.arrayLists.print(answer));
        }

        private static class arrayLists {
            static StringBuilder print(Deque<Integer> list) {
                StringBuilder ans = new StringBuilder();
                for (Integer curr : list) {
                    ans.append(curr.toString() + " ");
                }
                return ans;
            }

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


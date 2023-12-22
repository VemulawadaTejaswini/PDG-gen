// package agc.agc022;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] c = in.nextToken().toCharArray();

        out.println(solve(c));
        out.flush();
    }

    static String solve(char[] c) {
        boolean[] used = new boolean[26];
        for (char ci : c) {
            used[ci-'a'] = true;
        }

        for (int i = 0; i < 26 ; i++) {
            if (!used[i]) {
                return String.valueOf(c) + (char)('a' + i);
            }
        }

        List<String> candidates = new ArrayList<>();

        Arrays.fill(used, false);
        for (int i = 0; i < 26 ; i++) {
            char[] next = c.clone();
            int a = c[i]-'a';
            boolean found = false;
            for (int j = a+1 ; j < 26 ; j++) {
                if (!used[j]) {
                    next[i] = (char)('a' + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                candidates.add(String.valueOf(next).substring(0, i+1));
            }
            used[a] = true;
        }
        if (candidates.size() == 0) {
            return "-1";
        }

        Collections.sort(candidates);
        return candidates.get(0);
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}
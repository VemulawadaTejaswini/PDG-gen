import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DMazeMaster solver = new DMazeMaster();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMazeMaster {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int h = c.readInt(), ww = c.readInt();
            int dx[] = {1, -1, 0, 0};
            int dy[] = {0, 0, 1, -1};

            char mat[][] = new char[h][];
            for (int i = 0; i < h; i++) {
                mat[i] = c.readString().toCharArray();
            }

            LinkedList<ip> q = new LinkedList<>();
            boolean vis[][];
            int res = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < ww; j++) {
                    if (mat[i][j] == '#') {
                        continue;
                    }
                    vis = new boolean[h][ww];
                    q.add(new ip(i, j, 0));
                    vis[i][j] = true;
                    int max = 0;
                    while (!q.isEmpty()) {
                        ip p = q.pollFirst();
                        for (int k = 0; k < 4; k++) {
                            int x = p.first + dx[k], y = p.second + dy[k];
                            max = Math.max(max, p.step);
                            if (check_(h, ww, p.first + dx[k], p.second + dy[k]) &&
                                    mat[p.first + dx[k]][p.second + dy[k]] == '.' && !vis[x][y]) {
                                vis[x][y] = true;
                                q.add(new ip(x, y, p.step + 1));
                            }
                        }
                    }
                    res = Math.max(res, max);
                }
            }
            w.printLine(res);


        }

        private boolean check_(int h, int ww, int i, int i1) {

            return i >= 0 && i1 >= 0 && i < h && i1 < ww;

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

        public void printLine(int i) {
            writer.println(i);
        }

    }

    static class ip {
        int first;
        int second;
        int step;

        public ip(int first, int second, int step) {
            this.first = first;
            this.second = second;
            this.step = step;
        }

    }
}


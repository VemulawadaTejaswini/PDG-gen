import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jeel Vaishnav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ADarkerAndDarker solver = new ADarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADarkerAndDarker {
        Queue<Pair> queue;
        int n;
        int m;
        int[][] vis;

        boolean check(int x, int y) {
            if (x >= 0 && x < n && y >= 0 && y < m && vis[x][y] == 0)
                return true;
            return false;
        }

        void add(int x, int y) {
            if (!check(x, y))
                return;
            vis[x][y] = 1;
            queue.add(new Pair(x, y));
        }

        public void solve(int testNumber, InputReader sc, PrintWriter out) {
            n = sc.nextInt();
            m = sc.nextInt();

            char mat[][] = new char[n][m];
            for (int i = 0; i < n; ++i)
                mat[i] = sc.next().toCharArray();

            queue = new LinkedList<>();
            int ans = 0;
            vis = new int[n][m];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (mat[i][j] == '#') {
                        queue.add(new Pair(i, j));
                        vis[i][j] = 1;
                    }
                }
            }
            while (!queue.isEmpty()) {
                ans++;
                int len = queue.size();
                for (int i = 0; i < len; ++i) {
                    Pair curP = queue.poll();
                    add(curP.x - 1, curP.y);
                    add(curP.x + 1, curP.y);
                    add(curP.x, curP.y - 1);
                    add(curP.x, curP.y + 1);
                }
            }
            out.println((ans - 1));
        }

        class Pair {
            int x;
            int y;

            Pair(int a, int b) {
                x = a;
                y = b;
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

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
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


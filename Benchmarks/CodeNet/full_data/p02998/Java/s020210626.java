import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FMustBeRectangular solver = new FMustBeRectangular();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMustBeRectangular {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            ArrayList<Integer>[] x = new ArrayList[(int) 1e5 + 1];
            ArrayList<Integer>[] y = new ArrayList[(int) 1e5 + 1];
            for (int i = 1; i <= (int) 1e5; i++) {
                x[i] = new ArrayList<>();
                y[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                int x1 = s.nextInt(), y1 = s.nextInt();
                x[x1].add(y1);
                y[y1].add(x1);
            }
            ArrayList<Integer>[] adj = new ArrayList[(int) 1e5 + 1];
            int[] color = new int[(int) 1e5 + 1];
            for (int i = 1; i <= (int) 1e5; i++) {
                color[i] = i;
                adj[i] = new ArrayList<>();
                adj[i].add(i);
            }
            for (int i = 1; i <= (int) 1e5; i++) {
                for (int j = 0; j < x[i].size() - 1; j++) {
                    int u = x[i].get(j), v = x[i].get(j + 1);
                    if (color[u] == color[v])
                        continue;
                    int small = color[u];
                    int big = color[v];
                    if (adj[small].size() > adj[big].size()) {
                        int temp = small;
                        small = big;
                        big = temp;
                    }
                    for (int k : adj[small]) {
                        adj[big].add(k);
                        color[k] = big;
                    }
                    adj[small].clear();
                }
            }
            long res = 0;
            for (int i = 1; i <= (int) 1e5; i++) {
                if (adj[i].size() == 0)
                    continue;
                HashSet<Integer> hs = new HashSet<Integer>();
                for (int j : adj[i]) {
                    for (int k : y[j])
                        hs.add(k);
                }
                for (int j : adj[i])
                    res += hs.size() - y[j].size();
            }
            w.println(res);
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


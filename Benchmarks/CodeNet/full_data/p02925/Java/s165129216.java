import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), ans = 1;
            Queue<Integer>[] q = new LinkedList[n];
            TreeSet<Integer> t = new TreeSet<>(), temp = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                q[i] = new LinkedList<>();
                for (int j = 0; j < n - 1; j++) {
                    q[i].add(s.nextInt() - 1);
                }
            }
            boolean[] vis = new boolean[n];
            for (int i = 0; i < n; i++) {
                //w.println(i+" "+q[i].peek()+" "+q[q[i].peek()].peek());
                if (!vis[i] && !q[i].isEmpty() && !q[q[i].peek()].isEmpty() && i == q[q[i].peek()].peek() && !vis[q[i].peek()]) {
                    vis[i] = true;
                    vis[q[i].peek()] = true;
                    q[q[i].peek()].poll();
                    if (!q[q[i].peek()].isEmpty()) {
                        t.add(q[i].peek());
                        t.add(q[q[i].peek()].peek());
                    }
                    q[i].poll();
                    if (!q[i].isEmpty()) {
                        t.add(i);
                        t.add(q[i].peek());
                    }
                }

            }
            while (true) {
                boolean f = true;
                Arrays.fill(vis, false);
                for (int i : t) {
                    //w.println(i+" "+q[i].peek()+" "+q[q[i].peek()].peek());
                    if (!vis[i] && !q[i].isEmpty() && !q[q[i].peek()].isEmpty() && i == q[q[i].peek()].peek() && !vis[q[i].peek()]) {
                        f = false;
                        vis[i] = true;
                        vis[q[i].peek()] = true;
                        q[q[i].peek()].poll();
                        if (!q[q[i].peek()].isEmpty()) {
                            temp.add(q[i].peek());
                            temp.add(q[q[i].peek()].peek());
                        }
                        q[i].poll();
                        if (!q[i].isEmpty()) {
                            temp.add(i);
                            temp.add(q[i].peek());
                        }
                    }
                }
                if (f) break;
                t = temp;
                temp = new TreeSet<>();
                ans++;
            }
            for (int i = 0; i < n; i++) {
                if (!q[i].isEmpty()) {
                    w.println(-1);
                    return;
                }
            }
            w.println(ans);
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

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


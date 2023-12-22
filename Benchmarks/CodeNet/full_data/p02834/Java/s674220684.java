import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.util.LinkedList;
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
        FPlayingTagOnTree solver = new FPlayingTagOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPlayingTagOnTree {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), u = s.nextInt() - 1, v = s.nextInt() - 1;
            ArrayList<Integer>[] a = new ArrayList[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                int x = s.nextInt() - 1, y = s.nextInt() - 1;
                a[x].add(y);
                a[y].add(x);
            }
            int[] x = new int[n], y = new int[n];

            LinkedList<pair<Integer, Integer>> l = new LinkedList<>();
            boolean[] vis = new boolean[n];
            vis[u] = true;
            l.add(new pair<>(u, 0));
            while (!l.isEmpty()) {
                pair<Integer, Integer> p = l.poll();
                for (int i : a[p.x]) {
                    if (!vis[i]) {
                        vis[i] = true;
                        l.add(new pair<>(i, p.y + 1));
                        x[i] = p.y + 1;
                    }
                }
            }

            l.add(new pair<>(v, 0));
            vis = new boolean[n];
            vis[v] = true;
            while (!l.isEmpty()) {
                pair<Integer, Integer> p = l.poll();
                for (int i : a[p.x]) {
                    if (!vis[i]) {
                        vis[i] = true;
                        l.add(new pair<>(i, p.y + 1));
                        y[i] = p.y + 1;
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < n; i++) if (x[i] < y[i]) ans = Math.max(ans, y[i]);
            w.println(ans - 1);
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

    static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            int i = x.compareTo(other.x);
            if (i != 0) return i;
            return y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return x.equals(other.x) && y.equals(other.y);
        }

        public int hashCode() {
            return 31 * x.hashCode() + y.hashCode();
        }

    }
}


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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FEncloseAll solver = new FEncloseAll();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEncloseAll {
        public void solve(int testNumber, FastReader s, PrintWriter w) {

            //Solution credit: AshishGup

            int n = s.nextInt(), MX = (int) 5e6;
            pair<Integer, Integer>[] p = new pair[n];
            double X = 0, Y = 0, delta = 1, d = 0;
            for (int i = 0; i < n; i++) {
                p[i] = new pair<>(s.nextInt(), s.nextInt());
                X += p[i].x;
                Y += p[i].y;
            }
            X /= n;
            Y /= n;
            for (int i = 0; i < 100000; i++) {
                d = d(X - p[0].x, Y - p[0].y);
                int ind = 0;
                for (int j = 1; j < n; j++) {
                    double dist = d(X - p[j].x, Y - p[j].y);
                    if (dist > d) {
                        d = dist;
                        ind = j;
                    }
                }
                X += (p[ind].x - X) * delta;
                Y += (p[ind].y - Y) * delta;
                delta *= 0.999;
            }
            w.println(Math.sqrt(d));
        }

        double d(double x, double y) {
            return x * x + y * y;
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


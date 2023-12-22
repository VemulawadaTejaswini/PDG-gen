import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author caoash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSummerVacation solver = new DSummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSummerVacation {
        public void solve(int testNumber, FastScanner br, PrintWriter pw) {
            int n = br.nextInt();
            int m = br.nextInt();
            ArrayList<Integer>[] data = new ArrayList[m];
            for (int i = 0; i < m; i++) {
                data[i] = new ArrayList<>();
            }
            ArrayList<Pair> in = new ArrayList<Pair>();
            for (int i = 0; i < n; i++) {
                int ai = br.nextInt();
                int bi = br.nextInt();
                --ai;
                in.add(new Pair(ai, bi));
                if (ai >= m) {
                    continue;
                }
                data[m - ai - 1].add(bi);
            }
            for (int i = 0; i < m; i++) {
                Collections.sort(data[i]);
                Collections.reverse(data[i]);
            }
            PriorityQueue<Pair> unused = new PriorityQueue<>();
            for (int i = 0; i < m; i++) {
                for (int j = 1; j < data[i].size(); j++) {
                    unused.add(new Pair(-1 * data[i].get(j), i));
                }
            }
            long ans = 0;
            for (int i = 0; i < m; i++) {
                if (data[i].isEmpty()) {
                    if (unused.isEmpty()) {
                        continue;
                    } else {
                        Pair top = unused.poll();
                        if (top.s - i >= 0) {
                            ans += -1 * top.f;
                        }
                    }
                } else {
                    ans += data[i].get(0);
                }
            }
            pw.println(ans);
            pw.close();
        }

    }

    static class Pair implements Comparable<Pair> {
        public int f;
        public int s;

        public Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }

        public int compareTo(Pair p) {
            return this.f == p.f ? this.s - p.s : this.f - p.f;
        }

        public String toString() {
            return "(" + f + "," + s + ")";
        }

    }

    static class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastScanner.SpaceCharFilter filter;

        public FastScanner(InputStream stream) {
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


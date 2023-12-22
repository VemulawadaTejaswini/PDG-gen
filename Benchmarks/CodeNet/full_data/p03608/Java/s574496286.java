import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn Agrawal coderbond007  PLEASE!! PLEASE!! HACK MY SOLUTION!!
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int r = in.nextInt();
            int[] rr = in.nextIntArray(r);
            MiscUtils.decreaseByOne(rr);
            TaskD.FloydWarshall fw = new TaskD.FloydWarshall(n);
            for (int i = 0; i < m; i++) {
                int s = in.nextInt() - 1;
                int t = in.nextInt() - 1;
                int d = in.nextInt();
                fw.addEdge(s, t, d);
                fw.addEdge(t, s, d);
            }
            Permutation np = new Permutation(r);
            long min = Long.MAX_VALUE;
            for (List<Integer> perm : np) {
                if (perm == null) {
                    break;
                }
                long dist = 0;
                for (int i = 0, size = perm.size(); i < size - 1; i++) {
                    dist += fw.getShortestPath(rr[perm.get(i)], rr[perm.get(i + 1)]);
                }
                min = Math.min(min, dist);
            }
            out.println(min);
        }

        private static class FloydWarshall {
            long[][] d;
            int n;
            long[][] result;
            boolean nf;
            final long INF = Long.MAX_VALUE;

            FloydWarshall(int n) {
                this.n = n;
                d = new long[n][n];
                for (int i = 0; i < n; i++) {
                    Arrays.fill(d[i], INF);
                    d[i][i] = 0;
                }
                nf = false;
            }

            public void addEdge(int i, int j, int c) {
                d[i][j] = c;
            }

            public long getShortestPath(int i, int j) {
                if (nf) {
                    return -INF;
                }

                if (result == null) {
                    for (int kk = 0; kk < n; kk++) {
                        for (int ii = 0; ii < n; ii++) {
                            for (int jj = 0; jj < n; jj++) {
                                if (d[ii][kk] != INF && d[kk][jj] != INF && d[ii][jj] > d[ii][kk] + d[kk][jj]) {
                                    d[ii][jj] = d[ii][kk] + d[kk][jj];
                                }
                            }
                        }
                    }

                    for (int k = 0; k < n; k++) {
                        if (d[k][k] < 0) {
                            nf = true;
                            return -INF;
                        }
                    }

                    result = d;
                }

                return result[i][j];
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        private boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        private static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class Permutation implements Iterable<List<Integer>> {
        int n;
        boolean[] used;
        List<Integer> perm;
        Deque<Integer> ist;
        Permutation.PermutationIterator it;

        public Permutation(int n) {
            this.n = n;
            used = new boolean[n];
            perm = new ArrayList<>();
            ist = new ArrayDeque<>();
            ist.add(-1);
            it = new Permutation.PermutationIterator(this);
        }

        List<Integer> next() {
            out:
            while (!ist.isEmpty()) {
                int k = ist.pop();

                if (k != -1) {
                    // Return in the middle of loop
                    used[k] = false;
                    perm.remove(perm.size() - 1);
                } else {
                    // From the beginning
                    int pos = perm.size();

                    if (pos == n) {
                        // perm Operation on =========================
                        return perm;
                        // perm Operation on =========================
                    }
                }
                for (int i = k + 1; i < n; i++) {
                    if (!used[i]) {
                        ist.push(i);

                        used[i] = true;
                        perm.add(i);
                        ist.push(-1);
                        continue out;
                    }
                }
            }
            return null;
        }


        public Iterator<List<Integer>> iterator() {
            return it;
        }

        static class PermutationIterator implements Iterator<List<Integer>> {
            Permutation p;

            PermutationIterator(Permutation p) {
                this.p = p;
            }


            public boolean hasNext() {
                return !p.ist.isEmpty();
            }


            public List<Integer> next() {
                return p.next();
            }

        }

    }

    static class MiscUtils {
        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }
            }
        }

    }
}


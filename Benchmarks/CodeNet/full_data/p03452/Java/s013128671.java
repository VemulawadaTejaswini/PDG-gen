import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
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
            HashMap<Integer, Integer> map = new HashMap<>();
            TaskD.Data[] d = new TaskD.Data[m];
            for (int i = 0; i < m; ++i) {
                d[i] = new TaskD.Data(in.nextInt(), in.nextInt(), in.nextInt());
            }
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < 123456; ++i) set.add(i);
            ArrayUtils.sort(d);
            for (int i = 0; i < m; ++i) {
                int l = d[i].l;
                int r = d[i].r;
                int dist = d[i].d;
                Integer first = null;
                Integer sec = null;
                if (map.containsKey(l)) {
                    first = map.get(l);
                }
                if (map.containsKey(r)) sec = map.get(r);
                if (first != null && sec != null) {
                    if (sec - first != dist) {
                        out.println("No");
                        return;
                    }
                } else if (first == null && sec == null) {
                    first = set.pollFirst();
                    sec = first + dist;
                } else {
                    if (first == null) {
                        first = sec - dist;
                    } else if (sec == null) {
                        sec = first + dist;
                    }
                }
                map.put(l, first);
                map.put(r, sec);
                set.remove(first);
                set.remove(sec);
            }
            out.println("Yes");
        }

        static class Data implements Comparable<TaskD.Data> {
            int l;
            int r;
            int d;

            public Data(int ll, int rr, int dd) {
                l = ll;
                r = rr;
                d = dd;
            }


            public int compareTo(TaskD.Data o) {
                if (l != o.l)
                    return l - o.l;
                if (r != o.r)
                    return r - o.r;
                return d - o.d;
            }

        }

    }

    static class ArrayUtils {
        public static Object[] sort(Object[] a) {
            a = shuffle(a, new SplittableRandom());
            Arrays.sort(a);
            return a;
        }

        public static Object[] shuffle(Object[] a, SplittableRandom gen) {
            for (int i = 0, n = a.length; i < n; i++) {
                int ind = gen.nextInt(n - i) + i;
                Object d = a[i];
                a[i] = a[ind];
                a[ind] = d;
            }
            return a;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

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

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}


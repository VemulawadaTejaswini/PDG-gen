// package agc.agc020;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int q  = in.nextInt();
        while (--q >= 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            if (a > 1000 || b > 1000) {
                throw new RuntimeException("ng");
            }
            String ret = solve(a, b, c-1, d);
            out.println(ret);
        }
        out.flush();
    }

    private static boolean canMakeA(long leftA, long leftB, long maxLength) {
        if (leftA + leftB == 0) {
            return true;
        }
        if (leftA == 0) {
            return false;
        }
        long contA = (leftA + leftB) / (leftB + 1);
        if (contA > maxLength) {
            return false;
        }
        long contB = (leftB + leftA - 1) / leftA;
        if (contB > maxLength) {
            return false;
        }
        return true;
    }

    private static boolean canMakeB(long leftA, long leftB, long maxLength) {
        if (leftA + leftB == 0) {
            return true;
        }
        if (leftB == 0) {
            return false;
        }
        long contA = (leftA + leftB - 1) / leftB;
        if (contA > maxLength) {
            return false;
        }
        long contB = (leftB + leftA) / (leftA + 1);
        if (contB > maxLength) {
            return false;
        }
        return true;
    }

    private static String solve(long a, long b, long c, long d) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long maxlen = (max + min) / (min + 1);

        StringBuilder line = new StringBuilder();

        long total = a + b;
        long cont = 0;
        char last = '-';

        for (int i = 0; i < total ; i++) {
            boolean useA = false;
            long nc = (last == 'A') ? cont + 1 : 1;
            if (a >= 1 && nc <= maxlen && (canMakeA(a-1, b, maxlen) || canMakeB(a-1, b, maxlen))) {
                useA = true;
            }
            if (useA) {
                cont = (last == 'A') ? cont + 1 : 1;
                line.append('A');
                a--;
                last = 'A';
            } else {
                cont = (last == 'B') ? cont + 1 : 1;
                line.append('B');
                b--;
                last = 'B';
            }
        }
        char[] cc = line.toString().toCharArray();

        StringBuilder ans = new StringBuilder();
        for (int i = (int)c ; i < d; i++) {
            ans.append(cc[i]);
        }
        return ans.toString();
    }

    public static String composeString(long c, long d, List<long[]> ptn) {
        StringBuilder line = new StringBuilder();
        for (long i = c ; i < d ; i++) {
            long head = 0;
            for (long[] x : ptn) {
                long to = head + (x[0] + x[1]) * x[2];
                if (head <= i && i < to) {
                    long offset = (i - head) % (x[0] + x[1]);
                    if (offset < x[0]) {
                        line.append('A');
                    } else {
                        line.append('B');
                    }
                    break;
                } else {
                    head = to;
                }
            }
        }
        return line.toString();
    }

    public static void debugL(List<long[]> a) {
        String x = "";
        for (long[] f : a) {
            x += " ";
            x += "[";
            for (long ff : f) {
                x += ff;
                x += ",";
            }
            x += "]";
            x += ",";
        }
        debug(x);
    }

    public static List<long[]> composePattern(List<long[]> a, List<long[]> b) {
        debug("=");
        debugL(a);
        debugL(b);
        List<long[]> ptn = new ArrayList<>();
        int ai = 0;
        int bi = 0;
        while (true) {
            if (ai == a.size() && bi == b.size()) {
                break;
            }
            if (ai < a.size() && a.get(ai)[1] == 0) {
                ai++;
                continue;
            }
            if (bi < b.size() && b.get(bi)[1] == 0) {
                bi++;
                continue;
            }
            long[] aa = a.get(ai);
            long[] bb = bi == b.size() ? new long[]{0, 1000000000} : b.get(bi);
            long use = Math.min(aa[1], bb[1]);
            aa[1] -= use;
            bb[1] -= use;
            ptn.add(new long[]{aa[0], bb[0], use});
        }
        return ptn;
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
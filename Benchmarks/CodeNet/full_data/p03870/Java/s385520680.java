// package other2016.codefestival2016.grandfinal;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }


        int xor = 0;
        int mask = (1<<30)-1;

        int[] s = new int[n];
        int[] cnt = new int[35];
        for (int i = 0; i < n ; i++) {
            int L = a[i] ^ (a[i]-1);
            int ma = (mask&(~L)) & a[i];
            xor ^= ma;
            s[i] = a[i] & L;
            int ss = s[i];
            int co = 0;
            while (ss >= 2) {
                ss /= 2;
                co++;
            }
            cnt[co]++;
        }

        // debug(xor, cnt);

        long cost = 0;
        int flg = 0;
        for (int i = 30 ; i >= 0 ; i--) {
            int f = ((1<<i) & xor) >= 1 ? 1 : 0;
            f ^= flg;
            if (f == 0) {
                if (cnt[i] % 2 == 0) {
                } else {
                    cost++;
                    flg ^= 1;
                }
            } else {
                if (cnt[i] == 0) {
                    cost += n+10;
                } else {
                    cnt[i]--;
                    if (cnt[i] % 2 == 0) {
                    } else {
                        cost++;
                        flg ^= 1;
                    }
                }
            }
        }

        out.println(cost >= n+1 ? -1 : cost);
        out.flush();
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
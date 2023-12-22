// package other2017.codefestival2017.finale;

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
        int[] d = new int[13];

        for (int i = 0; i < n ; i++) {
            int x = in.nextInt();
            d[x]++;
        }

        out.println(solve(d));
        out.flush();
    }

    private static int solve(int[] d) {
        if (d[0] >= 1) {
            return 0;
        }
        for (int i = 1 ; i < d.length; i++) {
            if (d[i] >= 3) {
                return 0;
            }
        }

        int best = 0;
        for (int p = 0 ; p < (1<<12) ; p++) {
            boolean[] time = new boolean[24];
            time[0] = true;
            for (int x = 1 ; x <= 12 ; x++) {
                boolean up = (p & (1<<(x-1))) >= 1;
                if (d[x] == 1) {
                    if (up) {
                        time[x] = true;
                    } else {
                        time[24-x] = true;
                    }
                } else if (d[x] == 2) {
                    time[x] = true;
                    time[24-x] = true;
                }
            }

            int minGap = 24;
            for (int i = 0; i < time.length; i++) {
                for (int j = i+1 ; j < time.length; j++) {
                    if (time[i] && time[j]) {
                        minGap = Math.min(minGap, Math.min(j-i, 24-(j-i)));
                    }
                }
            }
            best = Math.max(best, minGap);
        }
        return best;
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
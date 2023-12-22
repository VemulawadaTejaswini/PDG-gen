// package arc.arc100;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static long __startTime = System.currentTimeMillis();

    static class Entry {
        int max = 0;
        int maxCount = 0;
        int secondMax = -1;

        public Entry(int v) {
            max = v;
            maxCount = 1;
            secondMax = -1;
        }

        void merge(Entry l) {
            if (max < l.max) {
                secondMax = Math.max(Math.max(secondMax, max), l.secondMax);
                max = l.max;
                maxCount = l.maxCount;
            } else if (max == l.max) {
                maxCount += l.maxCount;
                if (secondMax < l.secondMax) {
                    secondMax = l.secondMax;
                }
            } else {
                secondMax = Math.max(secondMax, l.max);
            }
        }

        public int answer() {
            if (maxCount >= 2) {
                return max * 2;
            } else {
                return max + secondMax;
            }
        }
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[1<<n];
        for (int i = 0; i < (1<<n); i++) {
            a[i] = in.nextInt();
        }

        Entry[] max = new Entry[1<<n];
        for (int i = 0; i < a.length ; i++) {
            max[i] = new Entry(a[i]);
        }
        for (int k = 0; k < n ; k++) {
            for (int i = 0; i < 1<<n ; i++) {
                if ((i & (1<<k)) >= 1) {
                    int f = i ^ (1<<k);
                    max[i].merge(max[f]);
                }
            }
        }

        int best = 0;
        for (int i = 1 ; i < a.length ; i++) {
            best = Math.max(best, max[i].answer());
            out.println(best);
        }

        out.flush();
    }
    
    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
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
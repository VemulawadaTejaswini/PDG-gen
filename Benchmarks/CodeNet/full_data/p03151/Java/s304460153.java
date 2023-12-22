// package other2019.keyence2019;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextLong();
        }
        for (int i = 0; i < n ; i++) {
            b[i] = in.nextLong();
        }
        long totalA = Arrays.stream(a).sum();
        long totalB = Arrays.stream(b).sum();

        if (totalA < totalB) {
            out.println(-1);
            out.flush();
            return;
        }

        long[] w = new long[n];
        for (int i = 0; i < n ; i++) {
            w[i] = a[i]-b[i];
        }

        int cost = 0;
        long req = 0;
        List<Long> free = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            if (w[i] < 0) {
                req += -w[i];
                cost++;
            } else if (w[i] >= 1) {
                free.add(w[i]);
            }
        }
        Collections.sort(free);
        Collections.reverse(free);

        if (req >= 1) {
            long total = 0;
            for (int i = 0; i < free.size(); i++) {
                total += free.get(i);
                if (req <= total) {
                    cost += i+1;
                    break;
                }
            }
        }

        out.println(cost);
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
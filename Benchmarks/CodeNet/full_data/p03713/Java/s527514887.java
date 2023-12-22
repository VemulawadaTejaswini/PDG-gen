import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws java.lang.Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter wr = new PrintWriter(System.out);
        int h = in.nextInt(), w = in.nextInt();
        long ans = Long.MAX_VALUE;
        for (int i = 1; i <= h; i++) {
            {
                int h2 = (int)Math.ceil((h - i) / 2.0), h3 = h - i - h2;
                long temp = Math.max(i, Math.max(h2, h3)) - Math.min(i, Math.min(h2, h3));
                ans = Math.min(ans, temp * w);
            }
            {
                int h2 = h - i, h3 = h - i;
                int w1 = w / 2, w2 = w - w1;
                long temp = Math.max((long)i * w, Math.max((long)h2 * w1,(long) h3 * w2)) - Math.min((long)i * w, Math.min((long)h2 * w1,(long) h3 * w2));
                ans = Math.min(ans, temp );
            }
        }
        for (int i = 1; i <= w; i++) {
            {
                int w2 = (int)Math.ceil((w - i) / 2.0), w3 = w - i - w2;
                long temp = Math.max(i, Math.max(w2, w3)) - Math.min(i, Math.min(w2, w3));
                ans = Math.min(ans,(long) temp * h );
            }
            {
                int w2 = w - i, w3 = w - i;
                int h1 = h / 2, h2 = h - h1;
                long temp = Math.max((long)i * h, Math.max((long)w2 * h1, (long)w3 * h2)) - Math.min((long)i * h, Math.min((long)w2 * h1,(long) w3 * h2));
                ans = Math.min(ans, temp );
            }
        }
        wr.println(ans);
        wr.close();

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int peek() {
            if (numChars == -1)
                return -1;
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar];
        }

        public void skip(int x) {
            while (x-- > 0)
                read();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextString() {
            return next();
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        public String nextLine() {
            StringBuffer buf = new StringBuffer();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r')
                    buf.appendCodePoint(c);
                c = read();
            }
            return buf.toString();
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
        public boolean hasNext() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1)
                read();
            return value != -1;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}
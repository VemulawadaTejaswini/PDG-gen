import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;

public class Main{
    public static void main (String[] args) throws java.lang.Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int[] a = new int[26];
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 0; i < n ; i++) {
            char[] ca = in.next().toCharArray();
            for (char x : ca)
                a[x - 'a']++;
        }
        //System.out.println(Arrays.toString(a));
        int cnt4 = (n / 2) * (m / 2);
        int cnt2 = (n / 2) * (m % 2) + (m / 2) * (n % 2);
        int cnt1 = (n % 2) * (m % 2);
        for (int i = 0; i < 26 && cnt4 > 0 ; i++) {
            if (a[i] >= 4) {
                int tot = a[i] / 4;
                cnt4 -= Math.min(tot, cnt4);
                a[i] -= tot * 4;
            }
        }
        //System.out.println(cnt4+" "+cnt2+" "+cnt1);
        for (int i = 0; i < 26 && cnt2 > 0 ; i++) {
            if (a[i] >= 2) {
                int tot = a[i] / 2;
                cnt2 -= Math.min(tot, cnt2);
                a[i] -= tot * 2;
            }
        }
        for (int i = 0; i < 26 && cnt1 > 0 ; i++) {
            if (a[i] >= 1) {
                int tot = a[i];
                cnt1 -= Math.min(tot, cnt1);
                a[i] -= tot;
            }
        }
        if (cnt4 != 0 || cnt2 != 0 || cnt1 != 0)
            w.println("No");
        else
            w.println("Yes");
        w.close();
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
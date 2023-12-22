import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;

public class Main{
    public static void main (String[] args) throws java.lang.Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);

        PriorityQueue<Long> q1 = new PriorityQueue<>();
        PriorityQueue<Long> q2 = new PriorityQueue<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long temp = in.nextLong();
            q1.add(temp);
            q2.add(temp);

        }
        if (n % 2 == 0) {
            long sum1 = q1.poll(), sum2 = q1.poll();
            long min = Math.abs(sum2 - sum1);
            while (q1.size() > 0) {
                long temp = q1.poll();
                if (sum1 < sum2) {
                    if (sum1 + temp > sum1)
                        sum1 = sum1 + temp;
                    else
                        sum2 += temp;
                } else {
                    if (sum2 + temp > sum2)
                        sum2 = sum2 + temp;
                    else
                        sum1 += temp;
                }

            }
            min = Math.min(min, Math.abs(sum1 - sum2));
            w.println(min);
        } else {
            long sum1 = q1.poll(), sum2 = q1.poll();
            long min = Math.abs(sum2 - sum1);
            while (q1.size() > 0) {
                long temp = q1.poll();
                if (sum1 < sum2) {
                    if (sum1 + temp > sum1)
                        sum1 = sum1 + temp;
                    else
                        sum2 += temp;
                } else {
                    if (sum2 + temp > sum2)
                        sum2 = sum2 + temp;
                    else
                        sum1 += temp;
                }

            }
            min = Math.min(min, Math.abs(sum1 - sum2));
            sum1 = q2.poll() + q2.poll(); sum2 = q2.poll();
            min = Math.abs(sum2 - sum1);
            while (q1.size() > 0) {
                long temp = q1.poll();
                if (sum1 < sum2) {
                    if (sum1 + temp > sum1)
                        sum1 = sum1 + temp;
                    else
                        sum2 += temp;
                } else {
                    if (sum2 + temp > sum2)
                        sum2 = sum2 + temp;
                    else
                        sum1 += temp;
                }

            }
            min = Math.min(min, Math.abs(sum1 - sum2));
            w.println(min);
        }




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
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
//        Random random = new Random(0xdead);

            int n = in.nextInt();
//        int n = 80;
            int[] X = new int[n];
            int[] Y = new int[n];
            long[] V = new long[n];
            for (int i = 0; i < n; ++i) {
                X[i] = in.nextInt();
                Y[i] = in.nextInt();
                V[i] = in.nextLong();
//            X[i] = random.nextInt(100);
//            Y[i] = random.nextInt(100);
//            V[i] = Math.abs(random.nextLong() % (long)(1e15));
            }
            int m = in.nextInt();
//        int m = 320;
            int[] T = new int[m];
            int[] coord = new int[m];
            int[] lim = new int[m];
            boolean[][] matches = new boolean[m][n];
            for (int i = 0; i < m; ++i) {
                char c = in.nextToken().toCharArray()[0];
//            char c = "LRDU".charAt(random.nextInt(4));
                T[i] = c;
                coord[i] = in.nextInt();
                lim[i] = in.nextInt();
//            coord[i] = random.nextInt(100);
//            lim[i] = random.nextInt(1000);
                for (int j = 0; j < n; ++j) {
                    if (c == 'L') matches[i][j] = (X[j] <= coord[i]);
                    if (c == 'R') matches[i][j] = (X[j] >= coord[i]);
                    if (c == 'D') matches[i][j] = (Y[j] <= coord[i]);
                    if (c == 'U') matches[i][j] = (Y[j] >= coord[i]);
                }
            }

            Rational[][] a = new Rational[m + n][n];
            for (int i = 0; i < m; ++i)
                for (int j = 0; j < n; ++j)
                    a[i][j] = matches[i][j] ? Rational.ONE : Rational.ZERO;
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    a[m + i][j] = (i == j ? Rational.ONE : Rational.ZERO);
            Rational[] b = new Rational[m + n];
            for (int i = 0; i < m; ++i)
                b[i] = Rational.valueOf(lim[i]);
            for (int i = 0; i < n; ++i)
                b[m + i] = Rational.ONE;
            Rational[] c = new Rational[n];
            for (int i = 0; i < n; ++i)
                c[i] = Rational.valueOf(V[i]);
            Rational[] x = new Rational[n];
            Rational res = Simplex.simplex(a, b, c, x);
            out.printLine(res.longValue());
        }

    }

    static class Rational implements Comparable<Rational> {
        BigInteger num;
        BigInteger den;
        public static final Rational ZERO = new Rational(0);
        public static final Rational ONE = new Rational(1);
        public static final Rational POSITIVE_INFINITY = new Rational(1, 0);

        public Rational(long num) {
            this.num = BigInteger.valueOf(num);
            this.den = BigInteger.ONE;
        }

        public Rational(long num, long den) {
            this(BigInteger.valueOf(num), BigInteger.valueOf(den));
        }

        public Rational(BigInteger num, BigInteger den) {
            this.num = num;
            this.den = den;
            reduce();
        }

        void reduce() {
            if (!den.abs().equals(BigInteger.ONE)) {
                BigInteger gcd = num.gcd(den);
                if (gcd.signum() != 0 && !gcd.equals(BigInteger.ONE)) {
                    num = num.divide(gcd);
                    den = den.divide(gcd);
                }
            }
            if (den.signum() < 0 || den.signum() == 0 && num.signum() < 0) {
                num = num.negate();
                den = den.negate();
            }
        }

        public Rational add(Rational r) {
            return new Rational(num.multiply(r.den).add(r.num.multiply(den)), den.multiply(r.den));
        }

        public Rational sub(Rational r) {
            return new Rational(num.multiply(r.den).subtract(r.num.multiply(den)), den.multiply(r.den));
        }

        public Rational mul(Rational r) {
            return new Rational(num.multiply(r.num), den.multiply(r.den));
        }

        public Rational div(Rational r) {
            return new Rational(num.multiply(r.den), den.multiply(r.num));
        }

        public Rational negate() {
            return new Rational(num.negate(), den);
        }

        public Rational inverse() {
            return new Rational(den, num);
        }

        public int signum() {
            return num.signum();
        }

        public long longValue() {
            Assert.assertTrue(num.longValue() % den.longValue() == 0);
            return num.longValue() / den.longValue();
        }

        public int compareTo(Rational other) {
            return (num.multiply(other.den).compareTo(other.num.multiply(den)));
        }

        public boolean equals(Object obj) {
            return num.equals(((Rational) obj).num) && den.equals(((Rational) obj).den);
        }

        public int hashCode() {
            return num.hashCode() * 31 + den.hashCode();
        }

        public String toString() {
            return num + "/" + den;
        }

        public static Rational valueOf(long x) {
            return new Rational(x);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buffer = new byte[10000];
        private int cur;
        private int count;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isSpace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (count == -1) {
                throw new InputMismatchException();
            }
            try {
                if (cur >= count) {
                    cur = 0;
                    count = stream.read(buffer);
                    if (count <= 0)
                        return -1;
                }
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            return buffer[cur++];
        }

        public int readSkipSpace() {
            int c;
            do {
                c = read();
            } while (isSpace(c));
            return c;
        }

        public String nextToken() {
            int c = readSkipSpace();
            StringBuilder sb = new StringBuilder();
            while (!isSpace(c)) {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }

        public int nextInt() {
            int sgn = 1;
            int c = readSkipSpace();
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = read();
            } while (!isSpace(c));
            res *= sgn;
            return res;
        }

        public long nextLong() {
            long sgn = 1;
            int c = readSkipSpace();
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10L + (long) (c - '0');
                c = read();
            } while (!isSpace(c));
            res *= sgn;
            return res;
        }

    }

    static class Assert {
        public static void assertTrue(boolean flag) {
//        if (!flag)
//        while (true);
            if (!flag)
                throw new AssertionError();
        }

    }

    static class Simplex {
        public static Rational simplex(Rational[][] A, Rational[] b, Rational[] c, Rational[] x) {
            int m = A.length;
            int n = A[0].length + 1;
            int[] index = new int[n + m];
            for (int i = 0; i < n + m; i++) {
                index[i] = i;
            }
            Rational[][] a = new Rational[m + 2][n + 1];
            for (Rational[] a1 : a) {
                Arrays.fill(a1, Rational.ZERO);
            }
            int L = m;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - 1; j++) {
                    a[i][j] = A[i][j].negate();
                }
                a[i][n - 1] = Rational.ONE;
                a[i][n] = b[i];
                if (a[L][n].compareTo(a[i][n]) > 0) {
                    L = i;
                }
            }
            for (int j = 0; j < n - 1; j++) {
                a[m][j] = c[j];
            }
            a[m + 1][n - 1] = Rational.ONE.negate();
            for (int E = n - 1; ; ) {
                if (L < m) {
                    int t = index[E];
                    index[E] = index[L + n];
                    index[L + n] = t;
                    a[L][E] = a[L][E].inverse();
                    for (int j = 0; j <= n; j++) {
                        if (j != E) {
                            a[L][j] = a[L][j].mul(a[L][E].negate());
                        }
                    }
                    for (int i = 0; i <= m + 1; i++) {
                        if (i != L) {
                            for (int j = 0; j <= n; j++) {
                                if (j != E) {
                                    a[i][j] = a[i][j].add(a[L][j].mul(a[i][E]));
                                }
                            }
                            a[i][E] = a[i][E].mul(a[L][E]);
                        }
                    }
                }
                E = -1;
                for (int j = 0; j < n; j++) {
                    if (E < 0 || index[E] > index[j]) {
                        if (a[m + 1][j].signum() > 0 || a[m + 1][j].signum() == 0 && a[m][j].signum() > 0) {
                            E = j;
                        }
                    }
                }
                if (E < 0) {
                    break;
                }
                L = -1;
                for (int i = 0; i < m; i++) {
                    if (a[i][E].signum() < 0) {
                        Rational d;
                        if (L < 0 || (d = a[L][n].div(a[L][E]).sub(a[i][n].div(a[i][E]))).signum() < 0 || d.signum() == 0
                                && index[L + n] > index[i + n]) {
                            L = i;
                        }
                    }
                }
                if (L < 0) {
                    return Rational.POSITIVE_INFINITY;
                }
            }
            if (a[m + 1][n].signum() < 0) {
                return null;
            }
            if (x != null) {
                Arrays.fill(x, Rational.ZERO);
                for (int i = 0; i < m; i++)
                    if (index[n + i] < n - 1)
                        x[index[n + i]] = a[i][n];
            }
            return a[m][n];
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}


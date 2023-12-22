import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        BRGBBalls solver = new BRGBBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRGBBalls {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            String s = in.readString();

            int[] a = s.chars().map(c -> {
                if (c == 'R') return 0;
                if (c == 'G') return 1;
                return 2;
            }).toArray();

            List<IntIntPair> list = new ArrayList<>();
            int[] cntRGB = new int[3];
            for (int i = 0; i < 3 * n; i++) {
                cntRGB[a[i]]++;
                int[] tmp = cntRGB.clone();
                Arrays.sort(tmp);
                int idx = 0;
                for (int j = 0; j < 3; j++) {
                    if (cntRGB[a[i]] == tmp[j]) idx = j;
                }
                list.add(new IntIntPair(a[i], idx));
                cntRGB[a[i]]++;
            }

            Modulo.mod = MiscUtils.MODF;

            long ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = (ans * i) % MiscUtils.MODF;
            }
            for (int i = 0; i < 3 * n; i++) {
                int j = i;
                while (j < 3 * n - 1 && list.get(j).equals(list.get(j + 1))) j++;
                int cnt = j - i + 1;
                for (int k = 1; k <= cnt; k++) ans = (ans * k) % MiscUtils.MODF;
                i = j;
            }
            List<List<IntIntPair>> ll = new ArrayList<>();
            for (int i = 0; i < 3; i++) ll.add(new ArrayList<>());
            for (int i = 0; i < 3 * n; i++) ll.get(list.get(i).second).add(new IntIntPair(a[i], i));
            for (int i = 0; i < n; i++) {
                int j = i;
                outer:
                while (true) {
                    if (j == n - 1) break;
                    for (int k = 0; k < 3; k++) {
                        if (ll.get(k).get(j).first != ll.get(k).get(j + 1).first) break outer;
                        if (ll.get(k).get(j).second + 1 != ll.get(k).get(j + 1).second) break outer;
                    }
                    j++;
                }
                int cnt = j - i + 1;
                for (int k = 1; k <= cnt; k++) ans = Modulo.div(ans, k);
                i = j;
            }
            out.printLine(ans);
        }

    }

    static class Modulo {
        public static long mod;
        private long value;

        public Modulo(long value) {
            this.value = (value % mod + mod) % mod;
        }

        public static long mlt(long a, long b) {
            return ((a % mod + mod) * (b % mod + mod)) % mod;
        }

        public static long rev(long a) {
            //return pow(a, mod - 2);
            return (Euclid.extgcd(a, mod, new long[3])[0] % mod + mod) % mod;
        }

        public static long div(long a, long b) {
            return mlt(a, rev(b));
        }

        public String toString() {
            return "" + value;
        }

    }

    static class MiscUtils {
        public static final int MODF = 998244353;

    }

    static class Euclid {
        public static long[] extgcd(long a, long b, long[] is) {
            if (a == 0) {
                is[0] = 0;
                is[1] = 1;
                is[2] = b;
            } else {
                extgcd(b % a, a, is);
                long x = is[1] - b / a * is[0];
                is[1] = is[0];
                is[0] = x;
            }
            return is;
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

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
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
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class IntIntPair implements Comparable<IntIntPair> {
        public final int first;
        public final int second;

        public IntIntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            IntIntPair pair = (IntIntPair) o;

            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(IntIntPair o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
        }

    }
}


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CABSubstrings solver = new CABSubstrings();
        solver.solve(1, in, out);
        out.close();
    }

    static class CABSubstrings {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long ans = 0;
            int N = in.nextInt();
            String[] ss = new String[N];
            long endA = 0;
            long beginB = 0;
            long xa = 0;
            long bx = 0;
            long notba = 0;
            long ba = 0;
            for (int i = 0; i < N; i++) {
                ss[i] = in.next();
                if (ss[i].charAt(0) == 'B') beginB++;
                if (ss[i].charAt(ss[i].length() - 1) == 'A') endA++;
                if (!(ss[i].charAt(0) == 'B' && ss[i].charAt(ss[i].length() - 1) == 'A')) notba++;
                if (ss[i].charAt(0) != 'B' && ss[i].charAt(ss[i].length() - 1) == 'A') xa++;
                if (ss[i].charAt(0) == 'B' && ss[i].charAt(ss[i].length() - 1) != 'A') bx++;
                if (ss[i].charAt(0) == 'B' && ss[i].charAt(ss[i].length() - 1) == 'A') ba++;
                for (int j = 0; j < ss[i].length() - 1; j++) {
                    if (ss[i].charAt(j) == 'A' && ss[i].charAt(j + 1) == 'B') ans++;
                }
            }
            if (ba > 0) {
                if (xa > 0) {
                    ans++;
                    xa--;
                }
                if (bx > 0) {
                    ans++;
                    bx--;
                }
                ans += ba - 1;
            }
            out.println(ans + Math.min(xa, bx));
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


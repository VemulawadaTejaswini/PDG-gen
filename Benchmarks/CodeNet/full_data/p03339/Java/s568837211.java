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
        CAttention solver = new CAttention();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAttention {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            String S = in.next();
            int ans = Integer.MAX_VALUE;
            int ecnt = 0; // i番目の人の東側にいて東を向いている人の数
            int wcnt = 0; // i番目の人の西側にいて西を向いている人の数
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'E') ecnt++;
            }
            for (int i = 0; i < S.length(); i++) {
                // インクリメントしたとき、i番目の人が東側を向いていたら予め減らしておかなければならない
                if (S.charAt(i) == 'E') {
                    ecnt--;
                }
                // 振り向く人の数 = i番目の人の東側で東側を向いている人の数 +
                // i番目の人の西側にいて西を向いている人の数 の最小値
                ans = Math.min(ans, ecnt + wcnt);
                // i番目の人が西側を向いていたら、i+1番目の人をリーダーにする前にwcntを増やしておく
                if (S.charAt(i) == 'W') {
                    wcnt++;
                }
            }
            out.println(ans);
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


import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        String sa = scanner.next();
        String sb = scanner.next();
        String sc = scanner.next();

        String result = new Judgement(sa, sb, sc).judge();

        System.out.println(result);
    }

    public static class Judgement {
        private StringBuilder mBa;
        private StringBuilder mBb;
        private StringBuilder mBc;

        private String mTurn = "A";

        public Judgement(String sa, String sb, String sc) {
            this.mBa = new StringBuilder().append(sa);
            this.mBb = new StringBuilder().append(sb);
            this.mBc = new StringBuilder().append(sc);
        }

        public String judge() {
            return play(mBa);
        }

        public String play(StringBuilder target) {
            if (target.length() == 0) return mTurn;

            char what = target.charAt(0);
            StringBuilder next = null;
            target.deleteCharAt(0);
            switch (what) {
                case 'a':
                    mTurn = "A";
                    next = mBa;
                    break;
                case 'b':
                    mTurn = "B";
                    next = mBb;
                    break;
                case 'c':
                    mTurn = "C";
                    next = mBc;
                    break;
            }
            return play(next);
        }

    }

    /// self liblary
    public static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

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

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }


}

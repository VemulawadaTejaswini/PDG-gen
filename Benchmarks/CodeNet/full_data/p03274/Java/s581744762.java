import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

@SuppressWarnings("unchecked")
public class Main {
    static final int MAX = 300000001;
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        int N = fs.nextInt();
        final int K = fs.nextInt();

        int[] x = new int[N + 1];

        boolean zflg = false;
        int bk = -1;
        int zidx = -1;

        for (int i = 0; i < N + 1; i++) {
            if (!zflg && i == N) break;

            int tmp = fs.nextInt();

            if (bk < 0 && 0 < tmp) {
                zflg = true;
                zidx = i;
                x[i] = 0;
                i++;
            } else if (tmp == 0) {
                zidx = i;
            }

            x[i] = tmp;
            bk = tmp;
        }

        int ans = MAX;

        for (int i = 0; i < N + 1; i++) {
            if (0 < x[i]) break;

            int ridx = i + K - 1;

            int rlimit = x.length - 2;

            if (zflg) {
                ridx = i + K;
                rlimit = x.length - 1;
            }

            if (rlimit < ridx) break;

            if (x[ridx] < 0) continue;

            int left = Math.abs(x[i]);

            int right = x[ridx];

            ans =
                Math.min(ans,
                         Math.min(2 * left + right,left + 2 * right));
        }

        System.out.println(ans);
    }
}

class FastScanner {
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
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

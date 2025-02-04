import static java.lang.Math.max;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int m = fsc.nextInt();
        long[] d = new long[m];
        System.gc();
        long sum = 0;
        int pre = fsc.nextInt() - 1;
        for (int i = 1; i < n; i++) {
            int now = fsc.nextInt() - 1;
            int to = now;
            int fr = pre;
            if (fr < to) {
                if (fr + 2 < m) {
                    d[fr + 2] += 1;
                }
                if (to + 2 < m) {
                    d[to + 2] += to - fr - 1;
                }
                if (to + 1 < m) {
                    d[to + 1] -= to - fr;
                }
            } else {
                if (fr + 2 < m) {
                    d[fr + 2] += 1;
                }
                d[0] += m - fr - 1;
                d[1] += 1 - d[0];
                if (to + 2 < m) {
                    d[to + 2] += to + m - fr - 1;
                }
                if (to + 1 < m) {
                    d[to + 1] -= to + m - fr;
                }
            }

            if (now > pre) {
                sum += now - pre;
            } else {
                sum += now + m - pre;
            }
            pre = now;
        }
        fsc.close();
        System.gc();
        for (int i = 1; i < m; i++) {
            d[i] += d[i - 1];
        }
        long max = d[0];
        for (int i = 1; i < m; i++) {
            d[i] += d[i - 1];
            max = max(max, d[i]);
        }
        System.gc();
        System.out.println(sum - max);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public void close() {
        try {
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int k = fsc.nextInt();
        long[] pow = new long[15];
        for (int b = 0; b < 15; b++) {
            pow[b] = b > 0 ? pow[b - 1] * 10 : 1;
        }
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            if (i <= 2) {
                for (int j = 2; j <= 10; j++) {
                    ans.add(pow[i] * j - 1);
                }
            } else if (i <= 13) {
                for (int j = 1; j <= min(i - 2, 9); j++) {
                    for (int l = 0; l <= 9; l++) {
                        ans.add(pow[i - 1] * (j * 10 + l + 1) - 1);
                    }
                }
                for (int j = i - 1; j <= 9; j++) {
                    ans.add(pow[i] * (j + 1) - 1);
                }
            } else {
                for (int m = 0; m < 9; m++) {
                    ans.add(pow[i - 2] * (100 + m + 1) - 1);
                }
                for (int j = 1; j <= 9; j++) {
                    for (int l = 0; l <= 9; l++) {
                        ans.add(pow[i - 1] * (j * 10 + l + 1) - 1);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(ans.get(i)).append('\n');
        }
        System.out.print(sb);
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
}

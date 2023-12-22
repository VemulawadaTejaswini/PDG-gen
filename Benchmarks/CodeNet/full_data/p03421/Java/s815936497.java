import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int a = fsc.nextInt();
        int b = fsc.nextInt();
        if (b > n - a + 1 || b < (n + a - 1) / a) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (a == 1) {
            for (int i = 0; i < n; i++) {
                sb.append(n - i).append(' ');
            }
            System.out.println(sb);
            return;
        }
        if (b == 1) {
            for (int i = 0; i < n; i++) {
                sb.append(i + 1).append(' ');
            }
            System.out.println(sb);
            return;
        }
        int d = n - a - b + 1;
        int p = d / (a - 1);
        int q = d % (a - 1);
        int[] ans = new int[n];
        for (int j = 0; j <= p; j++) {
            for (int i = n - (j + 1) * a; i < n - j * a; i++) {
                ans[i] = (i - (n - (j + 1) * a) + 1) + j * a;
            }
        }
        for (int k = 0; k <= q; k++) {
            int i = n - (p + 1) * a - (q + 1) + k;
            if (i >= 0) {
                ans[i] = (p + 1) * a + k + 1;
            }
        }
        for (int i = 0; i < n - (p + 1) * a - (q + 1); i++) {
            ans[i] = n - i;
        }
        for (int i = 0; i < n; i++) {
            sb.append(ans[i]).append(' ');
        }
        System.out.println(sb);
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
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

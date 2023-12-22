import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static int q;
    static String s;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextInt();
        q = sc.nextInt();
        s = sc.next();
        char[] t = new char[q];
        char[] d = new char[q];
        for (int i = 0; i < q; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }
        int left = binSearch(t, d, -1, n);
        int right = binSearch(t, d, n, -1);
        int ans = Math.max(0, right - left - 1);
        System.out.println(ans);
    }
    public static int binSearch(char[] t, char[] d, int ok, int ng) {
        int out = ok;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (solve(mid, t, d, out)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
    public static boolean solve(int mid, char[] t, char[] d, int out) {
        for (int i = 0; i < q; i++) {
            if (mid == -1 || mid == n) {
                return false;
            }
            char ch = s.charAt(mid);
            if (ch != t[i]) {
                continue;
            }
            if (d[i] == 'L') {
                mid--;
            } else if (d[i] == 'R') {
                mid++;
            }
            if (mid == out) {
                return true;
            }
        }
        return false;
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
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
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

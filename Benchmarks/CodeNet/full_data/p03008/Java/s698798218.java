import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        BasicScanner sc = new BasicScanner(System.in);
        long n = sc.nextInt();
        int[][] ab = new int[3][2];
        ab[0][0] = sc.nextInt(); ab[1][0] = sc.nextInt(); ab[2][0] = sc.nextInt();
        ab[0][1] = sc.nextInt(); ab[1][1] = sc.nextInt(); ab[2][1] = sc.nextInt();
        Arrays.sort(ab, (u, v) -> (v[1] - v[0]) - (u[1] - u[0]));
        long ga = ab[0][0], sa = ab[1][0], ba = ab[2][0];
        long gb = ab[0][1], sb = ab[1][1], bb = ab[2][1];
        long c = ba <= bb ? 3 : sa <= sb ? 2 : ga <= gb ? 1 : 0;
        long max = n;
        if (c == 0) {
            for (long i = 0; i <= n / gb; i++) {
                for (long j = 0; j <= (n - i * gb) / sb; j++) {
                    long k = (n - i * gb - j * sb) / bb;
                    long s = n + i * (ga - gb) + j * (sa - sb) + k * (ba - bb);
                    max = Math.max(max, s);
                }
            }
        } else if (c == 1) {
            long i = n / ga;
            n += i * (gb - ga);
            for (long j = 0; j <= n / sb; j++) {
                long k = (n - j * sb) / bb;
                long s = n + j * (sa - sb) + k * (ba - bb);
                max = Math.max(max, s);
            }
        } else if (c == 2) {
            for (long i = 0; i <= n / sa; i++) {
                long j = (n - i * ga) / sa;
                long s = n + i * (gb - ga) + j * (sb - sa);
                long k = s / bb;
                s += k * (ba - bb);
                max = Math.max(max, s);
            }
        } else {
            for (long i = 0; i <= n / ga; i++) {
                for (long j = 0; j <= (n - i * ga) / sa; j++) {
                    long k = (n - i * ga - j * sa) / ba;
                    long s = n + i * (gb - ga) + j * (sb - sa) + k * (bb - ba);
                    max = Math.max(max, s);
                }
            }
        }
        System.out.println(max);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}

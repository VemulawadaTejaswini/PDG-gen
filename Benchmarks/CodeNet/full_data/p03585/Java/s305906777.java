import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) throws Exception {
        BasicScanner sc = new BasicScanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        double[][] xa = new double[n][3];
        double[][] ya = new double[n][3];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            xa[i][0] = (double) a[i] / b[i];
            xa[i][1] = 1;
            xa[i][2] = (double) c[i] / b[i];
            ya[i][0] = 1;
            ya[i][1] = (double) b[i] / a[i];
            ya[i][2] = (double) c[i] / a[i];
        }
        Arrays.sort(xa, (u, v) -> Double.compare(u[0], v[0]));
        Arrays.sort(ya, (u, v) -> Double.compare(u[1], v[1]));

        TreeSet<Double> set = new TreeSet<>();

        final int k = n * (n - 1) / 2;
        final int m = (k + 1) / 2;

        double l, r;

        l = -2.1e8; r = 2.1e8;
        while (true) {
            double x = (l + r) / 2;
            if (l == x || x == r) break;
            set.clear();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                double d = xa[i][2] - x * xa[i][0];
                cnt += set.tailSet(d).size();
                set.add(d);
            }
            if (cnt < m) l = x;
            else r = x;
        }
        double x = l;

        l = -2.1e8; r = 2.1e8;
        while (true) {
            double y = (l + r) / 2;
            if (l == y || y == r) break;
            set.clear();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                double d = ya[i][2] - y * ya[i][1];
                cnt += set.tailSet(d).size();
                set.add(d);
            }
            if (cnt < m) l = y;
            else r = y;
        }
        double y = l;

        System.out.printf("%f %f\n",x ,y);
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

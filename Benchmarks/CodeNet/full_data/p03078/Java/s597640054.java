import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            a.add(sc.nextLong());
        }
        List<Long> b = new ArrayList<>();
        for (int i = 0; i < y; i++) {
            b.add(sc.nextLong());
        }
        List<Long> c = new ArrayList<>();
        for (int i = 0; i < z; i++) {
            c.add(sc.nextLong());
        }

        List<Long> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                long res = a.get(i) + b.get(j);
                ab.add(res);
            }
        }
        Collections.sort(ab, Comparator.reverseOrder());

        List<Long> abc = new ArrayList<>();
        for (int i = 0; i < Math.min(ab.size(), k); i++) {
            for (int j = 0; j < z; j++) {
                long res = ab.get(i) + c.get(j);
                abc.add(res);
            }
        }
        Collections.sort(abc, Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
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

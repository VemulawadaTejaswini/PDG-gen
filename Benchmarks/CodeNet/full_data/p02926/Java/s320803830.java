import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        Pair3<Double, Long, Long>[] c = new Pair3[n];
        for (int i = 0; i < n; i++) {
            long x = fsc.nextLong();
            long y = fsc.nextLong();
            double theta = Math.atan2(y, x);
            c[i] = new Pair3<>(theta, x, y);
        }
        Arrays.sort(c, (u, v) -> Double.compare(u.key, v.key));
        double ans = 0;
        for (int i = 0; i < n; i++) {
            long x = 0;
            long y = 0;
            for (int j = i; j < n + i; j++) {
                if (c[i].key <= c[j % n].key && c[j % n].key < c[i].key + Math.PI) {
                    x += c[j % n].val1;
                    y += c[j % n].val2;
                } else if (c[i].key <= c[j % n].key + 2. * Math.PI && c[j % n].key + 2. * Math.PI < c[i].key + Math.PI) {
                    x += c[j % n].val1;
                    y += c[j % n].val2;
                }
                ans = Math.max(ans, Math.sqrt(x * x + y * y));
            }
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


class Pair3<K, V1, V2> {
    public K key;
    public V1 val1;
    public V2 val2;

    public Pair3(K key, V1 val1, V2 val2) {
        this.key = key;
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override @SuppressWarnings("all")
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Pair3)) {
            return false;
        } else {
            Pair3 p = (Pair3) o;
            return this.key.equals(p.key) && this.val1.equals(p.val1) && this.val2.equals(p.val2);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.val1, this.val2);
    }

    @Override
    public String toString() {
        return "(" + this.key.toString() + ", " + this.val1.toString() + ", " + this.val2.toString() + ")";
    }
}

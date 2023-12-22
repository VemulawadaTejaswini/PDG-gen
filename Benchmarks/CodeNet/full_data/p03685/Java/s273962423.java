import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        long r = fsc.nextLong();
        long c = fsc.nextLong();
        int n = fsc.nextInt();
        HashSet<Line> edg = new HashSet<>();
        for (int i = 0; i < n; i++) {
            long x1 = fsc.nextLong();
            long y1 = fsc.nextLong();
            long x2 = fsc.nextLong();
            long y2 = fsc.nextLong();
            boolean ex1 = x1 == 0 || x1 == r;
            boolean ey1 = y1 == 0 || y1 == c;
            boolean ex2 = x2 == 0 || x2 == r;
            boolean ey2 = y2 == 0 || y2 == c;
            if ((ex1 || ey1) && (ex2 || ey2)) {
                edg.add(new Line(x1, y1, x2, y2));
            }
        }
        System.out.println(crs(edg) ? "NO" : "YES");
    }

    public static boolean crs(HashSet<Line> set) {
        if (set.isEmpty()) {
            return false;
        }
        Iterator<Line> iter = set.iterator();
        Line l = iter.next();
        iter.remove();
        HashSet<Line> pos = new HashSet<>();
        while (iter.hasNext()) {
            Line t = iter.next();
            int c = l.cross(t);
            if (c == 0) {
                return true;
            } else if (c > 0) {
                pos.add(t);
                iter.remove();
            }
        }
        return crs(set) || crs(pos);
    }

    static class Line {
        public Complex c1, c2;

        public Line(long x1, long y1, long x2, long y2) {
            this.c1 = new Complex(x1, y1);
            this.c2 = new Complex(x2, y2);
        }

        public int cross(Line l) {
            Complex o = c1;
            Complex u = c2.sub(o);
            Complex v1 = l.c1.sub(o);
            Complex v2 = l.c2.sub(o);
            long opz12 = u.x * v1.y - u.y * v1.x;
            long opz13 = u.x * v2.y - u.y * v2.x;
            if (opz12 > 0 ^ opz13 > 0) {
                return 0;
            } else if (opz12 > 0 && opz13 > 0) {
                return 1;
            } else {
                return -1;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (!(o instanceof Line)) {
                return false;
            } else {
                Line l = (Line) o;
                return this.c1.equals(l.c1) && this.c2.equals(l.c2);
            }
        }

        @Override
        public int hashCode() {
            return Objects.hash(c1, c2);
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
    public double nextDouble() { return Double.parseDouble(next());}
}


class Complex {
    public long x;
    public long y;

    public Complex(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public Complex sub(Complex c) {
        return new Complex(x - c.x, y - c.y);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o instanceof Complex) {
            Complex c = (Complex) o;
            return c.x == this.x && c.y == this.y;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

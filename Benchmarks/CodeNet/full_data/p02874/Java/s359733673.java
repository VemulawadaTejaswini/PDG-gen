import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = fs.nextInt();
        List<Pair<Long, Long>> lr = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            lr.add(new Pair(fs.nextLong(), fs.nextLong()));
        }
        long max = 0;
        Collections.sort(lr, (p1, p2) -> (int) ((-(p1.s - p1.f) + (p2.s - p2.f))));
        max = Math.max(max, getMax(lr));
        out.println(max);
        out.flush();
    }

    public static long getMax(List<Pair<Long, Long>> lr) {
        long aLeft = lr.get(0).f;
        long aRight = lr.get(0).s;
        long max = 0;

        for (int a = 1; a < Math.min(lr.size(), 1000); a++) {
            int pickedIndex = a;
            long bLeft = lr.get(pickedIndex).f;
            long bRight = lr.get(pickedIndex).s;

            for (int i = 1; i < lr.size(); i++) {
                if (i == pickedIndex) {
                    continue;
                }

                // what if putting to a
                long li = lr.get(i).f;
                long ri = lr.get(i).s;
                long newALeft = Math.max(aLeft, li);
                long newARight = Math.min(aRight, ri);
                long scoreA = (newARight - newALeft) + (bRight - bLeft) + 2;

                long newBLeft = Math.max(bLeft, li);
                long newBRight = Math.min(bRight, ri);
                long scoreB = (aRight - aLeft) + (newBRight - newBLeft) + 2;

                if (scoreA >= scoreB) {
                    aLeft = newALeft;
                    aRight = newARight;
                } else {
                    bLeft = newBLeft;
                    bRight = newBRight;
                }
            }

            max = Math.max(max, (aRight - aLeft) + (bRight - bLeft) + 2);
        }
        return max;
    }


    static class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
        F f;
        S s;

        Pair() {
        }

        Pair(F f, S s) {
            this.f = f;
            this.s = s;
        }

        Pair(Pair<F, S> p) {
            f = p.f;
            s = p.s;
        }

        @Override
        public int compareTo(Pair<F, S> p) {
            if (f.compareTo(p.f) != 0) {
                return f.compareTo(p.f);
            }
            return s.compareTo(p.s);
        }

        @Override
        public int hashCode() {
            return f.hashCode() ^ s.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.f == null || this.s == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Pair p = (Pair) o;
            return this.f.equals(p.f) && this.s.equals(p.s);
        }

        @Override
        public String toString() {
            return "{" + f.toString() + ", " + s.toString() + "}";
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
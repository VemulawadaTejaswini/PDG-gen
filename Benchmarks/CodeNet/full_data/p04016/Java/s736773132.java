import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        long n = fsc.nextLong();
        long s = fsc.nextLong();
        if (s == n) {
            System.out.println(s + 1);
        } else if (s > (n + 1) / 2) {
            System.out.println(-1);
        } else {
            for (long b = 2; b <= 1000000; b++) {
                if (f(n, b) == s) {
                    System.out.println(b);
                    return;
                }
            }
            for (long x = (n - s) / 1000000; x >= 1; x--) {
                if ((n - s) % x == 0) {
                    long b = (n - s) / x + 1;
                    if (f(n, b) == s) {
                        System.out.println(b);
                        return;
                    }
                }
            }
            System.out.println(-1);
        }
    }

    public static long f(long n, long b) {
        long sum = 0;
        while (n > 0) {
            sum += n % b;
            n /= b;
        }
        return sum;
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

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int X = reader.nextInt();
        int Y = reader.nextInt();
        if ((X+Y)%3 != 0 || X > Y*2 || Y > X*2) {
            System.out.println(0);
            return;
        }

        initFactorial();
        int cnt = (X+Y)/3;
        System.out.println(combination(X+Y-cnt*2, X-cnt));
    }

    // n! (save to memory)
    static long[] factorial = new long[3000000];
    static void initFactorial() {
        factorial[0] = 1;
        for (int i=1; i<3000000; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
        }
    }

    // x^n
    static long pow(long x, long n) {
        long ans = 1;
        while (n != 0) {
            if (n % 2 == 1) ans = (ans * x) % MOD;
            x = (x * x) % MOD;
            n = n / 2;
        }
        return ans;
    }

    // nCk = n! * (k!)^(MOD-2) * ((n-k)!)^(MOD-2)
    static long combination(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (n < k || n < 0) return 0;
        long ans = ((factorial[n] * pow(factorial[k], MOD-2)) % MOD * pow(factorial[n-k], MOD-2)) % MOD;
        return ans;
    }

    // Read Class
    static class FS {
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
    
        private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
        private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
        private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
        public int nextInt() {
            return (int)nextLong();
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
            while(true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if(b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}


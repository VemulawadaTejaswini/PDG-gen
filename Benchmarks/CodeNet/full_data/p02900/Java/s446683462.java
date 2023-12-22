import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    // gcd
    static long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        if (a % b == 0) return b;
        else return gcd(b, a%b);
    }
    // get primes less than or equal to n
    static ArrayList<Long> primes(long n) {
        // DO NOT USE FOR n<2 !!!
        ArrayList<Long> primes = new ArrayList<Long>();
        primes.add(2L);
        for (long t=3; t<=n; t+=2) {
            boolean isPrime = true;
            for (int i=0; i<primes.size(); i++) {
                if (t % primes.get(i) == 0) {
                    isPrime = false;
                    break;
                }
                if (t <= Math.pow(primes.get(i), 2)) break;
            }
            if (isPrime) primes.add(t);
        }
        return primes;
    }

    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        long A = reader.nextLong();
        long B = reader.nextLong();;
        long gcd = gcd(A, B);
        solver(gcd);
    }

    public static void solver(long n) {
        int ans = 1;
        ArrayList<Long> primes = primes(1000000);
        for (long i:primes) {
            if (n == 1) break;
            boolean isDivided = false;
            while (true) {
                if (n % i == 0) {
                    isDivided = true;
                    n /= i;
                } else break;
            }
            if (isDivided) ans++;
        }
        if (n != 1) ans++;
        System.out.println(ans);
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


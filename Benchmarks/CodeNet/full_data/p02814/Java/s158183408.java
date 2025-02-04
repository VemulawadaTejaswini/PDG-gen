import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] a = new long[n];
        long l = 1;
        boolean e = false;
        boolean o = false;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            l = lcm(l, a[i]);
            if(a[i] % 4 == 0) e = true;
            else o = true;
        }

        boolean ish = true;

        for (int i = 0; i < a.length; i++) {
            if((l/2 - a[i]/2) % a[i] != 0) ish = false;
        }

        if(!ish){
            System.out.println("0");
            return;
        }

        System.out.println((m + l / 2) / l);
    }

    public static long lcm(long m, long n){
        return m * n / gcd(m, n);
    }

    public static long gcd(long m, long n){
        long t;
        if(n > m){
            long tmp = n;
            n = m;
            m = tmp;
        }
        while(m % n != 0){
            t = n;
            n = m % n;
            m = t;
        }
        return n;
    }


    private static class FastScanner {
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
}

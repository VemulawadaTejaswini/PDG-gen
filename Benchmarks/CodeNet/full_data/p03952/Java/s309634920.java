import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int N = reader.nextInt();
        int x = reader.nextInt();

        solver(N, x);
    }
    
    public static void solver(int N, int x) {
        // write logic
        if (x==1 || x==N*2-1) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
        // N = 2
        if (N == 2) {
            for (int i=1; i<=3; i++) {
                System.out.println(i);
            }
            return;
        }
        // N >= 3
        int cnt = 1;
        if (x == 2) {
            // x = 2
            // a_(N-2) = x+1
            // a_(N-1) = x
            // a_N     = x-1
            // a_(N+1) = x+2
            for (int i=0; i<N*2-1; i++) {
                if (i == N-2) System.out.println(x+1);
                else if (i == N-1) System.out.println(x);
                else if (i == N) System.out.println(x-1);
                else if (i == N+1) System.out.println(x+2);
                else {
                    if (cnt == x-1) cnt = x+3;
                    System.out.println(cnt);
                    cnt++;
                }
            }
        } else {
            // x != 2
            // a_(N-2) = x-1
            // a_(N-1) = x
            // a_N     = x+1
            // a_(N+1) = x-2
            for (int i=0; i<N*2-1; i++) {
                if (i == N-2) System.out.println(x-1);
                else if (i == N-1) System.out.println(x);
                else if (i == N) System.out.println(x+1);
                else if (i == N+1) System.out.println(x-2);
                else {
                    if (cnt == x-2) cnt = x+2;
                    System.out.println(cnt);
                    cnt++;
                }
            }
        }
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


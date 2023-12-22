import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int N = reader.nextInt();
        int[] L = new int[N];
        for (int i=0; i<N; i++) {
            L[i] = reader.nextInt();
        }
        Arrays.sort(L);

        long ans = 0;
        for (int c=N-1; 0<c; c--) {
            for (int b=c-1; 0<=b; b--) {
                int l = 0;
                int r = b-1;
                while (true) {
                    if (r < 0) break;
                    if (l == 0 && r == 0) {
                        if (L[0]+L[b] <= L[c]) {
                            r = -1;
                            break;
                        }
                    }
                    int tmp = (l+r)/2;
                    if (L[c]-L[b] < L[tmp]) {
                        if (r == tmp) break;
                        r = tmp;
                    } else {
                        if (l == tmp) break;
                        l = tmp;
                    }
                    if (r == l) break;
                }
                if (0 <= r) {
                    if (L[c] < L[b]+L[r]) {
                        ans += b-r;
                    } else if (L[c] < L[b]+L[l]) {
                        ans += b-l;
                    }
                }
            }
        }
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


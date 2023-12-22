import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int A = reader.nextInt();
        int B = reader.nextInt();
        int Q = reader.nextInt();
        long[] S = new long[A+2];
        long[] T = new long[B+2];
        S[0] = -100000000000L;
        T[0] = -100000000000L;
        S[A+1] = 100000000000L;
        T[B+1] = 100000000000L;
        for (int i=0; i<A; i++) {
            S[i+1] = reader.nextLong();
        }
        for (int i=0; i<B; i++) {
            T[i+1] = reader.nextLong();
        }
        // solve
        for (int i=0; i<Q; i++) {
            solver(reader.nextLong(), S, T);
        }
    }
    
    public static void solver(long x, long[] S, long[] T) {
        // write logic
        int sl = 0;
        int sr = S.length-1;
        int tl = 0;
        int tr = T.length-1;

        // binary search for S
        while (sr - sl != 1) {
            if (S[(sr+sl)/2] < x) {
                sl = (sr+sl) / 2;
            } else {
                sr = (sr+sl) / 2;
            }
        }

        // binary search for T
        while (tr - tl != 1) {
            if (T[(tr+tl)/2] < x) {
                tl = (tr+tl) / 2;
            } else {
                tr = (tr+tl) / 2;
            }
        }

        // check minimum route
        long ans = Long.MAX_VALUE;
        // 8 pattern
        // x->sl->tl
        ans = Math.min(ans, Math.abs(x-S[sl])+Math.abs(S[sl]-T[tl]));
        // x->sl->tr
        ans = Math.min(ans, Math.abs(x-S[sl])+Math.abs(S[sl]-T[tr]));
        // x->sr->tl
        ans = Math.min(ans, Math.abs(x-S[sr])+Math.abs(S[sr]-T[tl]));
        // x->sr->tr
        ans = Math.min(ans, Math.abs(x-S[sr])+Math.abs(S[sr]-T[tr]));
        // x->tl->sl
        ans = Math.min(ans, Math.abs(x-T[tl])+Math.abs(T[tl]-S[sl]));
        // x->tl->sr
        ans = Math.min(ans, Math.abs(x-T[tl])+Math.abs(T[tl]-S[sr]));
        // x->tr->sl
        ans = Math.min(ans, Math.abs(x-T[tr])+Math.abs(T[tr]-S[sl]));
        // x->tr->sr
        ans = Math.min(ans, Math.abs(x-T[tr])+Math.abs(T[tr]-S[sr]));

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


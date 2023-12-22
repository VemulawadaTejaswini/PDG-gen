
import java.util.*;
import java.io.*;

class Main{
    static int[] p,q;
    static int a,b,count = 0;
    static int[] perm;
    static boolean[] used;
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        p = new int[n];
        q = new int[n];
        perm = new int[n];
        used = new boolean[n];

        for (int i = 0; i < n; i++) {
            p[i] = fs.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = fs.nextInt();
        }
        dfs(0,n);
        System.out.println(Math.abs(a-b));
    }

    static void dfs(int pos,int n){
        if(pos == n){
            count++;
            boolean ok = true;
            for(int i=0;i<n;i++){
                if(p[i]!=perm[i]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                a = count;
            }
            ok = true;
            for(int i=0;i<n;i++){
                if(q[i]!=perm[i]){
                    ok = false;
                    break;
                }
            }
            if(ok){
                b = count;
            }
        }else{
            for(int i=0;i<n;i++){
                if(!used[i]){
                    perm[pos] = i+1;
                    used[i] = true;
                    dfs(pos+1,n);
                    used[i] = false;
                }
            }
        }
    }

    static class FastScanner {
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
}
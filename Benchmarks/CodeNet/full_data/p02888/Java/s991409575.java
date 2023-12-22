import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }

        long ans = 0;

        Arrays.sort(l);

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(i == j) continue;
                int ml = l[i] + l[j];
                int mpos = mbs(l, ml, j+1);
                int mans = mpos - j;
                if(mpos < 0) continue;
                // if(l[mpos] >= l[i]) mans--;
                // if(l[mpos] >= l[j]) mans--;
                if(mans < 0) mans = 0;
                ans += mans;
            }
        }

        System.out.println(ans);
    }

    public static int mbs(int[] l, int ml, int ms){
        int mmr = l.length-1;
        int mml = 0;
        int mmc = l.length / 2;
        if(mml >= mmr) return -1;
        if(ml > l[l.length-1]) return l.length-1;
        while(mmr > mml + 1){
            int mm = l[mmc];
            if(mm < ml){
                mml = mmc;
            }else{
                mmr = mmc;
            }
            mmc = (mml + mmr) / 2;
        }
        return mml;
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

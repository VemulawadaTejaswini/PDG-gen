import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long[] a = new long[n];
        String[] sa = new String[n];
        long[] sum = new long[65];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            sa[i] = "0000000000000000000000000000000000000000000000000000000000000000000"
             + Long.toBinaryString(a[i]);
            if(i != 0){
                for (int j = 0; j < sum.length; j++) {
                    if(sa[i].charAt(sa[i].length() - 1 - j) == '1') sum[j]++;
                }
            }
        }


        final long DIV = 1000000007;
        long ans = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < sum.length; j++) {
                if(sa[i].charAt(sa[i].length() - 1 - j) == '1'){
                    ans += (n - 1 - i - sum[j]) * ((1L << j) % DIV);
                }else{
                    ans += sum[j] * ((1L << j) % DIV);
                }
                ans %= DIV;
            }
            for (int j = 0; j < sum.length; j++) {
                if(sa[i+1].charAt(sa[i+1].length() - 1 - j) == '1') sum[j]--;
            }
        }
        System.out.println(ans);
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

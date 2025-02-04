import java.util.*;
import java.io.*;

class Main{
    static long MOD=1000000007;
    static long[] pow3;
    static char[] d;
    static int l;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        d=fsc.next().toCharArray();
        l=d.length;
        fsc.close();
        pow3=new long[l+1];
        for(int i=0;i<=l;i++){
            if(i==0) pow3[i]=1;
            else if(i==1) pow3[i]=3;
            else pow3[i]=(pow3[i/2]*pow3[i-i/2])%MOD;
        }
        System.out.println(solve(0));
    }
    static long solve(int k){
        long res=0;
        if(k==l) return 1;

        if(d[k]=='1'){
            res+=pow3[l-k-1];
            res+=2*solve(k+1);
        }
        else res+=solve(k+1);
        res%=MOD;
        return res;
    }
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
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
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}
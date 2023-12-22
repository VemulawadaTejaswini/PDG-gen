import java.util.*;
import java.io.*;

public class Main{
    static long[] pow2;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long x=fsc.nextLong();
        fsc.close();
        pow2=new long[n+3];
        initPow2();
        int level=n;
        long l=1, r=pow2[n+2]-3, m=(l+r)/2;
        long ans=0;
        boolean flg=true;
        while(flg){
            if(x==l) flg=false;
            else if(x<m){
                l+=1; r=m-1; m=(l+r)/2;
                level--;
            }
            else if(x==m){
                ans+=pow2[level];
                flg=false;
            }
            else if(x<r){
                l=m+1; r-=1; m=(l+r)/2;
                ans+=pow2[level];
                level--;
            }
            else if(x==r){
                ans+=2*pow2[level]-1;
                flg=false;
            }
        }
        System.out.println(ans);
    }
    static void initPow2(){
        for(int i=0;i<pow2.length;i++){
            if(i==0) pow2[i]=1;
            else if(i==1) pow2[i]=2;
            else pow2[i]=pow2[i/2]*pow2[i-(i/2)];
        }
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
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long c=fsc.nextLong();
        long[][] xv=new long[n+1][2];
        for(int i=1;i<=n;i++){
            long x=fsc.nextLong();
            long v=fsc.nextLong();
            xv[i][0]=x;
            xv[i][1]=v;
        }
        fsc.close();
        long[] accumV=new long[n+1];
        for(int i=1;i<=n;i++){
            accumV[i]=accumV[i-1]+xv[i][1];
        }
        long max=Long.MIN_VALUE;
        long[] counterClockMax=new long[n+2];
        long[] clockMax=new long[n+2];
        for(int i=1;i<=n;i++){
            counterClockMax[i]=Math.max(accumV[i]-xv[i][0], counterClockMax[i-1]);
            clockMax[n-i+1]=Math.max((accumV[n]-accumV[n-i])-(c-xv[n-i+1][0]), clockMax[n-i+2]);
            max=Math.max(max, counterClockMax[i]);
            max=Math.max(max, clockMax[n-i+1]);
        }
        long[] rightLeft=new long[n+1];
        long[] leftRight=new long[n+1];
        for(int i=1;i<=n;i++){
            rightLeft[i]=accumV[i]-2*xv[i][0]+clockMax[i+1];
            leftRight[n-i+1]=(accumV[n]-accumV[n-i])-2*(c-xv[n-i+1][0])+counterClockMax[n-i];
            max=Math.max(max, rightLeft[i]);
            max=Math.max(max, leftRight[n-i+1]);
        }

        System.out.println(max);
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

import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        char[] c=fsc.next().toCharArray();
        fsc.close();
        int[] acf=new int[n];
        int[] acb=new int[n];
        for(int i=0;i<n;i++){
            if(c[i]=='W'){
                acf[i]=i>0?acf[i-1]+1:1;
            }
            else{
                acf[i]=i>0?acf[i-1]:0;
            }

            if(c[n-i-1]=='E'){
                acb[n-i-1]=i>0?acb[n-i]+1:1;
            }
            else{
                acb[n-i-1]=i>0?acb[n-i]:0;
            }
        }
        int min=n;
        for(int i=0;i<n;i++){
            int count;
            if(i==0) count=acb[1];
            else if(i==n-1) count=acf[n-2];
            else count=acb[i+1]+acf[i-1];
            min=Math.min(min, count);
            //System.out.println("i:"+i+", count:"+count);
        }
        System.out.println(min);
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

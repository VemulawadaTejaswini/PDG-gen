import java.util.*;
import java.io.*;

public class Main{
    static long[] pow2;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long k=fsc.nextLong();
        char[][] ch=new char[n][41];
        for(int i=0;i<n;i++)
            ch[i]=String.format("%41s", Long.toBinaryString(fsc.nextLong())).replace(' ', '0').toCharArray();
        fsc.close();
        pow2=new long[41];
        initPow2();
        long[] d=new long[41];
        char[] kc=String.format("%41s", Long.toBinaryString(k)).replace(' ', '0').toCharArray();
        boolean under=false;
        long ans=0;
        for(int j=0;j<41;j++){
            for(int i=0;i<n;i++) if(ch[i][j]=='0') d[j]++;
            if(kc[j]=='0'){
                if(!under) d[j]=n-d[j];
                else d[j]=Math.max(d[j],n-d[j]);
            }
            else{
                if(d[j]<=n-d[j]) under=true;
                d[j]=Math.max(d[j],n-d[j]);
            }
            //System.out.print(d[j]+" ");
            ans+=d[j]*pow2[40-j];
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
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[][] ab=new long[2*n][2];
        long[] a=new long[n];
        for(int i=0;i<n;i++) a[i]=fsc.nextLong();
        long[] b=new long[n];
        for(int i=0;i<n;i++) b[i]=fsc.nextLong();
        fsc.close();
        for(int i=0;i<n;i++){
            ab[i][0]=a[i];
            ab[i][1]=0;
        }
        for(int i=0;i<n;i++){
            ab[n+i][0]=b[i];
            ab[n+i][1]=1;
        }
        Arrays.sort(ab, (u, v)->u[0]>v[0]?1:u[0]<v[0]?-1:u[1]>v[1]?1:u[1]<v[1]?-1:0);
        int ac=0, bc=0;
        for(int i=0;i<2*n;i++){
            if(ab[i][1]==0) ac++;
            else bc++;
            if(ac<bc){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
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
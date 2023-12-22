import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[][] ta=new long[n][2];
        long t=0, a=0;
        for(int i=0;i<n;i++){
            long ti=fsc.nextLong();
            long ai=fsc.nextLong();
            ta[i][0]=ti;
            ta[i][1]=ai;
            if(i==0){
                t=ti;
                a=ai;
            } else{
                for(int i=1;;i++){
                    if(ti*i>=t&& ai*i>=a){
                        t=ti*i;
                        a=ai*i;
                        break;
                    }
                }
            }
            
        }
        fsc.close();
        System.out.println(t+a);
    }

    // ax+by=gcd(a, b)
    // return [gcd(a, b), x, y]
    static long[] extGCD(long a, long b) {
        long[] ret=new long[3];
        if (b == 0) {
            ret[1] = 1;
            ret[2] = 0;
            ret[0] = a;
            return ret;
        }
        long[] midRet = extGCD(b, a%b);
        ret[0] = midRet[0];
        ret[2] = midRet[1] - a/b * midRet[2];
        ret[1] = midRet[2];
        return ret;
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

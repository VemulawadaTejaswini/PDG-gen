import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int q=fsc.nextInt();
        long[][] ab=new long[q][2];
        for(int i=0;i<q;i++){
            long a=fsc.nextLong();
            long b=fsc.nextLong();
            ab[i][0]=a;
            ab[i][1]=b;
        }
        fsc.close();
        for(int i=0;i<q;i++){
            long a=ab[i][0];
            long b=ab[i][1];
            if(a*b<4) {
                System.out.println(0);
                continue;
            } else if(a*b==4) {
                System.out.println(1);
                continue;
            } else if(a*b<=6) {
                System.out.println(2);
                continue;
            } else if(a*b==7) {
                System.out.println(3);
                continue;
            }
            long pass=0;
            long fail=1000000000;
            long key=a*b;
            while(fail-pass>1){
                long mid=pass+(fail-pass)/2;
                if(mid*mid<key) pass=mid;
                else fail=mid;
            }
            long ans=2*pass;
            if(pass*(pass+1)>=key){
                ans--;
            }
            if(a<=pass || b<=pass){
                ans--;
            }
            System.out.println(ans);
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

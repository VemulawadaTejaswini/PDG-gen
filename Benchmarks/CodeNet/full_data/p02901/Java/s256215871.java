import java.util.*;
import java.io.*;

class Main{
    static long dp[][];
    static long price[];
    static HashSet<Integer> keys[];
    static int n, m;
    static long MAX=1000000000;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        n=fsc.nextInt(); 
        m=fsc.nextInt();
        price=new long[m];
        keys=new HashSet[m];
        for(int i=0;i<m;i++){
            price[i]=fsc.nextLong();
            int b=fsc.nextInt();
            keys[i]=new HashSet<>(b);
            for(int j=0;j<b;j++) keys[i].add(fsc.nextInt()-1);
        }
        fsc.close();
        dp=new long[m][1<<n];
        long ans=dp(0, (1<<n)-1);
        ans=ans<MAX?ans:-1;
        System.out.println(ans);
    }
    static long dp(int k, int close){
        if(k==m) return close==0?0:MAX;
        if(dp[k][close]>0) return dp[k][close];
        long ret=dp(k+1, close);
        int nextClose=close;
        for(int key:keys[k]){
            if((close&(1<<key))!=0) nextClose-=(1<<key);
        }
        return dp[k][close]=Math.min(ret, dp(k+1, nextClose)+price[k]);
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
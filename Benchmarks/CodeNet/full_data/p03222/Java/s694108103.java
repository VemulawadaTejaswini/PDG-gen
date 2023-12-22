import java.util.*;
import java.io.*;

public class Main{
    static final long MOD=1000000007;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int h=fsc.nextInt(), w=fsc.nextInt(), k=fsc.nextInt()-1;
        fsc.close();
        if(w==1){
            System.out.println(1);
            System.exit(0);
        }
        int[] line=new int[w];
        for(int i=0;i<w;i++){
            line[i]=0;
            for(int j=0;j<w;j++) line[i]+=comb(i-j+1, j);
        }
        long[][] dp=new long[h+1][w];
        for(int i=0;i<=h;i++) for(int j=0;j<w;j++)
            if(i==0) dp[i][j]=j==0?1:0;
            else{
                if(0<j && j<w-1) dp[i][j]=dp[i-1][j]*line[j-1]*line[w-j-2]+dp[i-1][j-1]*line[Math.max(0,j-2)]*line[w-j-2]+dp[i-1][j+1]*line[j-1]*line[Math.max(0,w-j-3)];
                else if(j==0) dp[i][j]=dp[i-1][j]*line[w-j-2]+dp[i-1][j+1]*line[Math.max(0,w-j-3)];
                else dp[i][j]=dp[i-1][j]*line[j-1]+dp[i-1][j-1]*line[Math.max(0,j-2)];
                dp[i][j]%=MOD;
            }
        System.out.println(dp[h][k]);
    }
    static long comb(int n, int r){
        if(n<r) return 0;
        r=Math.min(r, n-r);
        long res=1;
        for(int d=1;d<=r;d++){
            res*=n;
            n--;
            res/=d;
        }
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
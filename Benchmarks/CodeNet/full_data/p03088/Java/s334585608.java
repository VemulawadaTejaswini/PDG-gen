import java.util.*;
import java.io.*;

public class Main{
    static long dp[][][][];
    static final long MOD=1_000_000_007;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        fsc.close();
        dp=new long[104][4][4][4];
        long ans=dp(n+3, 3, 3, 3);
        System.out.println(ans);
    }
    static long dp(int i, int l3, int l2, int l1){
        if(dp[i][l3][l2][l1]>0) return dp[i][l3][l2][l1];
        if(i==3){
            if(l3==0 && l2==1 && l1==2) return 0;
            if(l3==0 && l2==2 && l1==1) return 0;
            if(l3==1 && l2==0 && l1==2) return 0;
            return dp[i][l3][l2][l1]=1;
        }
        if(i<3) return dp[i][l3][l2][l1]=1;
        long ret=0;
        //g(c)(c) or (c)g(c)
        if((l3==1 && (l2==2 || l1==2)) || (l2==1 && (l3==2 || l1==2))){
            for(int j=0;j<4;j++){
                if(j!=0) ret+=dp(i-1, j, l3, l2);
            }
        }
        else if(l3==0 && l2==2){
            for(int j=0;j<4;j++){
                if(j!=1) ret+=dp(i-1, j, l3, l2);
            }
        }
        else{
            for(int j=0;j<4;j++){
                ret+=dp(i-1, j, l3, l2);
            }
        }
        return dp[i][l3][l2][l1]=ret%MOD;
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
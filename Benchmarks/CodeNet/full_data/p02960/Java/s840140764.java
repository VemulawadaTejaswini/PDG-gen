import java.util.*;
import java.io.*;

class Main{
    static final long MOD=1000000007;
    static long[][][] dp2;
    static boolean[][][] bl;
    static long[][] dp;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        char[] ch=fsc.next().toCharArray();
        fsc.close();
        int l=ch.length;
        int hp=0,hn=0,tp=0,tn=0,op=0,on=0;
        int x=0;
        for(int i=0;i<l;i++){
            int d=(l-i-1)%6;
            if(d==0||d==3){
                if(ch[i]=='?'){
                    if(d==0) op++;
                    else on++;
                }
                else{
                    if(d==0) x+=Integer.parseInt(String.valueOf(ch[i]));
                    else x-=Integer.parseInt(String.valueOf(ch[i]));
                }
            }
            else if(d==1||d==4){
                if(ch[i]=='?'){
                    if(d==1) tp++;
                    else tn++;
                }
                else{
                    if(d==1) x-=3*Integer.parseInt(String.valueOf(ch[i]));
                    else x+=3*Integer.parseInt(String.valueOf(ch[i]));
                }
            }
            else{
                if(ch[i]=='?'){
                    if(d==2) hp++;
                    else hn++;
                }
                else{
                    if(d==2) x-=4*Integer.parseInt(String.valueOf(ch[i]));
                    else x+=4*Integer.parseInt(String.valueOf(ch[i]));
                }
            }
        }
        x%=13;
        if(x<0) x+=13;
        x=5-x;
        if(x<0) x+=13;
        int[] qs={hp,hn,tp,tn,op,on};
        int max=0;
        for(int q:qs) max=Math.max(max,q);
        dp=new long[max+1][13];
        for(int i=0;i<=max;i++){
            for(int j=0;j<13;j++){
                if(i==0){
                    dp[i][j]=j==0?1:0;
                    continue;
                }
                for(int k=0;k<10;k++){
                    dp[i][j]+=dp[i-1][j>=k?j-k:j-k+13];
                    dp[i][j]%=MOD;
                }
            }
        }
        long res=0;
        for(int a=0;a<13;a++){
            for(int b=0;b<13;b++){
                for(int c=0;c<13;c++){
                    for(int d=0;d<13;d++){
                        for(int e=0;e<13;e++){
                            for(int f=0;f<13;f++){
                                int r=(-4*a+4*b-3*c+3*d+e-f)%13;
                                if(r<0) r+=13;
                                if(r==x){
                                    long ab=(dp[hp][a]*dp[hn][b])%MOD;
                                    long cd=(dp[tp][c]*dp[tn][d])%MOD;
                                    long ef=(dp[op][e]*dp[on][f])%MOD;
                                    res+=(((ab*cd)%MOD)*ef)%MOD;
                                    res%=MOD;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(res);
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
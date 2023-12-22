import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int h=fsc.nextInt(), w=fsc.nextInt();
        int[][] a=new int[h][w];
        int[][] b=new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                a[i][j]=fsc.nextInt();
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                b[i][j]=fsc.nextInt();
                if(a[i][j]<b[i][j]){
                    a[i][j]=b[i][j]-a[i][j];
                    b[i][j]=0;
                }
                else{
                    a[i][j]-=b[i][j];
                    b[i][j]=0;
                }
            }
        }
        fsc.close();
        boolean[][][] dp=new boolean[h][w][80*80+1];
        dp[0][0][a[0][0]]=true;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                for(int k=0;k<=80*80;k++){
                    if(dp[i][j][k]){
                        if(i<h-1 && j<w-1){
                            if(k+a[i+1][j]<=80*80){
                                dp[i+1][j][k+a[i+1][j]]=true;
                            }
                            if(k-a[i+1][j]<0){
                                dp[i+1][j][-(k-a[i+1][j])]=true;
                            }
                            else{
                                dp[i+1][j][k-a[i+1][j]]=true;
                            }
                            if(k+a[i][j+1]<=80*80){
                                dp[i][j+1][k+a[i][j+1]]=true;
                            }
                            if(k-a[i][j+1]<0){
                                dp[i][j+1][-(k-a[i][j+1])]=true;
                            }
                            else{
                                dp[i][j+1][k-a[i][j+1]]=true;
                            }
                        }
                        else if(i<h-1 && j==w-1){
                            if(k+a[i+1][j]<=80*80){
                                dp[i+1][j][k+a[i+1][j]]=true;
                            }
                            if(k-a[i+1][j]<0){
                                dp[i+1][j][-(k-a[i+1][j])]=true;
                            }
                            else{
                                dp[i+1][j][k-a[i+1][j]]=true;
                            }
                        }
                        else if(i==h-1 && j<w-1){
                            if(k+a[i][j+1]<=80*80){
                                dp[i][j+1][k+a[i][j+1]]=true;
                            }
                            if(k-a[i][j+1]<0){
                                dp[i][j+1][-(k-a[i][j+1])]=true;
                            }
                            else{
                                dp[i][j+1][k-a[i][j+1]]=true;
                            }
                        }
                        else{
                            System.out.println(k);
                            return;
                        }
                    }
                }
            }
        }
        for(int i=0;i<h;i++) for(int j=0;j<w;j++) for(int k=0;k<=80;k++){
            System.out.println(i+" "+j+" "+k+" "+dp[i][j][k]);
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

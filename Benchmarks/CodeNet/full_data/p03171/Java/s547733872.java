import java.util.*;
import java.io.*;

class Main{
    static int n;
    static long[] a;
    static long[][] dp;
    static long inf = -1000000000000000L;
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        a = new long[n];
        for(int i=0;i<n;i++)a[i] = fs.nextLong();

        dp = new long[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = inf;
            }
            dp[i][i] = a[i];
        }
        System.out.println(dfs(0,n-1,1));
    }

    public static long dfs(int left,int right,int turn){
        

        if(left==right){
            if(turn==1){
                return dp[left][right];
            }else{
                return -dp[left][right];
            }
            
        }else{
            if(dp[left][right]!=inf)return dp[left][right];
            if(turn==1){
                long res = a[left] + dfs(left+1,right,0);
                res = Math.max(res,a[right]+ dfs(left,right-1,0));
                return dp[left][right] = res;
            }else{
                long res = -a[left] + dfs(left+1,right,1);
                res = Math.min(res,-a[right] + dfs(left,right-1,1));
                return dp[left][right] = res;
            }
        }
    }
    static class FastScanner{
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte(){
            if(ptr < buflen){
                return true;
            }else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen <= 0){
                    return false;
                }
            }
            return true;
        }

        private int readByte(){
            if(hasNextByte())return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c){
            return 33<=c && c<=126;
        }

        public boolean hasNext(){
            while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
            return hasNextByte();
        }

        public String next(){
            if(!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)){
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong(){
            if(!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if(b == '-'){
                minus = true;
                b = readByte();
            }
            if(b < '0' || '9' < b){
                throw new NumberFormatException();
            }
            while(true){
                if('0' <= b && b<='9'){
                    n*=10;
                    n+=b-'0';
                }else if(b==-1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt(){
            long nl = nextLong();
            if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
            return (int)nl;
        }
        public double nextDouble(){return Double.parseDouble(next());}
    }
}
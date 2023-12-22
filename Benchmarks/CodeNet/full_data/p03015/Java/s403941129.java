
import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        char[] L = fs.next().toCharArray();
        int n = L.length;
        int mod = 1000000007;
        long[][] dp = new long[n+1][2];
        for(int i=0;i<n;i++){
            dp[i][0] = dp[i][1] = -1;
        }
        dp[0][0] = 1;
        for(int i=0;i<n;i++){
            if(L[i]=='1'){

                if(dp[i][1]!=-1){
                    if(dp[i+1][1]==-1)dp[i+1][1] = dp[i][1]*3;
                    else dp[i+1][1] += dp[i][1]*3;
                    dp[i+1][1]%=mod;
                }
                if(dp[i][0]!=-1){
                    if(dp[i+1][1]==-1)dp[i+1][1] = dp[i][0];
                    else dp[i+1][1] += dp[i][0];
                    dp[i+1][1]%=mod;
                }
                if(dp[i][0]!=-1){
                    if(dp[i+1][0]==-1)dp[i+1][0] = dp[i][0]*2;
                    else dp[i+1][0] += dp[i][0]*2;
                    dp[i+1][0]%=mod;
                }
            }else{
                if(dp[i][1]!=-1){
                    if(dp[i+1][1]==-1)dp[i+1][1] = dp[i][1]*3;
                    else dp[i+1][1] += dp[i][1]*3;
                    dp[i+1][1]%=mod;
                }
                
                if(dp[i][0]!=-1){
                    if(dp[i+1][0]==-1)dp[i+1][0] = dp[i][0];
                    else dp[i+1][0] += dp[i][0];
                    dp[i+1][0]%=mod;
                }
            }
        }
        System.out.println((dp[n][0]+dp[n][1])%mod);
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
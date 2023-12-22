import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int a=fsc.nextInt(), b=fsc.nextInt(), c=fsc.nextInt();
        int d=fsc.nextInt(), e=fsc.nextInt(), f=fsc.nextInt();
        fsc.close();
        int[][] dp=new int[f+1][f+1];
        boolean[][] visited=new boolean[f+1][f+1];
        visited[0][0]=true;
        double max=0;
        int maxg=0; int maxw=0;
        for(int g=0;g<=f;g++){
            for(int w=0;w<=g;w++){
                if(100*(dp[g][w]) > e*w) continue;
                if(!visited[g][w]) continue;
                if(g+100*a<=f){
                    dp[g+100*a][w+100*a]=Math.max(dp[g][w], dp[g+100*a][w+100*a]);
                    visited[g+100*a][w+100*a]=true;
                }
                if(g+100*b<=f){
                    dp[g+100*b][w+100*b]=Math.max(dp[g][w], dp[g+100*b][w+100*b]);
                    visited[g+100*b][w+100*b]=true;
                }
                if(g+c<=f && 100*(dp[g][w]+c) <= e*w){
                    dp[g+c][w]=Math.max(dp[g+c][w], dp[g][w]+c);
                    if((double)dp[g+c][w]/(w+dp[g+c][w]) > max){
                        max=(double)dp[g+c][w]/(w+dp[g+c][w]);
                        maxg=g+c;
                        maxw=w;
                    }
                    visited[g+c][w]=true;
                }
                if(g+d<=f && 100*(dp[g][w]+d) <= e*w){
                    dp[g+d][w]=Math.max(dp[g+d][w], dp[g][w]+d);
                    if((double)dp[g+d][w]/(w+dp[g+d][w]) > max){
                        max=(double)dp[g+d][w]/(w+dp[g+d][w]);
                        maxg=g+d;
                        maxw=w;
                    }
                    visited[g+d][w]=true;
                }
            }
        } 
        System.out.println(maxg+" "+dp[maxg][maxw]);
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

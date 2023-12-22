
import java.util.*;
import java.io.*;

class Main{
    static int n,k;
    static List<List<Integer>> graph;
    static int mod = 1000000007;
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        k = fs.nextInt();
        graph = new ArrayList<>();
        for(int i=0;i<n;i++)graph.add(new LinkedList<>());

        int a,b;
        for(int i=0;i<n-1;i++){
            a = fs.nextInt()-1;
            b = fs.nextInt()-1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        System.out.println(k*dfs(0,0,-1)%mod);
    }
    static long dfs(int depth,int v,int par){
        long res = 1 ,remainColor;
        if(depth==0){
            remainColor = k-1;
        }else{
            remainColor = k-2;
        }
        for(Integer i: graph.get(v)){
            if(i==par)continue;
            res*=remainColor*dfs(depth+1,i,v)%mod;
            res%=mod;
            remainColor--;
        }
        return res;
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
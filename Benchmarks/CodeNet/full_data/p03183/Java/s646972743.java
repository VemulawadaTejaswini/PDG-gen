import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        //Scanner sc = new Scanner();
        Reader in = new Reader();
        Main solver = new Main();
        solver.solve(out, in);
        out.flush();
        out.close();
 
    }
 
    //<>
    // 
    
    static int maxn = (int)1e4+5;
    static long mod=998244353 ;
    static int n,m,k;
    
    // dp[i] - the maximum value we can obtain such that
    //          the capacity is equal to i.
    
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        
        Node[] arr = new Node[n];
        for(int i=0;i<n;i++)
            arr[i] = new Node(in.nextInt(),in.nextInt(),in.nextInt());
        
        Arrays.sort(arr);
        
        long[] dp = new long[maxn];
        for(int i=0;i<maxn;i++)
            dp[i] = -5000L;
        
        for(int i=0;i<n;i++){
            for(int j=arr[i].w;j<maxn;j++){
                int temp = Math.min(j-arr[i].w,arr[i].s);
                dp[temp] = Math.max(dp[temp],dp[j]+arr[i].v);
            }
            dp[arr[i].s] = Math.max(dp[arr[i].s],arr[i].v);
        }
        
        long ans = 0L;
        for(int i=0;i<maxn;i++)
            ans = Math.max(ans,dp[i]);
            
        out.println(ans);
        
        
    }
    
    static class Node implements Comparable<Node>{
        int w,s,v;
        
        Node(int w,int s,int v){
            this.w = w;
            this.s = s;
            this.v = v;
        }
        
        public int compareTo(Node o){
            return o.w+o.s-this.w-this.s;
        }
    }
    
    static class Reader {
 
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
 
        public Reader() {
            this(System.in);
        }
 
        public Reader(InputStream is) {
            mIs = is;
        }
 
        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
 
        }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
 
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
 
        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
 
    }
}
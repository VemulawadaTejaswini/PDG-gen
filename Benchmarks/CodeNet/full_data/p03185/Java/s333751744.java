import java.util.*;
import java.io.*;
import java.math.*;
 
public class Ideone {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        //Scanner sc = new Scanner();
        Reader in = new Reader();
        Ideone solver = new Ideone();
        solver.solve(out, in);
        out.flush();
        out.close();
 
    }
 
 
 
    static int maxn = (int)1e6+5;
    static long mod=(int)1e9+7 ;
    static int n,m;
    static long k,C;
 
    static int INF = (int)1e9;
 
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        C = in.nextLong();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        Deque<Line> dq = new LinkedList<Line>();
        dq.add(new Line(-2*arr[0],(long)arr[0]*arr[0]));
        
        long tmp=0,ans=Long.MAX_VALUE-INF;
        Line first,last;
        for(int i=1;i<n;i++){
            while(dq.size()>=2){
                first = dq.removeFirst();
                if(first.eval(arr[i])<dq.peekFirst().eval(arr[i])){
                    dq.addFirst(first);
                    break;
                }
            }
            
            tmp = dq.peekFirst().eval(arr[i]);
            ans =Math.min(ans,tmp+(long)arr[i]*arr[i]+C);
            Line nw = new Line(-2*arr[i],tmp+2*(long)arr[i]*arr[i]+C);
            
            while(dq.size()>=2){
                last = dq.removeLast();
                if(last.inter(dq.peekLast())<nw.inter(last)){
                    dq.addLast(last);
                    break;
                }
            }
            dq.addLast(nw);
            if(i==n-1) out.println(tmp+(long)arr[i]*arr[i]+C);   
        }
    }
 
    //<>
    
    static class Line {
        long m,y;
        
        Line(long m,long y){
            this.m = m;
            this.y = y;
        }
        
        long eval(int x){
            return m*x+y;
        }
        
        double inter(Line o){
            return (double)(o.y-this.y)/(double)(this.m-o.m);
        }
    }
    
    static class Node implements Comparable<Node>{
        int x,y;
        long a;
        
        Node(int x,int y,long a){
            this.x = x;
            this.y = y;
            this.a = a;
        }
        
        public int compareTo(Node o){
            return this.x-o.x;
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

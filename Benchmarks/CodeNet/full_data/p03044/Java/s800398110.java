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
 
    static int INF = (int)1e9+5;
    static int maxn = (int)1e6+5;
    static int mod=(int)1e9+7 ;
    static int n,m,k,t,q,x;
    
    static ArrayList<Node> adj[];
    static long[] dist;
    
    void solve(PrintWriter out, Reader in) throws IOException{   
        n = in.nextInt();
        
        adj = new ArrayList[n+1];
        for(int i=1;i<=n;i++) adj[i] = new ArrayList<Node>();
        
        int u,v,d;
        for(int i=0;i<n-1;i++){
            u = in.nextInt();
            v = in.nextInt();
            d = in.nextInt();
            adj[u].add(new Node(v,d));
            adj[v].add(new Node(u,d));
        }
        
        dist = new long[n+1];
        
        DFS(1,0);
        
        for(int i=1;i<=n;i++) out.println(dist[i]);
    }
    
    //<>
    
    static void DFS(int s,int p){
        
        for(Node e:adj[s]){
            if(e.to==p) continue;
            
            dist[e.to]=(dist[s]+e.w)%2;
            DFS(e.to,s);
        }
        return;
    }
    
    static class Node{
        int to,w;
        
        Node(int to,int w){
            this.to = to;
            this.w = w;
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
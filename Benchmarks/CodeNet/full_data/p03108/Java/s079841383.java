import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    // int mod = 998244353;
    long inf = Long.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int m = ni();
        int[][] edge = new int[m][2];
        for(int i = 0; i < m; i++){
            edge[i][0] = ni()-1;
            edge[i][1] = ni()-1;
        }
        UnionFind uf = new UnionFind(n);
        long ans = (long)n*(n-1)/2;
        long[] ret = new long[m];
        ret[m-1] = ans;
        for(int i = m-1; i > 0; i--){
            int a = edge[i][0];
            int b = edge[i][1];
            if(uf.same(a,b)){
                ret[i-1] = ans;
                // out.println(ans);
                continue;
            }
            long as = uf.size[uf.find(a)];
            long bs = uf.size[uf.find(b)];
            // out.println(a+" "+b);
            // out.println(as+" "+bs);
            uf.union(a,b);
            long cs = uf.size[uf.find(a)];
            // out.println(cs);
            ans += as*(as-1)/2;
            ans += bs*(bs-1)/2;
            ans -= cs*(cs-1)/2;
            // out.println(ans);
            ret[i-1] = ans;
        }
        for(int i = 0; i < m; i++){
            out.println(ret[i]);
        }

    }

    public static class UnionFind{  
        int parent[];
        int rank[];
        int size[];
        
        public UnionFind(int n){
            parent = new int[n];
            rank   = new int[n];
            size = new int[n];

            for(int i = 0;i < n;i++){
                parent[i] = i;
                rank[i]   = 0;
                size[i] = 1;
            }        
        }
        
        boolean same(int x,int y){
            return find(x) == find(y);
        }
        
        public int find(int x){
            if(parent[x] == x){
               return x;
            }else{
               return parent[x] = find(parent[x]);   
            }        
        }
          
        public void union(int x,int y){
            x = find(x);
            y = find(y);
            
            if(x != y){
                if(rank[x] > rank[y]){
                   parent[y] = x; 
                   size[x] += size[y];
                }else{
                   parent[x] = y;
                   size[y] += size[x];
                   if(rank[x] == rank[y]){
                       rank[y]++;
                   }
                }            
            }
            
            return;
        }
        
        public int count(int n){
            int ret = 0;
            for(int i = 0;i < n;i++){
                if(i == find(i)){
                    ret++;
                }
            }
            return ret;
        }
          
      } 
   
    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b != ' ')){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
 
}

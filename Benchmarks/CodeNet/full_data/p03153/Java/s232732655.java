import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    ArrayList<int[]> edge = new ArrayList<>();

    void solve(){
        int n = ni();
        long d = nl();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = nl();
        }
        candidate_edges(0, n-1, a, d);
        long[][] e = new long[edge.size()][3];
        int j = 0;
        for(int[] r : edge){
            e[j][0] = r[0];
            e[j][1] = r[1];
            e[j][2] = Math.abs(r[0]-r[1])*d + a[r[0]] + a[r[1]];
            j++;
        }
        Arrays.sort(e, new Comparator<long[]>() {
            public int compare(long[] a, long[] b) {
                return Long.compare(a[2],b[2]);
            }
        });

        UnionFind uf = new UnionFind(n);
        long ans = 0;
        int size = 0;
        for(int i = 0; i < edge.size(); i++){
            if(uf.same((int)e[i][0], (int)e[i][1])) continue;
            ans += e[i][2];
            uf.union((int)e[i][0], (int)e[i][1]);
            size++;
            if(size==n-1) break;
        }
        out.println(ans);
    }

    public static class UnionFind{  
        int parent[];
        int rank[];
        
        public UnionFind(int n){
            parent = new int[n];
            rank   = new int[n];
            
            for(int i = 0;i < n;i++){
                parent[i] = i;
                rank[i]   = 0;
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
                }else{
                   parent[x] = y;
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

    void candidate_edges(int s, int t, long[] a, long d){
        if(t<=s) return;
        int mid = (s+t)/2;
        int id = -1;
        long dist = inf;
        for(int i = mid+1; i <= t; i++){
            long tmp = Math.abs(i-s)*d + a[i] + a[s];
            if(tmp<=dist){
                dist = tmp;
                id = i;
            }
        }
        for(int i = s; i <= mid; i++){
            edge.add(new int[]{i,id});
        }
        id = -1;
        dist = inf;
        for(int i = s; i <= mid; i++){
            long tmp = Math.abs(i-t)*d + a[i] + a[t];
            if(tmp<=dist){
                dist = tmp;
                id = i;
            }
        }
        for(int i = mid+1; i <= t; i++){
            edge.add(new int[]{i,id});
        }
        candidate_edges(s,mid,a,d);
        candidate_edges(mid+1,t,a,d);
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

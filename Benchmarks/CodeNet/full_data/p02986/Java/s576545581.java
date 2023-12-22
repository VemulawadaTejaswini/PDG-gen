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
    // long inf = Long.MAX_VALUE/2;
    int inf = Integer.MAX_VALUE/2;

    int MAX_N=100000;
    int MAX_LOG=(int)(Math.log(MAX_N)/Math.log(2))+1;
    int n;
    ArrayList<Integer>[]path;
    int root=0;
    //parent[k][v]:=頂点vから2^k回親を辿った時に到達する頂点
    int[][]parent;
    int[]depth;
    HashMap<Long, int[]> map = new HashMap<>();
    int[] num;
    boolean[] seen;

    void solve(){
        n = ni();
        int q = ni();

        path = new ArrayList[n];
        for(int i = 0; i < n; i++){
            path[i] = new ArrayList<>();
        }

        for(int i = 0; i < n-1; i++){
            int s = ni()-1;
            int t = ni()-1;
            int c = ni();
            int d = ni();
            path[s].add(t);
            path[t].add(s);
            long res = s*1000000000l+t;
            long res2 = t*1000000000l+s;
            map.put(res,new int[]{c,d});
            map.put(res2,new int[]{c,d});
        }

        num = new int[n];
        seen = new boolean[n];
        center(root);
        System.err.println(root);

        parent=new int[MAX_LOG][n];
	    depth=new int[n];
	    init(n);

        for(int i = 0; i < q; i++){
            int x = ni();
            int y = ni();
            int u = ni()-1;
            int v = ni()-1;
            // out.println(u+" "+v);
            int r = lca(u,v);
            int d1 = dist(u,r,x,y);
            int d2 = dist(v,r,x,y);
            out.println(d1+d2);
        }
    }

    int center(int cur){
        int sum = 0;
        seen[cur] = true;
        boolean flag = true;
        for(int e : path[cur]){
            if(seen[e]) continue;
            int res = center(e);
            if(res>n/2) flag = false;
        }
        if(flag&&(n-sum)<=n/2){
            root = cur;
        }
        return sum;
    }

    int dist(int s, int t, int x, int y){
        // out.println(s+" "+t+" "+x+" "+y);
        int cur = s;
        int sum = 0;
        while(cur!=t){
            int p = parent[0][cur];
            long res = cur*1000000000l+p;
            int[] tmp = map.get(res);
            // out.println(tmp[0]+" "+tmp[1]);
            int c = tmp[0];
            int d = tmp[1];
            if(c==x){
                d = y;
            }
            sum += d;
            cur = p;
        }
        return sum;
    }

   void dfs(int v,int p,int d) {
	   parent[0][v]=p;
	   depth[v]=d;
	   for(int i=0;i<path[v].size();i++) {
		   if(path[v].get(i)!=p) {
			   dfs(path[v].get(i), v, d+1);
		   }
	   }
   }
   //初期化
   void init(int V) {
	   //parent[0]とdepthを初期化する
	   dfs(root,-1,0);
	   //parentを初期化する
	   for(int k=0;k+1<MAX_LOG;k++) {
		   for(int v=0;v<V;v++) {
			   if(parent[k][v]<0)parent[k+1][v]=-1;
			   else parent[k+1][v]=parent[k][parent[k][v]];
		   }
	   }
   }
   
   //uとvのLCAを求める
   int lca(int u, int v) {
	   //uとvの深さが同じになるまで親をたどる
	   if(depth[u]>depth[v]) {
		   int temp=u;
		   u=v;
		   v=temp;
	   }
	   for(int k=0;k<MAX_LOG;k++) {
		   if((((depth[v]-depth[u])>>k)&1)==1) {
			   v=parent[k][v];
		   }
	   }
	   if(u==v)return u;
	   //二分探索でLCAを求める
	   for(int k=MAX_LOG-1;k>=0;k--) {
		   if(parent[k][u]!=parent[k][v]) {
			   u=parent[k][u];
			   v=parent[k][v];
		   }
	   }
	   return parent[0][u];
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

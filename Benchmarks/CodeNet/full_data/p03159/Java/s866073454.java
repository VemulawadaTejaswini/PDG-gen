import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE/2;

    ArrayList<Integer>[] edge;
    boolean[] seen;
    int[] nodenum;
    int n;
    long[] a;

    void solve(){
        n = ni();
        a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = nl();
        }
        edge = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < n-1; i++){
            int s = ni()-1;
            int t = ni()-1;
            edge[s].add(t);
            edge[t].add(s);
        }
        seen = new boolean[n];
        nodenum = new int[n];
        seen[0] = true;
        dfs_node(0);
        seen = new boolean[n];
        seen[0] = true;
        long[][] ans = f(0);
        for(int i = 0; i < n; i++){
            // out.println(ans[i][0]+" "+ans[i][1]);
            if(ans[i][0]!=inf || ans[i][1]<0){
                out.println(i);
                return;
            }
        }

    }

    int dfs_node(int r){
        int ans = 1;
        for(int t : edge[r]){
            if(seen[t]) continue;
            seen[t] = true;
            ans += dfs_node(t);
        }
        nodenum[r] = ans;
        // System.err.println(r+" "+ans);
        return ans;
    }

    long[][] f(int r){
        int u = nodenum[r];
        // System.err.println(u);
        long[][][] dp = new long[2][u][2];
        for(int i = 0; i < u; i++){
            dp[0][i][0] = inf;
            dp[0][i][1] = inf;
            dp[1][i][0] = inf;
            dp[1][i][1] = inf;
        }
        if(a[r]>0){
            dp[0][0][0] = a[r];
            dp[0][0][1] = a[r];
        }
        else{
            dp[0][0][1] = a[r]; 
        }
        int p = 1;
        int q = 0;
        for(int t : edge[r]){
            if(seen[t]) continue;
            seen[t] = true;
            long[][] rdp = f(t);
            for(int i = 0; i < u; i++){
                dp[1-q][i][0] = inf;
                dp[1-q][i][1] = inf;
            }
            for(int i = 0; i < p; i++){
                for(int j = 0; j < nodenum[t]; j++){
                    // boolean f1 = (dp[q][i][0]!=inf);
                    // boolean f2 = (dp[q][i][1]!=inf);
                    boolean f3 = (rdp[j][0]!=inf);
                    // boolean f4 = (rdp[j][1]!=inf);
                    boolean f5 = (rdp[j][1]<0);
                    dp[1-q][i+j][0] = Math.min(dp[1-q][i+j][0], dp[q][i][0] + rdp[j][0]);
                    dp[1-q][i+j][1] = Math.min(dp[1-q][i+j][1], dp[q][i][1] + rdp[j][1]);
                    if(f3||f5){
                        dp[1-q][i+j+1][0] = Math.min(dp[1-q][i+j+1][0], dp[q][i][0]);
                        dp[1-q][i+j+1][1] = Math.min(dp[1-q][i+j+1][1], dp[q][i][1]);
                    }
                }
            }
            // out.println(r+" "+t+" "+dp[1-q][1][0]);
            p += nodenum[t];
            q = 1-q;
        }
        // out.println(r);
        // for(int i = 0; i < nodenum[r]; i++){
        //     out.println(dp[q][i][0]+" "+dp[q][i][1]);
        // }
        // System.err.println("ret");
        return dp[q];
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

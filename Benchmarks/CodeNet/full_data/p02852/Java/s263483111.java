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
    // int inf = Integer.MAX_VALUE/2;

    long[] dp, dp2;
    int n,m;
    int[] v;
    int[] mi;
    void solve(){
        n = ni();
        m = ni();
        char[] c = ns().toCharArray();
        v = new int[c.length];
        for(int i = 0; i < c.length; i++){
            v[i] = c[i] - '0';
        }
        dp = new long[n+1];
        dp2 = new long[n+1];
        mi = new int[n+1];
        Arrays.fill(mi, n+2);
        Arrays.fill(dp, inf);
        Arrays.fill(dp2, inf);
        dp[n] = 0;
        dp2[n] = 0;
        f(0);
        f2(0);
        int cur = 0;
        if(dp[0]==inf){
            out.println(-1);
            return;
        }
        while(cur<n){
            int next = mi[cur];
            int diff = next-cur;
            out.print(diff+" ");
            cur = next;
        }
        out.println();
        // for(int i = 0; i <= n; i++){
        //     out.println(dp[i]);
        // }
    }

    void f(int cur){
        if (dp[cur]!=inf) return;
        for(int i = m; i >=1; i--){
            if(cur+i>n) continue;
            if(v[cur+i]==1) continue;
            if(dp[cur+i]!=inf){
                dp[cur] = Math.min(dp[cur], dp[cur+i]+1);
                continue;
            }
            f(cur+i);
            dp[cur] = Math.min(dp[cur], dp[cur+i]+1);
        }
    }

    void f2(int cur){
        if (dp2[cur]!=inf) return;
        for(int i = m; i >=1; i--){
            if(cur+i>n) continue;
            if(v[cur+i]==1) continue;
            if(dp2[cur+i]!=inf){
                if(dp[cur]==dp2[cur+i]+1){
                    mi[cur] = Math.min(mi[cur],cur+i);
                }
                dp2[cur] = Math.min(dp2[cur], dp2[cur+i]+1);
                continue;
            }
            f2(cur+i);
            if(dp[cur]==dp2[cur+i]+1){
                mi[cur] = Math.min(mi[cur],cur+i);
            }
            dp2[cur] = Math.min(dp2[cur], dp2[cur+i]+1);
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

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
        long[] t = new long[n];
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            t[i] = nl();
        }
        for(int i = 0; i < n; i++){
            a[i] = nl();
        }
        long[][] trange = new long[n][2];
        long[][] arange = new long[n][2];
        trange[0][0] = t[0];
        trange[0][1] = t[0];
        for(int i = 1; i < n; i++){
            if(t[i]>t[i-1]){
                trange[i][0] = t[i];
                trange[i][1] = t[i];
            }
            else{
                trange[i][0] = 1;
                trange[i][1] = t[i];
            }
        }
        arange[n-1][0] = a[n-1];
        arange[n-1][1] = a[n-1];
        for(int i = n-2; i >= 0; i--){
            if(a[i]>a[i+1]){
                arange[i][0] = a[i];
                arange[i][1] = a[i];
            }
            else{
                arange[i][0] = 1;
                arange[i][1] = a[i];
            }
        }
        long ans = 1;
        for(int i = 0; i < n; i++){
            long res = valid_range(trange[i], arange[i]);
            // out.println(res);
            ans *= res;
            ans %= mod;
        }
        out.println(ans);
    }

    long valid_range(long[] t, long[] a){
        long l = Math.min(t[0], a[0]);
        long r = Math.max(t[1], a[1]);
        long sum = (t[1]-t[0]+1) + (a[1]-a[0]+1);
        long diff = sum - (r-l+1);
        // out.println(sum+" "+l+" "+r+" "+diff);
        return Math.max(diff, 0);
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

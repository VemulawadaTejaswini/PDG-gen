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
        int a = ni();
        int b = ni();
        int q = ni();
        long[] s = new long[a];
        long[] t = new long[b];
        for(int i = 0; i < a ;i++){
            s[i] = nl();
        }
        for(int i = 0; i < b; i++){
            t[i] = nl();
        }
        for(int i = 0; i < q; i++){
            long x = nl();
            long ans = inf;
            int r1 = lowerBound(s, x-1);
            int r2 = lowerBound(t, x-1);
            int l1 = upperBound(s, x+1);
            int l2 = upperBound(t, x+1);
            if(0<=r1 && r1<a && 0<=r2 && r2<b) ans = Math.min(ans, Math.max(s[r1], t[r2])-x);
            if(0<=l1 && l1<a && 0<=l2 && l2<b) ans = Math.min(ans, x-Math.min(s[l1], t[l2]));
            if(0<=l1 && l1<a && 0<=r2 && r2<b) ans = Math.min(ans, Math.min(x-s[l1], t[r2]-x) + t[r2]-s[l1]);
            if(0<=l2 && l2<b && 0<=r1 && r1<a) ans = Math.min(ans, Math.min(x-t[l2], s[r1]-x) + s[r1]-t[l2]);
            out.println(ans);
        }
    }


    // 配列a内のvより小さいの最大のindex
public static int upperBound(long[] a, long v){ return upperBound(a, 0, a.length, v); }
    public static int upperBound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] >= v){
                high = h;
            }else{
                low = h;
            }
        }
        return low;
    }

// 配列a内のvより大きいの最小のindex
public static int lowerBound(long[] a, long v){ return lowerBound(a, 0, a.length, v); }
    public static int lowerBound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] <= v){
                low = h;
            }else{
                high = h;
            }
        }
        return high;
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

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

    long[] a;
    int l;
    int[] erange  = new int[2];
    int[] orange  = new int[2];

    void solve(){
        l = ni();
        a = new long[l];
        long[] b = new long[l];
        long sum = 0;
        for(int i = 0; i < l; i++){
            a[i] = nl();
        }
        long ans = f(0,l-1);
        for(int i = 0; i < l; i++){
            sum += a[i];
            long res = sum + f(i+1,l-1);
            ans = Math.min(ans, res);
        }

        for(int i = 0; i < l; i++){
            b[i] = a[l-1-i];
        }
        for(int i = 0; i < l; i++){
            a[i] = b[i];
        }

        ans = Math.min(ans, f(0,l-1));
        sum = 0;
        for(int i = 0; i < l; i++){
            sum += a[i];
            long res = sum + f(i+1,l-1);
            ans = Math.min(ans, res);
        }
        
        out.println(ans);

    }

    long f(int s, int t){
        int match = 0;
        for(int i = s; i <= t; i++){
            if(a[i]%2==0) match++;
        }
        erange[0] = s;
        erange[1] = t;
        orange[0] = -1;
        orange[1] = -1;
        int max = match;
        for(int i = s; i < t; i++){
            if(a[i]%2==1){
                match++;
            }
            else{
                match--;
            }
            if(match>max){
                max = match;
                orange[0] = s;
                orange[1] = i;
                erange[0] = (i+1 <= t ? i+1 : -1);
                erange[1] = (i+1 <= t ? t : -1);
            }
        }
        for(int i = s; i <= t; i++){
            if(a[i]%2==0){
                match++;
            }
            else{
                match--;
            }
            if(match>max){
                max = match;
                erange[0] = s;
                erange[1] = i;
                orange[0] = (i+1 <= t ? i+1 : -1);
                orange[1] = (i+1 <= t ? t : -1);
            }
        }
        // out.println(s+" "+t);
        // out.println(erange[0]+" "+erange[1]+" "+orange[0]+" "+orange[1]);
        long diff = 0;
        if(erange[0]!=-1){
            for(int i = erange[0]; i <= erange[1]; i++){
                if(a[i]%2==0){
                }
                else{
                    diff++;
                }
            }
        }
        if(orange[0]!=-1){
           for(int i = orange[0]; i <= orange[1]; i++){
                if(a[i]%2==1){
                }
                else{
                    diff++;
                }
            } 
        }
        return diff;
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

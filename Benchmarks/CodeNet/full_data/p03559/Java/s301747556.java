import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";

    int MOD = 1000000007;
    int INF = 10000000;

    void solve()
    {
        int n = ni();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = ni();
        }
        for(int i = 0; i < n; i++){
            b[i] = ni();
        }
        for(int i = 0; i < n; i++){
            c[i] = ni();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int as = 0;
        int bs = 0;
        int cs = 0;
        long ans = 0;
        long[] b1 = new long[n];
        long[] a1 = new long[n];
        long bsum = 0;
        while(bs<=n-1){
            while(c[cs]<=b[bs] && cs<n-1) cs++;
            if(cs==n-1 && c[cs]<=b[bs]) break;
            b1[bs] = (n-cs);
            bsum += b1[bs];
            bs++;
        }
        bs = 0;
        long[] t = new long[n];
        for(int i = 0; i < n; i++){
            t[i] = bsum;
            bsum = bsum-b1[i];
        }
        while(as<=n-1){
            while(b[bs]<=a[as] && bs<n-1) bs++;
            if(bs==n-1 && b[bs]<=a[as]) break;
            ans += t[bs];
            as++;
        }
        out.println(ans);
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

    static class ArrayUtils {
        public static void fill(double[][] array, double value) {
            for (double[] a : array) Arrays.fill(a, value);
        }
 
        public static void fill(double[][][] array, double value) {
            for (double[][] l : array) fill(l, value);
        } 
    }
}

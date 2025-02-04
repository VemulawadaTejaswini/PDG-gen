import java.io.*;
import java.util.*;

public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";

    long MOD = 1000000007;
    int inf = 10000000;
    void solve()
    {
        int n = ni();
        int MA = ni();
        int MB = ni();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[][][] dp = new int[n+1][501][501];
        for(int i = 0; i <=n; i++){
            for(int j = 0; j <= 500; j++){
                for(int k = 0; k <= 500; k++){
                    dp[i][j][k] = inf;
                }
            }
        }
        for(int i = 0; i < n; i++){
            a[i] = ni();
            b[i] = ni();
            c[i] = ni();
        }
        dp[0][0][0] = 0;
        for(int i = 0; i <= n-1; i++){
            for(int j = 0; j <= 400; j++){
                for(int k = 0; k <= 400; k++){
                    if(dp[i][j][k] == inf) continue;
                    dp[i+1][j+a[i]][k+b[i]] = Math.min(dp[i+1][j+a[i]][k+b[i]], dp[i][j][k] + c[i]); 
                    dp[i+1][j][k] = Math.min(dp[i+1][j][k], dp[i][j][k]);
                }
            }
        }
        int min = inf;
        for(int i = 1; i <= 400; i++){
            for(int j= 1; j <= 400; j++){
                if(MA*j == MB*i && dp[n][i][j]!=inf){
                    min = Math.min(min,dp[n][i][j]);
                }
            }
        }
        out.println(min == inf ? -1 : min);
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

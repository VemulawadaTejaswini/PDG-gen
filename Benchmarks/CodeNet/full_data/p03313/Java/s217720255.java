import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        int total = (1<<n);
        long[] a = new long[total+1];
        for(int i = 0; i < total; i++){
            a[i] = nl();
        }
        long[][][] dp = new long[total][2][2];
        for(int i = 0; i < total; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                    dp[i][j][k] = -1;
                }
                dp[i][0][0] = a[i];
                dp[i][0][1] = i;
            }
        }
        for(int i = 0; i < n; i++){
            for(int s = 0; s < total; s++){
                if((s&(1<<i))==0){
                    int r = s|(1<<i);
                    long[][] arr = new long[4][2];
                    arr[0][0] = dp[r][0][0];
                    arr[0][1] = dp[r][0][1];
                    arr[1][0] = dp[r][1][0];
                    arr[1][1] = dp[r][1][1];
                    arr[2][0] = dp[s][0][0];
                    arr[2][1] = dp[s][0][1];
                    arr[3][0] = dp[s][1][0];
                    arr[3][1] = dp[s][1][1];
                    Arrays.sort(arr, (x,y)->Long.compare(y[0],x[0]));
                    int p = 0;
                    long prev = -1;
                    for(int j = 0; j < 4; j++){
                        if(arr[j][1]==prev) continue;
                        dp[r][p][0] = arr[j][0];
                        dp[r][p][1] = arr[j][1];
                        p++;
                        prev = arr[j][1];
                        if(p==2) break;
                    }
                }
            }
        }
        long[] ans = new long[total];
        for(int i = 1; i < total; i++){
            // out.println(dp[i][0][0]+" "+dp[i][1][0]);
            ans[i] = Math.max(ans[i-1], dp[i][0][0]+dp[i][1][0]);
            out.println(ans[i]);
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

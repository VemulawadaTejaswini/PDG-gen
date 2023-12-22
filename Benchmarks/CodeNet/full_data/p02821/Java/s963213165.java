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

    void solve(){
        int n = ni();
        long m = nl();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = nl();
        }
        Arrays.sort(a);
        long[] b = new long[n];
        for(int i = 0; i < n; i++){
            b[i] = a[n-1-i];
        }
        long ans = 0;
        if (m==n*n){
            for(int i = 0; i < n; i++){
                ans += 2*n*b[i];
            }
            out.println(ans);
            return;
        }
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            long val = (long)2*n*(i+1) + (long)2*(i+2)*(n-i-1);
            if (val<2*m) { continue; }
            System.err.println(i);
            long val2 = (long)4*n*(i) - (long)2*(i)*(i);
            for(int j = 0; j < i; j++){
                ans += 2*n*b[j];
                d[j] = 2*n;
            }
            for(int j = i; j < n; j++){
                ans += 2*(i)*b[j];
                d[j] = 2*i;
            }
            long res = 2*m - val2;
            int target = i;
            int x = 0;
            boolean[] z = new boolean[n];
            while(res>0){
                boolean flag = false;
                long tmp = b[i]+b[target];
                for(int j = i+1; j < n; j++){
                    if(z[j]) continue;
                    if(2*b[j]>=tmp){
                        ans += 2*b[j];
                        d[j] += 2;
                        res -= 2;
                        z[j] = true;
                        flag = true;
                        break;
                    }
                }
                if(flag) continue;

                ans += tmp;
                d[i]++;
                d[target]++;
                if(target==i){
                    target++;
                    res -= 2;
                    continue;
                }
                else{
                    if(x%2==1) target++;
                    x++;
                }
                res-=2;
                
            }
            if(res==0) break;
        }
        long debug = 0;
        for(int i = 0; i < n; i++){
            System.err.print(d[i]+" ");
            debug += b[i]*d[i];
        }
        System.err.println();
        System.err.println(debug);
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
 
}

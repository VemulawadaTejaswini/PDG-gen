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

    ArrayList<Integer>[] edge;
    int[] num, num2;
    boolean[] seen;
    HashSet<Long> map = new HashSet<>();
    void solve(){
        int n = ni();
        int m = ni();
        edge = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<Integer>();
        }
        num = new int[n];
        num2 = new int[n];
       
        for(int i = 0; i < m; i++){
            int s = ni()-1;
            int t = ni()-1;
            long ret = s*1000000000l + t;
            map.add(ret);
            edge[s].add(t);
            edge[t].add(s);
            num[s]++;
            num[s] = num[s]%2;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += num[i];
        }
        if(sum%2!=0){
            out.println(-1);
            return;
        }
        seen = new boolean[n];
        dfs(0);
        // out.println();
        // for(int i = 0; i < n; i++){
        //     out.println(num[i] + " " + num2[i]);
        // }
        seen = new boolean[n];
        dfs2(0,0);   
        for(long i : map){
            long s = i/1000000000l;
            long t = i%1000000000l;
            out.println(s+" "+t);
        }  
    }

    int dfs(int cur){
        seen[cur] = true;
        int ret = num[cur];
        for(int e : edge[cur]){
            if(seen[e]) continue;
            ret += dfs(e);
        }
        num2[cur] = ret%2;
        return num2[cur];
    }

    void dfs2(int cur, int flip){
        seen[cur] = true;
        int ret = num[cur];
        if(flip==1){
            ret = 1 - ret;
        }
        for(int e : edge[cur]){
            if(seen[e]) continue;
            if(num2[e]==1){
                long res = cur*1000000000l + e;
                map.remove(res);
                res = e*1000000000l + cur;
                map.add(res);
                dfs2(e,1);
                ret = 1 - ret;
            }
            else{
                dfs2(e,0);
            }
        }
        // out.println(ret);
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

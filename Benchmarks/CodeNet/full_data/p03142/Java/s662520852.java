import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    ArrayList<Integer>[] edge;
    int[][] p;
    boolean[] seen;
    void solve(){
        int n = ni();
        int m = ni();
        edge = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<>();
        }
        int[] input = new int[n];
        for(int i = 0; i < n+m-1; i++){
            int s = ni()-1;
            int t = ni()-1;
            edge[s].add(t);
            input[t]++;
        }
        int source = -1;
        for(int i = 0; i < n; i++){
            if(input[i]==0){
                source = i;
                break;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        p = new int[n][2];
        for(int i = 0; i < n; i++){
            p[i][0] = -1;
            p[i][1] = -1;
        }
        seen = new boolean[n];
        dfs(source, 0);
        // for(int t : edge[source]){
        //     q.add(t);
        //     p[t] = source;
        // }
        // while(!q.isEmpty()){
        //     int r = q.poll();
        //     if(seen[r]) continue;
        //     seen[r] = true;
        //     for(int d : edge[r]){
        //         p[d] = r;
        //         q.add(d);
        //     }
        // }
        for(int i = 0; i < n; i++){
            p[i][0]++;
            out.println(p[i][0]);
        }

    }

    void dfs(int s, int dist){
        // out.println(s+" "+dist);
        if(seen[s]) return;
        seen[s] = true;
        int x = dist++;
        for(int t : edge[s]){
            if(dist>p[t][1]){
                p[t][0] = s;
                p[t][1] = dist;
            }
            dfs(t, x);
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

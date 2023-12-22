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

    int black = 0;
    int white = 0;
    ArrayList<int[]>[] edge;
    boolean[] seen;
    void solve(){
        int h = ni();
        int w = ni();
        char[][] map = nm(h,w);
        edge = new ArrayList[h*w];
        for(int i = 0; i < h*w; i++){
            edge[i] = new ArrayList<>();
        }
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                for(int c = 0; c < 4; c++){
                    int cx = i + dx[c];
                    int cy = j + dy[c];
                    if(cx<0||cx>=h||cy<0||cy>=w) continue;
                    if(map[i][j]==map[cx][cy]) continue;
                    edge[i*w+j].add(new int[]{cx*w+cy, map[cx][cy]=='#' ? 0 : 1});
                }
            }
        }
        long ans = 0;
        seen = new boolean[h*w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(seen[i*w+j]) continue;
                search(map, i*w+j);
                if(map[i][j]=='#') black++;
                else white++;
                ans += black * white;
                black = 0;
                white = 0;
            }
        }
        out.println(ans);
    }

    void search(char[][] map, int s){
        seen[s] = true;
        for(int[] t : edge[s]){
            if(seen[t[0]]) continue;
            if(t[1]==0) black++;
            if(t[1]==1) white++;
            search(map, t[0]);
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

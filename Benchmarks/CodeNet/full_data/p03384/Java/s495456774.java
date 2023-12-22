import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        EdgeTree et = new EdgeTree(n);
        for(int i = 0; i < n-1; i++){
            int v = ni()-1;
            int w = ni()-1;
            et.addbiEdge(v,w);
        }
        if(!et.judge()){
            out.println(-1);
            return;
        }
        ArrayList<Integer> list = et.node_diameter();
        ArrayList<Integer> leaves = new ArrayList<>();
        for(int i : list){
            leaves.add(et.edge[i].size());
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int p = 1;
        for(int i = 0; i < leaves.size(); i++){
            int ls = leaves.get(i)-2;
            if(i==0||i==leaves.size()-1) ls++;
            int tmp = p;
            for(int j = 0; j < ls; j++){
                p++;
                ans.add(p);
            }
            ans.add(tmp);
            p++;
        }
        for(int i : ans){
            out.print(i+" ");
        }
    }

    class EdgeTree{
        ArrayList<Integer>[] edge;
        int s,t;
        int n;
        EdgeTree(int n){
            this.n = n;
            edge = new ArrayList[n];
            for(int i = 0; i < n; i++) edge[i] = new ArrayList<>();
        }
        void addbiEdge(int from, int to){
            edge[from].add(to);
            edge[to].add(from);
        }
        void dfs(int cur, int par, int d, int[] depth){
            depth[cur] = d;
            for(int i : edge[cur]){
                if(i==par) continue;
                dfs(i, cur, d+1, depth);
            }
        }
        void dfs2(int cur, int par, int[] depth, int[] depth2, ArrayList<Integer> list, int diameter){
            if(depth[cur]+depth2[cur]==diameter) list.add(cur);
            for(int i : edge[cur]){
                if(i==par) continue;
                dfs2(i, cur, depth, depth2, list, diameter);
            }
        }
        int findroot(int root, int[] depth){
            dfs(root,-1,0,depth);
            int max = 0;
            int end = -1;
            for(int i = 0; i < n; i++){
                if(depth[i]>max){
                    end = i;
                    max = depth[i];
                }
            }
            return end;
        }
        ArrayList<Integer> node_diameter(){
            int[] depth = new int[n];
            s = findroot(0, depth);
            t = findroot(s, depth);
            int diameter = depth[t];
            int[] depth2 = new int[n];
            int tmp = findroot(t, depth2);
            ArrayList<Integer> list = new ArrayList<>();
            dfs2(s,-1,depth,depth2,list,diameter);
            return list;
        }
        boolean judge(){
            int[] depth = new int[n];
            s = findroot(0, depth);
            t = findroot(s, depth);
            int diameter = depth[t];
            int[] depth2 = new int[n];
            int tmp = findroot(t, depth2);
            for(int i = 0; i < n; i++){
                if(depth[i]+depth2[i]>diameter+2) return false;
            }
            return true;
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

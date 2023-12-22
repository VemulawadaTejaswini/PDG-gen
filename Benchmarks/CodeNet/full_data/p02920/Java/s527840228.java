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
        int total = (int)Math.pow(2,n);
        int[] s = new int[total];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i< total; i++){
            s[i] = ni();
            map.put(s[i],map.getOrDefault(s[i],0)+1);
        }
        int[] res = new int[map.size()];
        int idx = 0;
        for(int i : map.keySet()){
            res[idx++] = map.get(i);
        }
        int half = total/2;
        for(int x = 0; x <n; x++){
            TreeMap<Integer,Integer> next = new TreeMap<>();
            idx = 0;
            while(true){
                if(idx>=res.length) break;
                int cur = res[idx];
                // System.err.println(cur);
                if(cur==0){
                    idx++;
                    continue;
                }
                int nex = idx+1;
                while(cur>0){
                    if(nex>=res.length) break;
                    if(res[nex]>cur){
                        res[nex] -= cur;
                        res[idx] = 0;
                        next.put(nex,next.getOrDefault(nex,0)+cur);
                        break;
                    }
                    next.put(nex,next.getOrDefault(nex,0)+res[nex]);
                    cur -= res[nex];
                    res[idx] -= res[nex];
                    nex++;
                }
                idx = nex;
            }
            next.put(0,next.getOrDefault(0,0)+res[0]);
            res = new int[next.size()];
            int q = 0;
            for(int i : next.keySet()){
                int g = next.get(i);
                // if(g==0) continue;
                res[q++] = next.get(i);
                // System.err.print(next.get(i)+" ");
                if(next.get(i)>=half){
                    out.println("No");
                    return;
                }
            }
            // System.err.println();
        }
        out.println("Yes");
        
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

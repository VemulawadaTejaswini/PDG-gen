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
        int h = ni();
        int w = ni();
        char[][] map = nm(h,w);
        boolean[] seen = new boolean[h];
        HashMap<Integer, Integer> pair = new HashMap<>();
        for(int i = 0; i < h; i++){
            if(seen[i]) continue;
            for(int j = 0; j < h; j++){
                if(i==j) continue;
                if(seen[j]) continue;
                int[] p = new int[w];
                int[] b = new int[w];
                for(int k = 0; k < w; k++){
                    if(map[i][k]>map[j][k]){
                        p[k] = (map[i][k]-'a'+10)*26+(map[j][k]-'a'+1);
                    }
                    else if(map[i][k]<map[j][k]){
                        b[k] = (map[j][k]-'a'+10)*26+(map[i][k]-'a'+1);
                    }
                }
                Arrays.sort(p);
                Arrays.sort(b);
                boolean flag = true;
                for(int k = 0; k < w; k++){
                    if(p[k]!=b[k]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    seen[i] = true;
                    seen[j] = true;
                    pair.put(i,j);
                    // out.println(i+" "+j);
                    break;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < h; i++){
            if(!seen[i]){
                count++;
                pair.put(i,i);
            }
        }
        if(count>=2){
            out.println("NO");
            return;
        }
        int[][][] list = new int[pair.size()][w][2];
        int p = 0;
        for(int i : pair.keySet()){
            int j = pair.get(i);
            for(int k = 0; k < w; k++){
                if(map[i][k]>map[j][k]){
                    list[p][k][0] = (map[i][k]-'a'+10)*26+(map[j][k]-'a'+1);
                }
                else if(map[i][k]<map[j][k]){
                    list[p][k][1] = (map[j][k]-'a'+10)*26+(map[i][k]-'a'+1);
                }
                else{
                    list[p][k][0] = (map[i][k]-'a'+10)*26+(map[j][k]-'a'+1);
                    list[p][k][1] = (map[i][k]-'a'+10)*26+(map[j][k]-'a'+1);
                }
            }
            p++;
        }
        boolean[] seen2 = new boolean[w];
        for(int i = 0; i < w; i++){
            if(seen2[i]) continue;
            for(int j = 0; j < w; j++){
                if(i==j) continue;
                if(seen2[j]) continue;
                boolean flag = true;
                for(int k = 0; k < pair.size(); k++){
                    // out.println(list[k][i][0]+" "+list[k][i][1]+" "+i);
                    // out.println(list[k][j][0]+" "+list[k][j][1]+" "+j);
                    if(list[k][i][0]!=list[k][j][1] || list[k][i][1]!=list[k][j][0]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    // out.println(i+" "+j);
                    seen2[i] = true;
                    seen2[j] = true;
                }
            }
        }
        count = 0;
        for(int i = 0; i < w; i++){
            if(!seen2[i]){
                count++;
                for(int j = 0; j < h; j++){
                    if(map[j][i]!=map[h-1-j][i]){
                        out.println("NO");
                        return;
                    }
                }
            }
        }
        if(count>=2){
            out.println("NO");
            return;
        }
        out.println("YES");


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

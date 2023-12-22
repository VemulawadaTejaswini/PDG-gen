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
    long inf = Long.MAX_VALUE/2;
    // int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        String prev = "";
        int mid = 0;
        int q = 0;
        int[] ans = new int[2*n];
        Arrays.fill(ans, -1);
        for(int i = 0; i < n; i++){
            System.out.print("? ");
            q++;
            for(int j = i; j < i+n; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
            String ret = ns();
            if (ret.equals("Red")){
                ans[i] = 0;
            }
            else {
                ans[i] = 1;
            }
            if (prev.equals("")){
                prev = ret;
                continue;
            }
            if (!ret.equals(prev)){
                mid = i;
                break;
            }
            prev = ret;
        }
        int[] val = new int[2*n];
        Arrays.fill(val, -1);
        if(ans[mid]==0){
            val[mid-1]=1;
            val[mid+n-1]=0;
        }
        else{
            val[mid-1]=0;
            val[mid+n-1]=1;
        }
        for(int i = 0; i < mid-1; i++){
            if(val[i]!=-1) continue;
            System.out.print("? ");
            q++;
            System.out.print((i+1)+" ");
            for(int j = mid; j < mid+n-1; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
            String ret = ns();
            if (ret.equals("Red")){
                val[i] = 0;
            }
            else{
                val[i] = 1;
            }
        }
        for(int i = mid+n-1; i < 2*n; i++){
            if(val[i]!=-1) continue;
            System.out.print("? ");
            q++;
            System.out.print((i+1)+" ");
            for(int j = mid; j < mid+n-1; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
            String ret = ns();
            if (ret.equals("Red")){
                val[i] = 0;
            }
            else{
                val[i] = 1;
            }
        }
        for(int i = mid; i < mid+n-1; i++){
            if (val[i]!=-1) continue;
            System.out.print("? ");
            q++;
            System.out.print((i+1)+" ");
            int rc = 0;
            int bc = 0;
            boolean rf = false;
            boolean bf = false;
            for(int j = 0; j < mid; j++){
                if (val[j]==0){
                    rc+=1;
                }
                else{
                    bc+=1;
                }
                if (rc==1 && !rf){
                    rf = true;
                    continue;
                }
                if (bc==1 && !bf){
                    bf = true;
                    continue;
                }
                System.out.print((j+1)+" ");
            }
            for(int j = mid+n-1; j < 2*n; j++){
                if (val[j]==0){
                    rc+=1;
                }
                else{
                    bc+=1;
                }
                if (rc==1 && !rf){
                    rf = true;
                    continue;
                }
                if (bc==1 && !bf){
                    bf = true;
                    continue;
                }
                System.out.print((j+1)+" ");
            }
            System.out.println();
            String ret = ns();
            if (ret.equals("Red")){
                val[i] = 0;
            }
            else{
                val[i] = 1;
            }
        }
        System.out.print("! ");
        for(int i = 0; i < 2*n; i++){
            if(val[i]==0) out.print("R");
            else out.print("B");
        }
        out.println();
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

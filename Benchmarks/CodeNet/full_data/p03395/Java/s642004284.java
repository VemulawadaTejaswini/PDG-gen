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
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = ni();
        }
        for(int i = 0; i < n; i++){
            b[i] = ni();
        }
        int[] a2 = new int[n];
        int[] a3 = new int[n];
        int[] a4 = new int[n];
        long cost = inf;
        for(int i = 0; i <= 50; i++){
            for(int j = 0; j <= 50; j++){
                Arrays.fill(a2,-1);
                Arrays.fill(a3,-1);
                Arrays.fill(a4,-1);
                for(int k = 0; k < n; k++){
                    if(i==0) break;
                    a2[k]=a[k]%i;
                }
                for(int k = 0; k < n; k++){
                    if(j==0) break;
                    a3[k]=a[k]%j;
                }
                for(int k = 0; k < n; k++){
                    if(i==0&&j==0) break;
                    else if(i==0) a4[k]=a[k]%j;
                    else if(j==0) a4[k]=a[k]%i; 
                    else a4[k]=(a[k]%i)%j;
                }
                boolean flag = true;
                for(int k = 0; k < n; k++){
                    if(a[k]!=b[k]&&a2[k]!=b[k]&&a3[k]!=b[k]&&a4[k]!=b[k]){
                        flag = false; 
                        break;
                    } 
                }
                if(flag){
                    long tmp = (long)(i>0 ? Math.pow(2,i) : 0 ) + (long)(j>0 ? Math.pow(2,j) : 0 );
                    cost = Math.min(cost, tmp);
                }
            }
        }
        if(cost==inf){
            out.println(-1);
            return;
        }
        out.println(cost);

    }

    void debug(ArrayList<Integer> list, int n){
        int k = list.size();
        if(k!=n){
            out.println(-1);
            return;
        }
        boolean[] seen = new boolean[30001];
        for(int i : list){
            if(i>30000){
                out.println(-4);
                return;
            }
            if(!seen[i]){
                seen[i] = true;
                continue;
            }
            if(seen[i]){
                out.println(-2);
                return;
            }
        } 
        for(int i = 0; i < k; i++){
            int tmp = list.get(i);
            int tmp2 = 0;
            for(int j = 0; j < k; j++){
                if(i==j) continue;
                tmp2 += list.get(j);
            }
            if(gcd(tmp, tmp2)==1){
                out.println(i+" "+-3);
                return;
            }
        }

    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
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

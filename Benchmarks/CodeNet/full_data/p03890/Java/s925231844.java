import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long MOD = 1_000_000_007;
    int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        LazySegmentTree seg = new LazySegmentTree();
        for(int i = 0; i < (1<<n); i++){
            int a = ni();
            seg.update(i,i+1,a);
        }
        out.println(seg.query(0,(1<<n)+1)[0]);  
    }

    class LazySegmentTree {
        int SIZE = 1 << 19;
        long[][] seg;
        long[] lazy;
        LazySegmentTree() {
            this.seg = new long[2 * SIZE][2];
            this.lazy = new long[2 * SIZE];
            for(int i=0;i<2*SIZE;++i){
                seg[i][0] = 0;
                seg[i][1] = 0;
                lazy[i] = 0;
            }
        }
        long[] comb(long[] a, long[] b){
            long res = Math.abs(a[0]-b[0]);
            if(res==0) res = a[0];
            return new long[]{res,a[1]+b[1]};
        }
        long[] query(int a,int b,int l,int r,int k){
            eval(l,r,k);
            if(a<=l&&r<=b) return seg[k];
            if(b<=l||r<=a) return new long[]{0,0};
            long[] ans1=query(a,b,l,(l+r)/2,2*k+1);
            long[] ans2=query(a,b,(l+r)/2,r,2*k+2);
            return comb(ans1,ans2);
        }
        long[] query(int l, int r) {
            return query(l,r,0,SIZE,0);
        }
        void eval(int l, int r, int k){
            if(this.lazy[k]!= 0){
               this.seg[k][0]+= this.lazy[k];
                if(r-l>1){
                    this.lazy[2*k+1] += this.lazy[k];
                    this.lazy[2*k+2] += this.lazy[k];
                }
                this.lazy[k] = 0;
            }
        }
        void update(int a, int b, long x, int l, int r, int k){
            eval(l,r,k);
            if(b<=l||r<=a) return;
            if(a<=l&&r<=b){
                this.lazy[k] += x;
                eval(l,r,k);
            }
            else{
                update(a,b,x,l,(l+r)/2,2*k+1);
                update(a,b,x,(l+r)/2,r,2*k+2);
                this.seg[k] = comb(this.seg[2*k+1],this.seg[2*k+2]);
            }
        }
        void update(int a, int b, long x){
            update(a, b, x, 0, SIZE, 0);
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
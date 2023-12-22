import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long MOD = 1_000_000_007;
    int inf = Integer.MAX_VALUE;

    void solve(){
        int q = ni();
        int[] res = sieveEratosthenes(100000);
        int n = res.length;
        int[] m = new int[100001];
        for(int i = 0; i < n; i++){
            m[res[i]]++;
        }
        for(int i = 0; i < n; i++){
            if(2*res[i]-1>100000) break;
            m[2*res[i]-1]++;
        }
        LazySegmentTree seg = new LazySegmentTree();
        for(int i = 1; i <= 100000; i++){
            if(m[i]==2){
                seg.update(i, i+1, 1);
                // out.println(i);
            }
        }
        for(int i = 0; i < q; i++){
            int l = ni();
            int r = ni();
            long ans = seg.query(l,r+1)[0];
            out.println(ans);
        }
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
            return new long[]{a[0]+b[0],a[1]+b[1]};
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
                this.seg[k][0] += this.lazy[k];
                if(r-l>1){
                    this.lazy[2*k+1] = this.lazy[k];
                    this.lazy[2*k+2] = this.lazy[k];
                }
                this.lazy[k] = 0;
            }
        }
        void update(int a, int b, long x, int l, int r, int k){
            eval(l,r,k);
            if(b<=l||r<=a) return;
            if(a<=l&&r<=b){
                this.lazy[k] = x;
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

    public static int[] sieveEratosthenes(int n) {
        if (n <= 32) {
            int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
            for (int i = 0; i < primes.length; i++) {
                if (n < primes[i]) {
                    return Arrays.copyOf(primes, i);
                }
            }
            return primes;
        }

        int u = n + 32;
        double lu = Math.log(u);
        int[] ret = new int[(int) (u / lu + u / lu / lu * 1.5)];
        ret[0] = 2;
        int pos = 1;

        int[] isnp = new int[(n + 1) / 32 / 2 + 1];
        int sup = (n + 1) / 32 / 2 + 1;

        int[] tprimes = { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
        for (int tp : tprimes) {
            ret[pos++] = tp;
            int[] ptn = new int[tp];
            for (int i = (tp - 3) / 2; i < tp << 5; i += tp)
                ptn[i >> 5] |= 1 << (i & 31);
            for (int j = 0; j < sup; j += tp) {
                for (int i = 0; i < tp && i + j < sup; i++) {
                    isnp[j + i] |= ptn[i];
                }
            }
        }

        // 3,5,7
        // 2x+3=n
        int[] magic = { 0, 1, 23, 2, 29, 24, 19, 3, 30, 27, 25, 11, 20, 8, 4, 13, 31, 22, 28, 18, 26, 10, 7, 12, 21, 17,
                9, 6, 16, 5, 15, 14 };
        int h = n / 2;
        for (int i = 0; i < sup; i++) {
            for (int j = ~isnp[i]; j != 0; j &= j - 1) {
                int pp = i << 5 | magic[(j & -j) * 0x076be629 >>> 27];
                int p = 2 * pp + 3;
                if (p > n)
                    break;
                ret[pos++] = p;
                if ((long) p * p > n)
                    continue;
                for (int q = (p * p - 3) / 2; q <= h; q += p)
                    isnp[q >> 5] |= 1 << q;
            }
        }

        return Arrays.copyOf(ret, pos);
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
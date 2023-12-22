import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = ni();
        }
        int left = 0;
        int right = 1000000000;
        while(right-left>1){
            int mid = (left+right)/2;
            if(func(a,mid,n)>=Math.max((long)n*(n+1)/4,1)){
                left = mid;
            }
            else right = mid;
        }
        out.println(left);
    }

    long func(int[] a, int x, int n){
        int[] cum = new int[n+1];
        for(int i = 0; i < n; i++){
            if(a[i]>=x) cum[i+1] = cum[i]+1;
            else cum[i+1] = cum[i]-1;
        }
        BIT bit = new BIT(2*n+1);
        long ret = 0;
        bit.accumlate(n,1);
        for(int i = 0; i < n; i++){
            ret += bit.sum(0,cum[i+1]+n+1);
            bit.accumlate(cum[i+1]+n,1);
        }
        // out.println(x+" "+ret);
        return ret;
    }

    class BIT {
        private int n;
        private long[] bit;
        public BIT(int n) {
            this.n = n;
            bit = new long[n+1];
        }

        public void accumlate(int index,long num) {
            index++;
            while(index<=n) {
                bit[index] += num;
                index+=index&-index;
            }
        }

        /* [begin , end) */
        public long sum(int begin,int end) {
            return sum(end) - sum(begin);
        }

        private long sum(int i) {
            long s = 0;
            while(i>0) {
                s+=bit[i];
                i-=i&-i;
            }
            return s;
        }

        public long get(int index) {
            return sum(index,index+1);
        }

        public void set(int index,long num) {
            accumlate(index,num-(sum(index)-sum(index-1)));
        }

        public String toString() {
            long[] value = new long[n];
            for(int i=0;i<n;i++) {
                value[i] = get(i);
            }
            return Arrays.toString(value);
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

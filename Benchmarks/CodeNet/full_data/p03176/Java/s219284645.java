import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] h = in.ni(n);
        long[] a = in.nl(n);
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) p[i] = new Pair(h[i], a[i], i);
        Arrays.sort(p);

        SegmentTree seg = new SegmentTree(new long[n]);
        for(Pair pair: p) seg.update(pair.index, pair.a + seg.query(pair.index));

        out.println(seg.query(n));
    }
    public static class SegmentTree{//区間最大
        int n; long[] dat;
        final long e = 0; //単位元
        public SegmentTree(long[] a){
            n = 1;
            int l = a.length;
            while(n < l) n *= 2;
            dat = new long[2*n-1];
            for (int i = 0; i < n; i++) dat[i+n-1] = (i<l)?a[i]:e;
            for (int i = n-2; i >= 0; i--) dat[i] = Math.max(dat[2*i+1], dat[2*i+2]);
        }
        void update(int k, long x){ //dp[k](=dat[k+n-1])をxに置き換える
            k += n-1;
            dat[k] = x;
            while(k>0){
                k = (k-1)/2; //kの親
                dat[k] = Math.max(dat[2*k+1], dat[2*k+2]);
            }
        }
        long query(int b){ //[0,b)の最大を探す
            return query(0, b, 0, 0, n);
        }
        private long query(int a, int b, int k, int l, int r){
            if(r<=a||b<=l) return e;
            if(a<=l&&r<=b) return dat[k];
            else{
                long dat_l = query(a, b, 2*k+1, l, (l+r)/2);
                long dat_r = query(a, b, 2*k+2, (l+r)/2, r);
                return Math.max(dat_l, dat_r);
            }
        }
    }
    public static class Pair implements Comparable<Pair>{
        int h; long a; int index;
        public Pair(int x, long y, int i){
            this.h = x; this.a = y; this.index = i;
        }
        @Override
        public int compareTo(Pair o) {
            return Integer.compare(h, o.h);
        }
    }

    public static void main(String[] args) throws Exception{
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public Double nd(){
            return Double.parseDouble(ns());
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}
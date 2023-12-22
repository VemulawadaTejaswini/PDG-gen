import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), k = in.ni();
        int[] a = in.ni(n);
        Arrays.sort(a);
        long ans = 0;
        long x = 1;
        for (int i = 0; i < n; i++) {
            if(i<n-1&&a[i]==a[i+1]){
                x++;
            }else{
                long y = i-x+1, z = n-i-1;
                ans += ((comb(x+y,k)-comb(y,k))*a[i])%mod;
                ans %= mod;
                ans -= ((comb(x+z,k)-comb(z,k))*a[i])%mod;
                ans %= mod;
                x = 1;
            }
        }
        out.println(ans);
    }
    public static long comb(long a, long b){
        if(a < b) return 0;
        long res = 1;
        long inv = pow(fact(Math.min(b, a-b)), mod-2);
        for(long i = a; i > a - Math.min(b, a-b); i--) {
            res *= i;
            res %= mod;
        }
        res *= inv;
        res %= mod;
        return res;
    }
    public static long pow(long x, long n){
        long res = 1;
        while(n > 0){
            if ((n & 1) == 1) {
                res *= x;
                res %= mod;
            }
            x *= x;
            x %= mod;
            n >>= 1;
        }
        return res;
    }
    public static long fact(long n){
        long res = 1;
        while(n > 0){
            res *= n;
            res %= mod;
            n--;
        }
        return res;
    }

    public static void main(String[] args){
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
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
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
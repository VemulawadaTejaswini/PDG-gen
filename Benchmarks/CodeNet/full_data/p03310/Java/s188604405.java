import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long[] a = in.nl(n);
        for (int i = 1; i < n; i++) a[i] += a[i-1];
        long min = INF;
        for (int i = 1; i < n - 2; i++) {
            int l = -1, r = i;
            long max_l, max_r, min_l,min_r;
            while(r-l>1){
                int mid = (l+r)/2;
                if(a[mid]>a[i]-a[mid]){
                    r = mid;
                }else if(a[i]-a[mid]>a[mid]){
                    l = mid;
                }else{
                    l = mid;
                    r = mid;
                    break;
                }
            }
            if(l==r){
                max_l = a[l];
                min_l = max_l;
            }else if(l==-1){
                max_l = a[0];
                min_l = a[i]-a[0];
            }else if(r==i){
                max_l = a[i]-a[i-1];
                min_l = a[i-1];
            }else{
                if(a[i]<a[l]+a[r]){
                    max_l = a[i]-a[l];
                    min_l = a[l];
                }else{
                    max_l = a[r];
                    min_l = a[i]-a[r];
                }
            }

            l = i; r = n-1;
            while(r-l>1){
                int mid = (l+r)/2;
                if(a[mid]-a[i]>a[n-1]-a[mid]){
                    r = mid;
                }else if(a[mid]-a[i]<a[n-1]-a[mid]){
                    l = mid;
                }else{
                    l = mid;
                    r = mid;
                    break;
                }
            }
            if(l==r){
                max_r = a[l]-a[i];
                min_r = max_l;
            }else if(l==i){
                max_r = a[i+1]-a[i];
                min_r = a[n-1]-a[i+1];
            }else if(r==n-1){
                max_r = a[n-1]-a[n-2];
                min_r = a[n-2]-a[i];
            }else{
                if(a[i]+a[n-1]<a[l]+a[r]){
                    max_r = a[n-1]-a[l];
                    min_r = a[l]-a[i];
                }else{
                    max_r = a[r]-a[i];
                    min_r = a[n-1]-a[r];
                }
            }
            min = Math.min(min, Math.abs(Math.max(max_r,max_l)-Math.min(min_l,min_r)));
        }
        out.println(min);
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
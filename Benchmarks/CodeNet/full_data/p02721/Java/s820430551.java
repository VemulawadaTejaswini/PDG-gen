import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), k = in.ni(), c = in.ni();
        char[] s = in.ns().toCharArray();
        int[] front = new int[n];
        int[] front2 = new int[n];
        int[] back = new int[n];
        boolean[] ans = new boolean[n];
        Arrays.fill(ans,true);
        if(n==1){
            out.println(1);
        }else{
            int count = 0, last = 0;
            for (int i = 0; i < n; i++) {
                if(last > 0){
                    front[i] = count;
                    last--;
                }else{
                    if(s[i]=='x') {
                        front[i] = count;
                    }else if(s[i]=='o'){
                        count++;
                        front[i] = count;
                        last = c;
                    }
                }
                front2[i] = last;
            }
            back[0] = front[n-1];
            back[n-1] = (s[n-1]=='o')?1:0;
            for (int i = n-2; i > 0; i--) {
                if(s[i]=='o') back[i]++;
                if(i+c+1<n) back[i] += back[i+c+1];
                back[i] = Math.max(back[i+1], back[i]);
            }
            ans[0] = back[1]<k;
            ans[n-1] = front[n-2]<k;
            for (int i = 1; i < n-1; i++) {
                if(front2[i-1]==0) ans[i] = front[i-1]+back[i+1]<k;
                else if(i+front2[i-1]<n) ans[i] = front[i-1]+back[i+front2[i-1]]<k;
                else if(i+front2[i-1]+1>=n) ans[i] = front[i-1]<k;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if(ans[i]) sb.append(i+1+"\n");
            }
            out.println(sb);
        }
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
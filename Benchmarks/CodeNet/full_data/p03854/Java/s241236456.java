import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        String s = in.ns();
        int i = 0;
        boolean flag = true;
        while(i < s.length()){
            if(i+4>=s.length()){
                flag = false;
                break;
            }else{
                if(s.substring(i,i+5).equals("dream")){
                    if(i+6>=s.length()) i += 5;
                    else if(s.substring(i+5,i+7).equals("er")){
                        if(i+10>s.length()) i += 7;
                        else if(s.substring(i+5,i+10).equals("erase")) i += 5;
                    }else i += 5;
                }else if(s.substring(i, i+5).equals("erase")){
                    if(i+5>=s.length()||s.charAt(i+5)!='r') i+= 5;
                    else if(s.charAt(i+5)=='r') i += 6;
                }else{
                    flag = false;
                    break;
                }
            }
        }
        out.println(flag?"YES":"NO");
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
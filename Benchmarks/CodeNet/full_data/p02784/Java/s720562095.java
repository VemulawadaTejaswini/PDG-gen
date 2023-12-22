
import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int h = in.ni();
        int n = in.ni();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += in.ni();
        }
        out.println(sum>=h?"Yes":"No");
    }

    public static void main(String[] args) throws Exception{
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private String[] line;
        private int len, cur;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            line = null;
            len = cur = 0;
        }
        public String ns(){
            if(line== null || cur==len){
                try{
                    line = br.readLine().split(" ");
                    len = line.length;
                    cur = 0;
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            if(cur < len){
                return line[cur++];
            }
            return null;
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

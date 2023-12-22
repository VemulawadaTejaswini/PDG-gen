import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = in.ns().toCharArray();
        }
        int[][] lightL = new int[h][w];
        int[][] lightR = new int[h][w];
        int[][] lightU = new int[h][w];
        int[][] lightD = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if(map[i][j]=='#'||map[i][j-1]=='#'){
                    lightL[i][j] = 0;
                }else{
                    lightL[i][j] = lightL[i][j-1]+1;
                }
                if(map[i][w-j-1]=='#'||map[i][w-j]=='#'){
                    lightR[i][w-j-1] = 0;
                }else{
                    lightR[i][w-j-1] = lightR[i][w-j]+1;
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 1; j < h; j++) {
                if(map[j][i]=='#'||map[j-1][i]=='#'){
                    lightU[j][i] = 0;
                }else{
                    lightU[j][i] = lightU[j-1][i]+1;
                }
                if(map[h-j-1][i]=='#'||map[h-j][i]=='#'){
                    lightD[h-j-1][i] = 0;
                }else{
                    lightD[h-j-1][i] = lightD[h-j][i]+1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(map[i][j]=='.'){
                    max = Math.max(max, lightL[i][j]+lightR[i][j]+lightU[i][j]+lightD[i][j]+1);
                }
            }
        }
        out.println(max);
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
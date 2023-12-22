import java.io.*;
import java.util.*;


public class Main{
    static long [][] memo;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;
        Main sol = new Main();
        while(t -- > 0)
        {
            int n = sc.nextInt();
            memo = new long[n][n];
            Integer a[][] = new Integer[n][2];
            long res = 0l;
            for(int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = i;
            }
            Arrays.sort(a, (a1, a2) -> a1[0] - a2[0]);
            res = solve(a, 0, n- 1);
            //for(int ii = 0; ii < n; ii++) System.out.println(Arrays.toString(memo[ii]));
            out.println(res);
        }
        out.close();
    }
    public static long solve(Integer[][] a, int lo, int hi){
        if(lo > hi) return 0l;
        if(memo[lo][hi] > 0) return memo[lo][hi];
        int n = a.length,  ind = hi - lo;
        long res = Math.max(solve(a, lo + 1, hi) + Math.abs(lo - a[ind][1]) * a[ind][0],
                solve(a, lo, hi - 1) + Math.abs(hi - a[ind][1]) * a[ind][0]);
        return memo[lo][hi] = res;
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}

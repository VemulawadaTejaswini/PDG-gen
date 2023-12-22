import java.io.*;
import java.util.*;


public class Main{
    static long MOD = 1000000007;
    static long dp[] = new long[1 << 21];
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;
        while(t -- > 0)
        {
            int n = sc.nextInt(), m = sc.nextInt(), res = 0, sum = 0;
            int [] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            for(int aa : a)
                if(4 * m * aa >= sum)
                    res++;
            if(res >= m) out.println("Yes");
            else out.println("No");
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();
    }
    public static int solve(int x, int[] a){
        int max = 0, n = a.length - 1;
        for(int i = 1; i <= n; i++)
            if(a[i] > max) max = a[i];
        return 0;
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
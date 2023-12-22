import java.io.*;
import java.util.*;


public class Main{
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
            Long a[] = new Long[n];
            long res = 0l;
            for(int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            for(int i = 0; i < n; i++)
                res = Math.max(res, solve(a, i));
            out.println(res);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();
    }
    public static Long solve(Long[] a, int k){
        int n = a.length;
        long res = 0l;
        for(int i = 0; i <= k; i ++) res -= a[i] * i;
        for(int i = k + 1; i < n; i ++) res += a[i] * i;
        Long a1[] = new Long[k + 1];
        Long a2[] = new Long[n - k - 1];
        for(int i = 0; i <= k; i ++) a1[i] = a[i];
        for(int i = k + 1; i < n; i ++) a2[i - k - 1] = a[i];
        Arrays.sort(a1);
        Arrays.sort(a2, (n1, n2) -> (int)(n2 - n1));
        for(int i = 0; i <= k; i ++) res += (n - k - 1 + i) * a1[i];
        for(int i = 0; i < n - k - 1; i ++) res -= i * a2[i];
        return res;
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
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
           double r = sc.nextDouble();
            out.println(2 * r * Math.PI);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();
    }
    public String solve(String N){

        char [] c= N.toCharArray();
        int n = c.length;
        char [] c1 = new char[n], c2 = new char[n];
        for(int i = 0; i < n; i++)
        {
            c1[i] = (char)(c[i] - 1);
            if(c[i] == '4') {
                c2[i] = '1';
            }
            else c1[i]++;
        }
        boolean met = false;
        for(int i = 0; i < n; i++)
        {
            if(met) {
                if (c2[i] < '0')
                    c2[i] = '0';
            }
            else if(c2[i] > '0')
                met = true;
        }
        return new String(c1) + new String(c2).trim();
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
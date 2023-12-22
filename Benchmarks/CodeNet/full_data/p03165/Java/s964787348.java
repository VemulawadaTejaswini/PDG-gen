import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;
        while(t -- > 0)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            char [] c1 = s1.toCharArray(), c2 = s2.toCharArray();
            int n = c1.length, m = c2.length, dp[][] = new int[n + 1][m + 1];
            for(int i = 1; i <= n; i++)
                for(int j = 1; j <= m; j++) {
                    if (c1[i - 1] == c2[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1;
                    else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            int i = n, j = m, k = dp[i][j];
            StringBuilder sb = new StringBuilder();
            while(k > 0)
            {
                if(dp[i][j] - dp[i - 1][j - 1] == 1) {
                    sb.append(c1[i - 1]);
                    k--;
                }
                i--;
                j--;
            }
            out.println(sb.reverse().toString());
            //for(int i = 0; i <= n; i++) System.out.println(Arrays.toString(dp[i]));

        }

        out.close();

        /*
        int n      = sc.nextInt();        // read input as integer
        long k     = sc.nextLong();       // read input as long
        double d   = sc.nextDouble();     // read input as double
        String str = sc.next();           // read input as String
        String s   = sc.nextLine();       // read whole line as String

        int result = 3*n;
        out.println(result);                    // print via PrintWriter
        */
        // Stop writing your solution here. -------------------------------------
        out.close();
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
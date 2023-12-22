import java.io.*;
import java.util.*;


public class Main{
    static long MOD = 1000000007;
    static int [][] dp = new int[201][201];
    static ArrayList<Integer>[] fac;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------

        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0)
        {
            int n = sc.nextInt(), k = n / 2;

            long [] a = new long[n + 1];
            long [][] dp = new long [n + 1][3];

            for(int i = 1; i <= n; i++) a[i] = sc.nextLong();
            if(n == 2)
            {
                out.println(Math.max(a[1], a[2]));
            }
            else {
                for (int i = 1; i < 2 * k; i++) {
                    if (i % 2 == 1) dp[i][0] = dp[i - 1][0] + a[i];
                    else dp[i][0] = dp[i - 1][0];
                }
                dp[2][1] = a[2];
                for (int i = 4; i <= n; i += 2)
                    dp[i][1] = a[i] + Math.max(dp[i - 3][0], dp[i - 2][1]);
                long max = Math.max(dp[2 * k - 1][0], dp[2 * k][1]);
                dp[3][2] = a[3];
                if (n % 2 == 1) {
                    for (int i = 5; i <= n; i += 2)
                        dp[i][2] = a[i] + Math.max(Math.max(dp[i - 3][1], dp[i - 2][2]), dp[i - 4][0]);
                    max = Math.max(max, dp[n][2]);
                }

/*
            for(int i = 0; i <= n; i++)
            {
                System.out.print(dp[i][0] + " ");

            }
            System.out.println("");
            for(int i = 0; i <= n; i++)
            {
                System.out.print(dp[i][1] + " ");
            }
            System.out.println("");
            for(int i = 0; i <= n; i++)
            {
                System.out.print(dp[i][2] + " ");

            }
            System.out.println("");*/
                out.println(max);
            }
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
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
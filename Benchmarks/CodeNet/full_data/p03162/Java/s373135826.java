import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        //out.println("AMAN");

        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int dp[][] = new int[n][3];
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];

        for(int i=1;i<n;i++) {
            for(int j=0;j<3;j++) {
                for(int k=0;k<3;k++) {
                    if(j==k) continue;
                    if(k==0) dp[i][k] = Math.max(dp[i][k],dp[i-1][j]+a[i]);
                    else if(k==1) dp[i][k] = Math.max(dp[i][k],dp[i-1][j]+b[i]);
                    else dp[i][k] = Math.max(dp[i][k],dp[i-1][j]+c[i]);
                }
            }
        }
        int res = dp[n-1][0];
        res = Math.max(res,dp[n-1][1]);
        res = Math.max(res,dp[n-1][2]);
        out.println(res);
        out.flush();
        out.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
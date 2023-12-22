import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        //out.println("AMAN");

        int n = sc.nextInt();
        int[][] hap = new int[n][4];

        for(int i=0;i<n;i++) {
            hap[i][1] = sc.nextInt();
            hap[i][2] = sc.nextInt();
            hap[i][3] = sc.nextInt();
        }
        int dp[][] = new int[n][2];
        if(hap[0][1]>hap[0][2] && hap[0][1]>hap[0][3]) {
            dp[0][0] = hap[0][1];
            dp[0][1] = 1;
        }
        else if(hap[0][2]>hap[0][3]) {
            dp[0][0] = hap[0][2];
            dp[0][1] = 2;
        }
        else {
            dp[0][0] = hap[0][3];
            dp[0][1] = 3;
        }
        for(int i=1;i<n;i++) {
            for(int j=1;j<4;j++) {
                if(dp[i-1][1]==j) continue;
                if(dp[i][0]<dp[i-1][0]+hap[i][j]) {
                    dp[i][0] = dp[i-1][0] + hap[i][j];
                    dp[i][1] = j;
                }
            }
        }
        out.println(dp[n-1][0]);
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
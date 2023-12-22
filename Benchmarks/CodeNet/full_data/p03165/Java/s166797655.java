import java.io.*;
import java.util.StringTokenizer;

public class LCS {

    static int n;
    static int m;
    static int L[][] = new int[m+1][n+1];
    static StringBuilder str = new StringBuilder("");
    static int[][] dp;
    static char[] X;
    static char[] Y;

    static void lcs() {

        for (int i = 0; i <= m ; i++) {
            for (int j = 0; j <= n ; j++) {

                if (i==0 || j==0)
                    dp[i][j]=0;
                else if (X[i-1]==Y[j-1])
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

    }
    static void trace(){
        int i = m;
        int j = n;

        while (i>0&&j>0){

            if (X[i-1]==Y[j-1]){
                str.append(X[i-1]);
                i--;
                j--;
            }else {
                if (dp[i-1][j]>dp[i][j-1])
                    i--;
                else
                    j--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        n=s2.length();
        m=s1.length();
        dp=new int[m+1][n+1];
        X=s1.toCharArray();
        Y=s2.toCharArray();

        lcs();
        trace();

        System.out.println(dp[m][n]);
        System.out.println(str.reverse());
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String file) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(file));
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

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

}


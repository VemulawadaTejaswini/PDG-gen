
import java.io.*;
import java.util.* ;

public class Main{

    static int h,v ;
    static char [][] a ;
    static long dp[][] ;

    static long dp (int i , int j ){

        if( i>=h || j>=v || a[i][j]=='#'){
            return 0 ;
        }
        if (i==h-1 && j==v-1)
            return 1 ;
        else{

            if (dp[i][j]==0)
                return dp[i][j] = dp(i+1,j) + dp(i,j+1) ;
            return dp[i][j] ;
        }
    }

    public  static void main (String args [] ) throws IOException ,InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.nextLine();
        String z [] = s.split(" ");
        h = Integer.parseInt(z[0]) ;
        v = Integer.parseInt(z[1]) ;
        a = new char[h][v] ;
        dp = new long [h][v] ;
        for (int i =0 ; i < h ;i ++  ) {
            String b = sc.nextLine() ;
            for (int j = 0 ; j < v ;  j ++ )
              a[i][j] = b.charAt(j) ;
           // Arrays.fill(dp[i],-1);
        }

        pw.println(dp(0,0)%(1000000007));

        pw.close();
    }
     static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public Scanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }
    }
}

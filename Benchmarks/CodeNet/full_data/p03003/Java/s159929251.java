import java.io.*;
import java.util.*;

public class  Main{
    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]a=new int[n+1];
        int[]b=new int[m+1];
        for(int i=1;i<=n;i++)a[i]=sc.nextInt();
        for(int i=1;i<=m;i++)b[i]=sc.nextInt();
        long[][]dp=new long[n+1][m+1];
        int mod=(int)1e9+7;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=m;j++) {
        		dp[i][j]=(dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1])%mod;
        		if(a[i]==b[j]) {
        			dp[i][j]=(1+dp[i-1][j-1]+dp[i][j])%mod;
        		}
        	}
        }
        pw.println(1+dp[n][m]);
        pw.flush();
    }
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
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
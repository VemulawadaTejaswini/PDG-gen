import java.io.*;
import java.util.*;
class Main {
	
	BufferedReader in;
	PrintWriter ob;
	StringTokenizer st;
	
	public static void main(String args[]) throws IOException {
		new Main().run();
	}
	void run() throws IOException {
		in = new BufferedReader( new InputStreamReader( System.in ) );
		ob = new PrintWriter( System.out );
		solve();
		ob.flush();
	}
	
	void solve() throws IOException {
		int n = ni();
		int a[][] = new int[n+1][4]; 
		for(int i=1 ; i<=n ; i++) {
			a[i][1] = ni();
			a[i][2] = ni();
			a[i][3] = ni();
		}
		
		if( n<=0 ) {
			ob.println("0");
			return;
		}
		
		long dp[][] = new long[n+1][4];
		dp[1][1] = a[1][1];
		dp[1][2] = a[1][2];
		dp[1][3] = a[1][3]; 
		for(int i=2 ; i<=n ; i++) {
			dp[i][1] =  a[i][1] + Math.max( dp[i-1][2] , dp[i-1][3] );
			dp[i][2] =  a[i][2] + Math.max( dp[i-1][1] , dp[i-1][3] );
			dp[i][3] =  a[i][3] + Math.max( dp[i-1][1] , dp[i-1][2] );
		}
			
		ob.println( Math.max( dp[n][1] , Math.max( dp[n][2] , dp[n][3] )  ) );
	}
	
	int ni() throws IOException {
		return Integer.parseInt( nextToken() );
	}
	
	String nextToken() throws IOException {
		if( st == null || !st.hasMoreTokens() )
			st = new StringTokenizer(in.readLine());
		return st.nextToken();
	}
}
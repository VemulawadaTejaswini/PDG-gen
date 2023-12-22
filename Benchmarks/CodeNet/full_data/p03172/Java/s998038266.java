import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int m=1000000007;
	public static long Solve(int a[],int k) {
		int n=a.length;
		long dp[][]=new long[n][k+1];
		for(int i=0;i<=k;i++) {
			if(i>a[0]) break;
			else dp[0][i]=1;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<=k;j++) {
				if(j==0) dp[i][j]=dp[i-1][j];
				else dp[i][j]=(dp[i-1][j]%m+dp[i][j-1]%m-(j>=a[i]+1?dp[i-1][j-1-a[i]]:0)%m+m)%m;
			}
		}
		return dp[n-1][k];
		
	}
	public static void main(String[] args) {
	FastScanner sc=new FastScanner();
	int n=sc.nextInt(),k=sc.nextInt();
	int a[]=sc.readArray(n);
	long ans=Solve(a, k);
	System.out.println(ans);

	}


	static class FastScanner{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}
	

}



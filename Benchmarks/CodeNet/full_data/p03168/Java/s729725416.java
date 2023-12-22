

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String[] args) {
		FastScanner scanner=new FastScanner();
		int n=scanner.nextInt();
		double a[]=new double[n];
		for(int i=0;i<n;i++) a[i]=scanner.nextDoubel();
		double dp[][]=new double[n+1][n+1];
		dp[0][0]=1;
		for(int i=1;i<=n;i++) {
			dp[i][0]=dp[i-1][0]*(1-a[i-1]);
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				dp[i][j]=dp[i-1][j-1]*a[i-1]+dp[i-1][j]*(1-a[i-1]);
			}
		}
		double ans=0;
		for(int i=(n+1)/2;i<=n;i++)
			ans+=dp[n][i];
		
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
		double nextDoubel() {
			return Double.parseDouble(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}

}

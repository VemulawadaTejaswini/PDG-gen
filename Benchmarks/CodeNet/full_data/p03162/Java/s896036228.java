import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class B {

	public static class pair implements Comparable<pair> {
		int id;
		int ans;

		pair(int x, int y) {

			id = x;
			ans = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.id - o.id;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int ar[][];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
			int n=sc.nextInt();
			
			ar=new int[n+1][4];
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=3;j++)
				ar[i][j]=sc.nextInt();
			}
		
		System.out.println(solve(n));
		}

	}
	
	static long solve(int n) {
		long dp[][]=new long[n+1][4];
		dp[0][0]=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=3;j++) {
				long sum=Integer.MIN_VALUE;
				for(int k=1;k<=3;k++) {
					if(k!=j)sum=Math.max(sum,dp[i-1][k]);
					
				}
				dp[i][j]=ar[i][j]+sum;
			}
		}
		
		return Math.max(dp[n][1], Math.max(dp[n][2], dp[n][3]));
		
	}


}
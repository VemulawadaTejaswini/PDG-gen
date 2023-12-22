import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

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
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			ar=new int[n];
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
			}
		
		System.out.println(solve(n,k));
		}

	}
	
	static long solve(int n,int k) {
		long dp[]=new long[n+1];
		dp[0]=0;
		dp[2]=Math.abs(ar[1]-ar[0]);
		for(int i=3;i<=n;i++) {
			int l=Math.min(k, i-1);
			dp[i]=Long.MAX_VALUE;
			for(int j=1;j<=l;j++) {
				dp[i]=Math.min(dp[i], dp[i-j]+Math.abs(ar[i-1]-ar[i-j-1]));
			}
		}
		return dp[n];
		
	}


}

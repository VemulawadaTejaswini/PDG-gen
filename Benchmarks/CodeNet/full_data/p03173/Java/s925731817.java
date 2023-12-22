import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static long dp[][];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
		
			int n=sc.nextInt();
			ar=new int[n];
			long sum=0;
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
				sum+=ar[i];
			}
			dp=new long[n][n];
			long ans=solve(0,n-1);
			
			
			System.out.println(ans);
			
		}

		System.out.println(out);
	}
	
	static long solve(int i,int j) {
		if(i==j) {
			return 0;
		}
		if(dp[i][j]!=0)return dp[i][j];
		long sum=0;
		for(int k=i;k<=j;k++) {
			sum+=ar[k];
		}
		long ans=(long)1e18;
		for(int k=i;k<j;k++) {
			
		long 	ans1=solve(i,k)+solve(k+1,j)+sum;
		if(ans1<ans)ans=ans1;
		}
		return dp[i][j]= ans;
		
	}


}

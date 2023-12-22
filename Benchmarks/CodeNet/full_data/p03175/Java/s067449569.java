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
	static int[][] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static long dp[][];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
		
			int n=sc.nextInt();
			gr=new ArrayList[n];
			for(int i=0;i<n;i++) {
				gr[i]=new ArrayList<>();
			}
			
			for(int i=0;i<n-1;i++) {
				int u=sc.nextInt();
				int v=sc.nextInt();
				u--;
				v--;
				gr[u].add(v);
				gr[v].add(u);
			}
			long ans=0;
			dp=new long[n][2];
			ans+=solve(0,-1,0);
			ans+=solve(0,-1,1);
			System.out.println(ans%mod);
			
		}

		System.out.println(out);
	}
	static int set;
	static long solve(int root,int pa,int c) {
		
		
		long res=1;
		if(dp[root][c]!=0)return dp[root][c];
		for(Integer ch: gr[root]) {
			long ans=0;
			if(ch==pa)continue;
			
				ans+=solve(ch,root,1);
			
			if(c==1) {
				ans+=solve(ch,root,0);
			}
			ans%=mod;
			res*=ans;
			res%=mod;
		}
		return dp[root][c]=res%mod;
		
		
	}


}
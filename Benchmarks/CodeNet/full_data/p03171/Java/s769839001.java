
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static class Pair{
		long x;
		long y ;
		public Pair(long x,long y) {
			this.x=x;
			this.y=y;
		}
		public long diff() {
			return this.x-this.y;
		}
	}
	
	public static void solve() {
		int n=s.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
		}
		memo=new Pair[n+1][n+1];
		out.println(Best(arr,0,n-1,false).diff());
//		int start = 0;
//		int end = n-1;
//		Pair[][] dp = new Pair[n+1][n+1];
//		dp[0][0]=new Pair(0,0);
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=n-i;j++) {
//				if(!(i==j && j==0)) {
//					Pair up = i-1>=0?dp[i-1][j]:null;
//					Pair down = j-1>=0?dp[i][j-1]:null;
//					long front = start+i-1>=0?arr[start+i-1]:0;
//					long left = end-j+1<n?arr[end-j+1]:0;
//					if(((i+j)&1)==1) {
//						Pair tempans;
//						if(up==null) {
//							tempans = new Pair(down.x+left,down.y);
//						}
//						else if(down == null) {
//							tempans = new Pair(up.x+front,up.y);
//						}
//						else if(up.diff()+front>down.diff()+left) {
//							tempans = new Pair(up.x+front,up.y);
//						}else {
//							tempans = new Pair(down.x+left,down.y);
//						}
//						dp[i][j]=tempans;
//					}else {
//						Pair tempans ;
//						if(up == null) {
//							tempans = new Pair(down.x,down.y+left);
//						}
//						else if(down == null) {
//							tempans = new Pair(up.x,up.y+front);
//						}
//						else if(up.diff()-front<down.diff()-left) {
//							tempans = new Pair(up.x,up.y+front);
//						}else {
//							tempans = new Pair(down.x,down.y+left);
//						}
//						dp[i][j]=tempans;
//					}
//				}
//			}
//		}
//		out.println(dp[n][0].diff());
	}
	
	public static Pair[][] memo;
	
	public static Pair Best(long[] arr,int start,int end,boolean chance) {//false for first and true for second
		if(start>end) {
			return null;
		}
		if(start<0 || end<0 ) {
			return null;
		}
		if(start==end) {
			if(chance) {
				memo[start][end]=new Pair(0,arr[start]);
				return memo[start][end];
			}else {
				memo[start][end]=new Pair(arr[start],0);
				return memo[start][end];
			}
		}
		if(memo[start][end]!=null) {
			return memo[start][end];
		}
		Pair tempans;
		if(chance) {
			Pair left = Best(arr,start+1,end,!chance);
			Pair right = Best(arr,start,end-1,!chance);
			if(left==null) {
				tempans= new Pair(right.x,right.y+arr[end]);
			}else if(right == null) {
				tempans = new Pair(left.x,left.y+arr[start]);
			}else {
				Pair left_=new Pair(left.x,left.y+arr[start]);
				Pair right_=new Pair(right.x,right.y+arr[end]);
				if(left_.diff()>right_.diff()) {
					tempans = right_;
				}else {
					tempans = left_;
				}
			}
		}else {
			Pair left = Best(arr,start+1,end,!chance);
			Pair right = Best(arr,start,end-1,!chance);
			if(left==null) {
				tempans= new Pair(right.x+arr[end],right.y);
			}else if(right == null) {
				tempans = new Pair(left.x+arr[start],left.y);
			}else {
				Pair left_=new Pair(left.x+arr[start],left.y);
				Pair right_=new Pair(right.x+arr[end],right.y);
				if(left_.diff()<right_.diff()) {
					tempans = right_;
				}else {
					tempans = left_;
				}
			}
		}
		memo[start][end]=tempans;
		return memo[start][end];
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}

import java.util.*;
import java.io.*;
public class Main {
	
	static int []w,v;
	static int n,s;
	static int [][]dp;
	public static int dp(int index,int remw) {
		
		if(remw<0) 
			return -(int)1e9;
		
		if(index==n) 
			return 0;
		
		
		
		if(dp[index][remw]!=-1) 
			return dp[index][remw];
		
		int take=v[index]+dp(index+1,remw-w[index]);
		int  leave=dp(index+1,remw);
		return dp[index][remw]=Math.max(take,leave);
		
	}
	public static void print(int []x) {
		for(int a:x) {
			System.out.print(a+" ");
		}
	}
	public static void main (String []args) throws IOException {
		
		Scanner sc=new Scanner (System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		n=sc.nextInt();
		s=sc.nextInt();
		w=new int[n];
		v=new int[n];
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
			
		}
		
//		print(w);
//		System.out.println();
//		print(v);
//		v=sc.nextIntArr(n);
//		w=sc.nextIntArr(n);
		




		dp=new int [n+1][s+1];
		for(int[]x:dp) {
			Arrays.fill(x,-1);
		}
//		for (int i = n-1;i>=0;i-=1000 ) {
//			for(int j=0;j<s+1;j+=1000) {
//				dp(i,j);
//			}
//		}
		pw.println(dp(0,s));
		pw.close();
		

	}
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
	}
		
	}
	
	
	
	
	
	
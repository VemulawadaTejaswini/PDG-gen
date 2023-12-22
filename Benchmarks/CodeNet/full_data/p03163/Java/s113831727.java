
import java.io.*;
import java.util.*;

public class Main{

	static long [][]memo;
	static int n,W;
	static int []w,v;
	static long dp(int idx,int rem) {
		if(idx==n)
			return 0;
		if(memo[idx][rem]!=-1)
			return memo[idx][rem];
		long ans=dp(idx+1,rem);
		if(w[idx]<=rem)
			ans=Math.max(ans, dp(idx+1,rem-w[idx])+v[idx]);
		return memo[idx][rem]=ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		n=sc.nextInt();
		W=sc.nextInt();
		w=new int [n];
		v=new int [n];
		memo=new long [n][W+1];
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
			Arrays.fill(memo[i], -1);
		}
		
		
		out.println(dp(0, W));
		
		out.close();

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}

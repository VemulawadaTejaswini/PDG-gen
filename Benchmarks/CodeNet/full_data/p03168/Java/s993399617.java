
import java.io.*;
import java.util.*;

public class Main{

	static int n;
	static double []p;
	static double[][]memo;
	static double dp(int h,int t) {
		int idx=h+t;
		if(idx==n)
			return h>t?1:0;
		if(memo[h][t]!=-1)
			return memo[h][t];
		double ans=p[idx]*dp(h+1,t)+(1-p[idx])*dp(h,t+1);
		return memo[h][t]=ans;
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		n=sc.nextInt();
		p=new double[n];
		memo=new double[n+1][n+1];
		for(int i=0;i<n;i++) {
			p[i]=sc.nextDouble();
			Arrays.fill(memo[i],-1);
		}
		Arrays.fill(memo[n], -1);
		out.println(dp(0, 0));
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

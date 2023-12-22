
import java.io.*;
import java.util.*;

public class Main{

	
	static int MOD=(int)1e9+7;
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),k=sc.nextInt();
		int []a=new int [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int [][]dp=new int [n+1][k+1],pre=new int [n+1][k+1];
		pre[n][k]=dp[n][k]=1;
		for(int idx=n-1;idx>=0;idx--) {
			int sum=0;
			for(int eaten=0;eaten<=k;eaten++)
			{
				int ans=pre[idx+1][Math.min(k, eaten+a[idx])];
				if(eaten>0) {
					ans=ans-pre[idx+1][eaten-1];
					if(ans<0)
						ans+=MOD;
				}
				dp[idx][eaten]=ans;
				sum=sum+ans;
				if(sum>=MOD)
					sum-=MOD;
				pre[idx][eaten]=sum;
			}
		}
		out.println(dp[0][0]);
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

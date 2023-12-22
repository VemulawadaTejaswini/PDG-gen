
import java.io.*;
import java.util.*;

public class Main{

	
	static int MOD=(int)1e9+7;
	static int n;
	static int []memo;
	static boolean [][]a;
	static int dp(int idx,int msk) {
		if(idx==n)
			return 1;
		if(memo[msk]!=-1)
			return memo[msk];
		int ans=0;
		for(int i=0;i<n;i++)
			if(a[idx][i] && ((msk & (1<<i)) ==0))
			{
				ans=ans+dp(idx+1,msk|1<<i);
				if(ans>=MOD)
					ans-=MOD;
			}
		return memo[msk]=ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		n=sc.nextInt();
		a=new boolean[n][n];
		memo=new int [1<<n];
		Arrays.fill(memo, -1);
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt()==1;
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

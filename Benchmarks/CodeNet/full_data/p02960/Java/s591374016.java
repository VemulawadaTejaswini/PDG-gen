/*input
 
?6?42???8??2??06243????9??3???7258??5??7???????774????4?1??17???9?5?70???76???



*/
import java.io.*;
import java.util.*;

 
public class Main
{
 
	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);
	static InputStream inputStream = System.in;
	static InputReader br = new InputReader(inputStream);

	
	
	static String s;
	static int n;


	static long[][] dp;

	static long mod=1000000007;

	static long find(int i,int rem)
	{
		if(i>=n)
		{
			if(rem==5) return 1L;
			return 0L;
		}


		if(dp[i][rem]!=-1) return dp[i][rem];


		if(s.charAt(i)=='?')
		{
			long ans=0;

			for(int j=0;j<=9;j++)
			{
				ans+=find(i+1,((10*rem)+j)%13);
				ans%=mod;
			}
			return dp[i][rem]=ans;
		}
		int nr=(10*rem)+(s.charAt(i)-'0');
		nr%=13;

		return dp[i][rem]=(find(i+1,nr)%mod);
	}



	

	public static void main(String[] args)throws IOException
	{
		
 
		s=br.next();
		n=s.length();

		dp=new long[n][13];

		for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);

		out.println(find(0,0)%mod);



		

 
		out.close();
 
	}





















	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
 
		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
 
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
 
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
 
	}
	
}
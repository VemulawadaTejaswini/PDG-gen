import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args)  throws IOException { 
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		int [][]a=new int [2][n];
		for(int i=0;i<2;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		int ans=0;
		
		for(int right=0;right<n;right++)
		{
			int row=0;
			int c=0;
			for(int i=0;i<n;i++)
			{
				c+=a[row][i];
				if(i==right)
				{	
					row=1;
					c+=a[row][i];
				}	
			}
			ans=Math.max(c, ans);
		}
		System.out.println(ans);
		
		
		pw.flush();pw.close();

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream S)
		{
			br=new BufferedReader(new InputStreamReader(S));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next()  throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(nextLine());
			return st.nextToken();
		}
		public int nextInt()  throws IOException
		{
			return Integer.parseInt(next());
		}
		public double nextDouble()  throws IOException
		{
			return Double.parseDouble(next());
		}
	}
}

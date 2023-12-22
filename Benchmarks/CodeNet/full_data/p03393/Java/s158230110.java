import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
public static boolean isValid(String ans,String s)
{
	
	int []f=new int [26];
	for(int i=0;i<ans.length();i++)
		f[ans.charAt(i)-'a']++;
	for(int x:f)
		if(x>1)
			return false;
	for(char c='z';c>='a';c--)
		if(f[c-'a']==0)
			ans=ans+c;
	
	return ans.compareTo(s)>0;
	
}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		String s=sc.nextLine();
		String ans="";
		for(int i=0;i<=s.length();i++)
		{	
			if(ans.compareTo(s)>0)
				break;
			for(char c='a';c<='z';c++)
			{
				if(isValid(ans+c,s))
				{
					ans=ans+c;
				
					break;
				}
				//System.out.println(ans);
				if(c=='z')
				{
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(ans);
		
		
		
		
		
		pw.close();
		

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s)
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}

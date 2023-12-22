import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
public static char getChar(int i)
{
	if(i==-1)
		return '-';
	else return '+';
}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int []a=new int [4];
		String  s=sc.next();
		for(int i=0;i<4;i++)
			a[i]=s.charAt(i)-'0';
		
		
		int x=0;int y=0;int z=0;
		int []arr={-1,1};
		for( int i:arr)
		{	
			
			for(int j:arr)
				for( int k:arr)
				{
					
					int ans=a[0]+a[1]*i+a[2]*j+a[3]*k;
					if(ans==7)
					{
						x=i;y=j;z=k;
						break;
					}
					
				}
		}	
		System.out.print(a[0]);
		char c1=getChar(x);
		char c2=getChar(y);
		char c3=getChar(z);
		System.out.print(c1+""+a[1]+""+c2+""+a[2]+c3+""+a[3]+"=7\n");
	}
	
	

	
	
	
	
	
	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}
		
		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}
		
		public double nextDouble() throws IOException
		{
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if(x.charAt(0) == '-')
			{
				neg = true;
				start++;
			}
			for(int i = start; i < x.length(); i++)
				if(x.charAt(i) == '.')
				{
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				}
				else
				{
					sb.append(x.charAt(i));
					if(dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg?-1:1);
		}
		
		public boolean ready() throws IOException {return br.ready();}


	}
}

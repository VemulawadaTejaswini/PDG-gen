import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		
		int n = in.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++)
		{
			v[i] = in.nextInt();
		}
		
		int[] u = Arrays.copyOf(v, n);
		
		Arrays.sort(v);
		int cnt = 0;
		for(int i = 0; i < n; i++)
		{
			if(v[i] != u[i])
				cnt++;
		}
		
		if(cnt <= 2)
			out.println("YES");
		else
			out.println("NO");
		
		out.close();
	}
	
	static class InputReader
	{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		
		public InputReader(InputStream stream)
		{
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		
		public String next()
		{
			while(tokenizer == null || !tokenizer.hasMoreTokens())
			{
				try
				{
					tokenizer = new StringTokenizer(reader.readLine());
				}
				catch(IOException e)
				{
					throw new RuntimeException(e);
				}
			}
			
			return tokenizer.nextToken();
		}
		
		public int nextInt()
		{
			return Integer.parseInt(next());
		}
		
		public long nextLong()
		{
			return Long.parseLong(next());
		}
	}
}
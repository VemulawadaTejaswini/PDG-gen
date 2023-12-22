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
		int[][] a = new int[n][2];
		for(int i = 0; i < n; i++)
		{
			a[i] = in.ar(2);
		}
 
		Arrays.sort(a, (int[] x, int[] y) -> x[1] - y[1]);
		int cur = 0;
 
		for(int i = 0; i < n; i++)
		{
			cur += a[i][0];
			if(cur > a[i][1])
			{
				out.println("No");
				out.close();
				return;
			}
		}
 
		out.println("Yes");
		out.close();
	}
 
	static class InputReader
	{
		BufferedReader reader;
		StringTokenizer tokenizer;
 
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
 
		public int[] ar(int n)
		{
			int[] a = new int[n];
			for(int i = 0; i < n; i++)
				a[i] = nextInt();
 
			return a;
		}
	}
}
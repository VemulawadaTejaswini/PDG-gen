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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		
		out.close();
	}
	
	static class TaskC
	{
		void solve(int TestCase, InputReader in, PrintWriter out)
		{
			int n = in.nextInt();
			int[] data = new int[n];
			for(int i = 0; i < n; i++)
			{
				data[i] = in.nextInt();
			}
			
			int start = 0;
			int ans = 0;
			for(int i = 1; i < n; i++)
			{
				if(data[i] > data[i - 1]) start = i;
				ans = Math.max(ans, i - start);
			}
			
			out.println(ans);
		}
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
	}
}
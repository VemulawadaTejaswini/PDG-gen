import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		FastReader reader = new FastReader();
		PrintWriter writer = new PrintWriter(System.out);

		char[] s = reader.nextLine().toCharArray();
		char[] t = reader.nextLine().toCharArray();

		int n = s.length;

		boolean ans = false;
		for (int i=0; i<n; i++)
		{
			boolean temp = true;
			for (int j=0; j<n; j++)
			{
				if (s[j]!=t[(i+j)%n])
					temp = false;
			}

			ans |= temp;
		}

		if (ans)
			writer.println("Yes");
		else
			writer.println("No");
		writer.close();
	}

	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
}
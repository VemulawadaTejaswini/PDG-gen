

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main
{

	
	public static void main(String[]args)throws Throwable
	{
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		PrintWriter out = new PrintWriter(System.out);
		int len = 200;
		ArrayList<Integer> ans = new ArrayList();
		for(int i = 1 ; i <= 100 ; ++i)
		{
			long lst = 0;
			for(int j = 1 ; j <= len ; ++j)
			{
				if((1 << (j - 1)) - 1 > n)
					break;
				lst = j;
			}
			n -= (1 << lst) - 1;
			len -= lst;
			for(int k = 0 ; k < lst ; ++k)
				ans.add(i);
		}
		System.out.println(ans.size());
		for(Integer x : ans)
			System.out.print(x+" ");
		
	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;


		Scanner(InputStream s)  { br = new BufferedReader(new InputStreamReader(s)); }

		String next() throws IOException
		{

			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();

		}
		int nextInt() throws NumberFormatException, IOException { return Integer.parseInt(next()); }

		long nextLong() throws NumberFormatException, IOException { return Long.parseLong(next()); }


	}
}

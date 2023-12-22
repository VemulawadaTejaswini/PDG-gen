

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main 
{

	
	static class Entry implements Comparable<Entry>
	{
		int u,d,c,t;
		
		public Entry(int u,int d,int c,int t)
		{
			this.u = u;
			this.d = d;
			this.c = c;
			this.t = t;
		}

		@Override
		public int compareTo(Entry o) {
			
			return -1*(this.t - o.t);
		}
	}
	public static void main(String[]args)throws Throwable
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int e = sc.nextInt();
		PrintWriter out = new PrintWriter(System.out);
		int col[] = new int[n];
		ArrayList<Integer> Graph[] = new ArrayList[n];
		for(int i = 0 ; i < n ; ++i)
			Graph[i] = new ArrayList();
		for(int i = 0 ; i < e ; ++i)
		{
			int u = sc.nextInt() - 1; int v = sc.nextInt() - 1;
			Graph[u].add(v);
			Graph[v].add(u);
		}
		boolean seen[][] = new boolean[n][11];
		PriorityQueue<Entry> pq = new PriorityQueue();
		int q = sc.nextInt();
		int time = 0;
		while(q-- > 0)
		{
			int v = sc.nextInt() - 1;
			int d = sc.nextInt();
			int c = sc.nextInt();
			pq.add(new Entry(v,d,c,time++));
			
		}
		
		while(!pq.isEmpty())
		{
			Entry en = pq.poll();
			if(seen[en.u][en.d])
				continue;
			
			seen[en.u][en.d] = true;
			if(col[en.u] == 0)
			col[en.u] = en.c;
			if(en.d <= 0)
				continue;
			for(Integer v : Graph[en.u])
			{
				if(seen[v][en.d - 1])
					continue;
				pq.add(new Entry(v,en.d - 1,en.c,en.t));
			}
		}
		out.print(col[0]+"\n");
		for(int i = 1 ; i < n ; ++i)
		{
			out.print(col[i]+"\n");
		}
		
		out.flush();
		out.close();
		
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



	}
}

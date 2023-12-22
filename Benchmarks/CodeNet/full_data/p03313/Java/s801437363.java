import java.io.*;
import java.util.*;

public class Main {

	

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in); 
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int N=1<<n;
		int []a=new int [N];
		PriorityQueue<Integer>[]pq=new PriorityQueue[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			pq[i]=new PriorityQueue();
			pq[i].add(a[i]);
		}
		
		for(int k=0;k<n;k++) {
			for(int x=0;x<N;x++) {
				if((x & (1<<k))>0)
					continue;
				int z=x,z2=x|1<<k;
				for(int y:pq[z])
					pq[z2].add(y);
				while(pq[z2].size()>2)
					pq[z2].poll();
			}
			
		}
		int ans=0;
		for(int k=1;k<N;k++) {
			ans=Math.max(ans,pq[k].poll()+pq[k].poll());
			out.println(ans);
		}
		
		out.close();
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

		public boolean nextEmpty() throws IOException
		{
			String s = br.readLine();
			st = new StringTokenizer(s);
			return s.isEmpty();
		}


	}
}
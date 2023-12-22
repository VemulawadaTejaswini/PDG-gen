import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = sc.nextInt(), x[] = new int[N], y[] = new int[N];
		TreeSet<Pair> xCoords = new TreeSet<>(), yCoords = new TreeSet<>();
		for(int i = 0; i < N; ++i)
		{
			xCoords.add(new Pair(x[i] = sc.nextInt(), i));
			yCoords.add(new Pair(y[i] = sc.nextInt(), i));
		}
		long ans = 0;
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		boolean[] vis = new boolean[N];
		pq.add(new Pair(0, 0));
		while(!pq.isEmpty())
		{
			Pair u = pq.remove();
			if(vis[u.idx])
				continue;
			vis[u.idx] = true;
			ans += u.coord;
			Pair ux = new Pair(x[u.idx], u.idx), uy = new Pair(y[u.idx], u.idx);
			xCoords.remove(ux);
			yCoords.remove(uy);
			
			Pair xBefore = xCoords.floor(ux), xAfter = xCoords.ceiling(ux);
			Pair yBefore = yCoords.floor(uy), yAfter = yCoords.ceiling(uy);
			checkAndAdd(pq, vis, x, xBefore, ux);
			checkAndAdd(pq, vis, x, xAfter, ux);
			checkAndAdd(pq, vis, y, yBefore, uy);
			checkAndAdd(pq, vis, y, yAfter, uy);
		}
		out.println(ans);
		out.close();
	}
	
	static void checkAndAdd(PriorityQueue<Pair> pq, boolean[] vis,  int[] coord, Pair v, Pair u)
	{
		if(v != null && !vis[v.idx])
			pq.add(new Pair(Math.abs(coord[u.idx] - coord[v.idx]), v.idx));
	}
	
	static class Pair implements Comparable<Pair>
	{
		int coord, idx;
		
		Pair(int a, int b) { coord = a; idx = b; }
		
		public int compareTo(Pair p)
		{
			if(coord != p.coord)
				return coord - p.coord;
			return idx - p.idx;
		}
	}
		
	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public Scanner(String s) throws FileNotFoundException{	br = new BufferedReader(new FileReader(s));}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}

		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}

		public double nextDouble() throws IOException { return Double.parseDouble(next()); }

		public boolean ready() throws IOException {return br.ready();} 
	}
}
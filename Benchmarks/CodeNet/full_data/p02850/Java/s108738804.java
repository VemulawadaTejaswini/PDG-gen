import java.io.*;
import java.util.*;


public class Main {
	static LinkedList<edge>adj[];
	static int ans=0;
	static int[]p;
	static void dfs(int i,int par,int color) {
		int c=1;
		for(edge j:adj[i]) {
			if(j.v!=par) {
				if(c==color)c++;
				p[j.i]=c;
				dfs(j.v,i,c);
				c++;
			}
		}
		ans=Math.max(c-1, ans);
	}
	static class edge{
		int i,v;
		edge(int x,int u){
			v=u;i=x;
		}
	}
	public static void main(String[] args) throws Exception {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt();
		adj=new LinkedList[n];
		for(int i=0;i<n;i++) {
			adj[i]=new LinkedList<edge>();
		}
		for(int i=0;i<n-1;i++) {
			int x=sc.nextInt()-1;int y=sc.nextInt()-1;
			adj[x].add(new edge(i, y));adj[y].add(new edge(i, x));
		}
		p=new int[n-1];
		dfs(0,-1,0);
		pw.println(ans);
		for(int i:p)pw.println(i);
		pw.flush();
	}

	static class MScanner {
		StringTokenizer st;
		BufferedReader br;

		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int[] takearr(int n) throws IOException {
			int[] in = new int[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public long[] takearrl(int n) throws IOException {
			long[] in = new long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public Integer[] takearrobj(int n) throws IOException {
			Integer[] in = new Integer[n];
			for (int i = 0; i < n; i++)
				in[i] = nextInt();
			return in;
		}

		public Long[] takearrlobj(int n) throws IOException {
			Long[] in = new Long[n];
			for (int i = 0; i < n; i++)
				in[i] = nextLong();
			return in;
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
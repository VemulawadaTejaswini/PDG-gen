import java.io.*;
import java.util.*;

public class Main {

	static int MOD=(int)1e9+7;
	static int K;
	static ArrayList<Integer>[]adj;
	static long ans=1;
	static void solve(int u,int level,int sib,int p) {
		int options=K-Math.min(level,2)-sib;
		if(options<=0)
			ans=0;
		ans*=options;
		ans%=MOD;
		int newSib=0;
		for(int v:adj[u]) {
			if(v!=p) {
				solve(v,level+1,newSib++,u);
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		K=sc.nextInt();
		adj=new ArrayList[n];
		for(int i=0;i<n;i++)
			adj[i]=new ArrayList();
		for(int i=1;i<n;i++) {
			int u=sc.nextInt()-1,v=sc.nextInt()-1;
			adj[u].add(v);
			adj[v].add(u);
		}
		
		solve(0,0,0,-1);
		out.println(ans);
		out.close();

	}
	 
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}
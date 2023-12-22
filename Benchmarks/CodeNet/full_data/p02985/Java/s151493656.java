import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static final int mod=1000000007;
	public static LinkedList<Integer>[] tree;
	public static long ans=1;
	public static long k;
	public static boolean[] visited;
	
	
	public static void dfs(int current) {
		 if(current==0) {
			 ans=(ans%mod*k%mod)%mod;
			 for(int i=0;i<tree[current].size();i++) {
				 ans=(ans%mod*(k-1-i)%mod)%mod;
			 }
		 }else {
			 for(int i=0;i<tree[current].size()-1;i++) {
				 ans=(ans%mod*(k-2-i)%mod)%mod;
			 }
		 }
		 visited[current]=true;
		for(Integer x:tree[current]) {
			 	if(!visited[x])dfs(x);
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out=new PrintWriter (new BufferedOutputStream(System.out));
		FastReader s=new FastReader();
		int n=s.nextInt();
		k=s.nextInt();
		visited=new boolean[n];
		tree=new LinkedList[n];
		for(int i=0;i<n;i++)tree[i]=new LinkedList<Integer>();
		for(int i=0;i<n-1;i++) {
			int x=s.nextInt()-1;
			int y=s.nextInt()-1;
			tree[x].add(y);
			tree[y].add(x);
		}
		dfs(0);
		out.println(ans);
		out.close();
	}

	public static PrintWriter out;
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			//InputStream reads the data and decodes in character stream
			//It acts as bridge between byte stream and character stream
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
}

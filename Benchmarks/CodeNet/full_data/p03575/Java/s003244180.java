import java.io.*;
import java.math.*;
import java.util.*;
public class Main {  
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int M = I.nextInt();
		int ans = 0; //Assuming none are bridges in the beginning
		int[][] edges = new int[M][2]; 
		for (int i = 0; i < M; i++) {
			edges[i][0] =I.nextInt();
			edges[i][1] =I.nextInt();
		}
		int leave = 0;
		while (leave<M) {
			ArrayList<Integer>[] graph = new ArrayList[N+1]; //Refreshing current graph
			for (int i = 1; i <= N; i++) graph[i]=new ArrayList<Integer>();
			for (int i = 0; i < M; i++) {
				if (i!=leave) {
					int A = edges[i][0];
					int B = edges[i][1];
					graph[A].add(B);
					graph[B].add(A);
				}
			}
			if (BFS(graph,N)<N) ans++; //If one traversal didn't cover all vertices
			//(i.e bridge edge is hit)
			leave++;
		}
		O.pln(ans);
	}
	public static int BFS(ArrayList<Integer>[] graph, int N) {
		int ret = 1; //Root node included
		Queue<Integer> cur = new LinkedList<Integer>();
		cur.add(1); //Simple root
		boolean[] vis = new boolean[N+1];
		vis[1]=true;
		while (!cur.isEmpty()) {
			int size = cur.size();
			for (int i = 0; i < size; i++) {
				int node = cur.poll();
				for (int j = 0; j < graph[node].size(); j++) {
					int nbr = graph[node].get(j);
					if (!vis[nbr]) {
						vis[nbr]=true;
						cur.add(nbr);
						ret++;
					}
				}
			}
		}
		return ret;
	}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
		double nextDouble() {return Double.parseDouble(next());}
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(double x) {w.println(x);w.flush();}
		void pln(boolean x) {w.println(x);w.flush();}
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
		void p(double x) {w.print(x);w.flush();}
		void p(boolean x) {w.print(x);w.flush();}
	}
}